package net.devcouch;

/**
 * Created by markusvieghofer on 13.12.15.
 */
public class Address {
    public final String street;
    public final String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
