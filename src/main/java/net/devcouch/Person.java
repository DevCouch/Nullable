package net.devcouch;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Created by markusvieghofer on 13.12.15.
 */
public class Person {
    public final String firstName;
    public final String lastName;
    public Address address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Address address) {
        this(firstName, lastName);
        this.address = address;
    }

    @Nonnull
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Nullable
    public String getAddressString() {
        if (address == null) {
            return null;
        }
        return address.toString();
    }
}
