package ru.job4j.ex;

/**
 * @author Mikhail Pushkarev
 * @since 09.02.2021
 * @version 2.2
 *
 * В классе произвел множественное try catch
 */
public class UserStore {

    /**
     * В этом методе я ищу пользователя по имени и фамилии если такого пользователя нет
     * то падает исключение UserNotFoundException
     * @param users - массив обьекта User
     * @param login - ключ по которому ищу в массиве
     * @return - возвращаем результат
     * @throws UserNotFoundException - исключение, если на нашли пользователя
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User name = null;
        for (int index = 0; index < users.length; index++) {
            User line = users[index];
            if (line.getUserName().equals(login)) {
                name = line;
                break;
            }
        }
        if (name == null) {
            throw new UserNotFoundException("User not found.");
        }
        return name;
    }

    /**
     * В этом методе я проверяю что обьект user не меньше 3х символов и
     * то что пользователь валидный
     * @param user - пользователь(параметр)
     * @return - вернуть результат
     * @throws UserInvalidException - если user меньше трех символов или
     * пользователь не валидный, то падает исключение
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUserName().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("The user is not valid.");
        }
        return true;
    }

    /**
     * В методе main я определил код во множественный try catch
     * по иерархии, так мы не пропустим исключение
     * @param args - параметр
     */
    public static void main(String[] args) {
        User[] users = {
                new User("Mikhail Pushkarev", true)
        };
        try {
            User user = findUser(users, "Mikhail Pushkarev");
            if (validate(user)) {
                System.out.println("This user has an access.");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
