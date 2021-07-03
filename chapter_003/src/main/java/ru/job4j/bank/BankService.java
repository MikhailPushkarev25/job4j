package ru.job4j.bank;

import java.util.*;

/**
 * @author Mikhail Pushkarev
 * @since 14.03.2021
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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
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
     * В методе я совершил рефакторинг,
     * Stream API- метод принимает данные паспорта,
     * далее с помощью keySet создаем поток
     * фильтруем данные, возвращаем обьект в виде Optional
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        return users.keySet()
                .stream()
                .filter(
                        s -> s.getPassport().equals(passport)
                ).findFirst();
    }

    /**
     * Метод принимает паспорт и реквизиты
     * для начала я ищу номер паспорта пользователя,
     * в условию если номер нашел то создаю список и полцчаю информацию пользователя,
     * прохожу по циклу и получаю реквизиты
     * @param passport - номер паспорта
     * @param requisite - реквизиты
     * @return - возвращаем список
     * В методе я совершил рефакторинг,
     *      * Stream API- метод принимает данные паспорта,
     *      проыеряю что не null
     *      * далее создаем поток
     *      * фильтруем данные, возвращаем обьект в виде Optional
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> userBy = findByPassport(passport);
        if (userBy.isPresent()) {
            return users.get(userBy.get())
                    .stream()
                    .filter(r -> r.getRequisite().equals(requisite))
                    .findFirst();
        }
        return null;
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && amount >= 0) {
            double src = srcAccount.get().getBalance() - amount;
            double dest = destAccount.get().getBalance() + amount;
            srcAccount.get().setBalance(src);
            destAccount.get().setBalance(dest);
            rsl = true;
        }
        return rsl;
    }
}
