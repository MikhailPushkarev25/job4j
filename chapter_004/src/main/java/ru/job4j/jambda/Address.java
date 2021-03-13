package ru.job4j.jambda;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author Mikhail Pushkarev
 * @since 13.03.2021
 * @version 2.2
 *
 * В классе создана модель данных,
 * вся информация адреса - для клиента.
 * Так же к примеру пришло нововведение о том что у клиентов может быть одинаковые адреса
 * и нужно заявки с адресами отсортировать, я это сделал так -
 * имплементировал компаратор и сравнил города.
 */
public class Address implements Comparator<Address> {

    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public int compare(Address o1, Address o2) {
        return o1.getCity().compareTo(o2.getCity());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home && apartment == address.apartment && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + ", home=" + home + ", apartment=" + apartment + '}';
    }
}
