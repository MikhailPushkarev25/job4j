package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mikhail Pushkarev
 * @since 16.02.2021
 * @version 2.2
 *
 * В классе я создал методы добавления, замены, удаления, и пополнения счета.
 */
public class BankService {

    /**
     * Поле содержить все модели данных
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя.
     * с помощью метода putIfAbsent - так же проверяет его на null.
     * @param user - пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет данные по паспорту.
     * для начала я прохожу по по циклу поиска по номеру паспорта.
     * далее проверяю что пользователь существует,
     * создаю полный список и получаю пользователя.
     * далее добавляю счета.
     * @param passport - номер паспорта
     * @param account - счет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            list.add(account);
        }
    }

    /**
     * Метод добавляет номер пасспорта,
     * далее проходим через цикл по полю моделей,
     * в условии сравниваем номера паспорта.
     * если true то возвращаем этот номер.
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
            }
        }
        return user;
    }

    /**
     * Метод принимает паспорт и реквизиты
     * для начала я ищу номер паспорта пользователя,
     * в условию если номер нашел то создаю список и полцчаю информацию пользователя,
     * прохожу по циклу и получаю реквизиты
     * @param passport - номер паспорта
     * @param requisite - реквизиты
     * @return - возвращаем список
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account key : list) {
                key.setRequisite(requisite);
                result = key;
            }
        }
        return result;
    }

    /**
     * Метод проверяет что на счет закинули деньги
     * @param srcPassport - номер паспорта
     * @param srcRequisite - реквизиты
     * @param destPassport - номер  паспорта
     * @param destRequisite - реквизиты
     * @param amount - на счету
     * @return - вернуть true если положили на счет деньги
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null || destAccount != null && amount >= 0) {
            double src = srcAccount.getBalance() - amount;
            double dest = destAccount.getBalance() + amount;
            srcAccount.setBalance(src);
            destAccount.setBalance(dest);
            rsl = true;
        }
        return rsl;
    }
}
