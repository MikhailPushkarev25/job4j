package ru.job4j.jambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mikhail Pushkarev
 * @since 13.03.2021
 * @version 2.2
 *
 * В классе я создал метод, принимает параметр адресов клиентов
 * далее с помощью Stream API - ищу клиента по адресу
 */
public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(
                Profile::getAddress
        ).collect(Collectors.toList());
    }
}
