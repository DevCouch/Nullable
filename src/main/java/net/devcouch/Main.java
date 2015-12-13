package net.devcouch;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person("Markus", "Vieghofer");
        System.out.println("Hello " + person.getFullName());

        if (person.getAddressString() != null) {
            System.out.println(person.getAddressString());
        }

        Address address = new Address("street", "city");
        person = new Person("Markus", "Vieghofer", address);

        if (person.getFullName() != null) {
            System.out.println("Hello, " + person.getFullName());
        }

        if (person.getAddressString() != null) {
            System.out.println(person.getAddressString());
        }

    }
}
