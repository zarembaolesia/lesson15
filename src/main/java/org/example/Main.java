package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Case1. Woman marries a man");
        Woman woman1 = new Woman("Jane", "Doe", 55);
        Man man1 = new Man("John", "Wick", 50);
        woman1.registerPartnership(man1);
        System.out.println("The woman details:");
        System.out.println(woman1.getFirstName() + " " + woman1.getLastName() + " (formerly " + woman1.getPrevLastName() + ") " + woman1.getAge());
        System.out.println("Retirement status: " + woman1.isRetired());
        System.out.println("Married to " + woman1.getPartner().getFirstName() + " " + woman1.getPartner().getLastName());
        System.out.println("The man details:");
        System.out.println(man1.getFirstName() + " " + man1.getLastName() + " " + man1.getAge());
        System.out.println("Retirement status: " + man1.isRetired());
        System.out.println("Married to " + man1.getPartner().getFirstName() + " " + man1.getPartner().getLastName());
        System.out.println("------------------------------");

        System.out.println("Case2. Man marries a woman");
        Woman woman2 = new Woman("Tess", "Black", 67);
        Man man2 = new Man("Bob", "Keller", 70);
        man2.registerPartnership(woman2);
        System.out.println("The woman details:");
        System.out.println(woman2.getFirstName() + " " + woman2.getLastName() + " (formerly " + woman2.getPrevLastName() + ") " + woman2.getAge());
        System.out.println("Retirement status: " + woman2.isRetired());
        System.out.println("Married to " + woman2.getPartner().getFirstName() + " " + woman2.getPartner().getLastName());
        System.out.println("The man details:");
        System.out.println(man2.getFirstName() + " " + man2.getLastName() + " " + man2.getAge());
        System.out.println("Retirement status: " + man2.isRetired());
        System.out.println("Married to " + man2.getPartner().getFirstName() + " " + man2.getPartner().getLastName());
        System.out.println("------------------------------");

        System.out.println("Case3. Man marries a man");
        Man man3 = new Man("Jake", "Brown", 65);
        Man man4 = new Man("Alex", "Johnson", 64);
        man3.registerPartnership(man4);
        System.out.println("The man details:");
        System.out.println(man3.getFirstName() + " " + man3.getLastName() + " " + man3.getAge());
        System.out.println("Retirement status: " + man3.isRetired());
        System.out.println("Married to " + man3.getPartner().getFirstName() + " " + man3.getPartner().getLastName());
        System.out.println("The man details:");
        System.out.println(man4.getFirstName() + " " + man4.getLastName() + " " + man4.getAge());
        System.out.println("Retirement status: " + man4.isRetired());
        System.out.println("Married to " + man4.getPartner().getFirstName() + " " + man4.getPartner().getLastName());
        System.out.println("------------------------------");

        System.out.println("Case4. Woman marries a woman");
        Woman woman3 = new Woman("Nancy", "Swan", 61);
        Woman woman4 = new Woman("Anne", "Stellar", 59);
        woman4.registerPartnership(woman3);
        System.out.println("The woman details:");
        System.out.println(woman3.getFirstName() + " " + woman3.getLastName() + " " + woman3.getAge());
        System.out.println("Retirement status: " + woman3.isRetired());
        System.out.println("Married to " + woman3.getPartner().getFirstName() + " " + woman3.getPartner().getLastName());
        System.out.println("The woman details:");
        System.out.println(woman4.getFirstName() + " " + woman4.getLastName() + " " + woman4.getAge());
        System.out.println("Retirement status: " + woman4.isRetired());
        System.out.println("Married to " + woman4.getPartner().getFirstName() + " " + woman4.getPartner().getLastName());
        System.out.println("------------------------------");

        System.out.println("Case5. Divorce initiated by a woman");
        woman1.deregisterPartnership(true);
        System.out.println("The woman details:");
        System.out.println(woman1.getFirstName() + " " + woman1.getLastName() + " (formerly " + woman1.getPrevLastName() + ") " + woman1.getAge());
        System.out.println("Retirement status: " + woman1.isRetired());
        if (woman1.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + woman1.getPartner().getFirstName() + " " + woman1.getPartner().getLastName());
        }
        System.out.println("The man details:");
        System.out.println(man1.getFirstName() + " " + man1.getLastName() + " " + man1.getAge());
        System.out.println("Retirement status: " + man1.isRetired());
        if (man1.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + man1.getPartner().getFirstName() + " " + man1.getPartner().getLastName());
        }
        System.out.println("------------------------------");

        woman3.deregisterPartnership(true);
        System.out.println("The woman details:");
        System.out.println(woman3.getFirstName() + " " + woman3.getLastName() + " " + woman3.getAge());
        System.out.println("Retirement status: " + woman3.isRetired());
        if (woman3.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + woman3.getPartner().getFirstName() + " " + woman3.getPartner().getLastName());
        }
        System.out.println("The woman details:");
        System.out.println(woman4.getFirstName() + " " + woman4.getLastName() + " " + woman4.getAge());
        System.out.println("Retirement status: " + woman4.isRetired());
        if (woman4.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + woman4.getPartner().getFirstName() + " " + woman4.getPartner().getLastName());
        }
        System.out.println("------------------------------");

        System.out.println("Case5. Divorce initiated by a man");
        man2.deregisterPartnership(true);
        System.out.println("The woman details:");
        System.out.println(woman2.getFirstName() + " " + woman2.getLastName() + " (formerly " + woman2.getPrevLastName() + ") " + woman2.getAge());
        System.out.println("Retirement status: " + woman2.isRetired());
        if (woman2.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + woman2.getPartner().getFirstName() + " " + woman2.getPartner().getLastName());
        }
        System.out.println("The woman details:");
        System.out.println(man2.getFirstName() + " " + man2.getLastName() + " " + man2.getAge());
        System.out.println("Retirement status: " + man2.isRetired());
        if (man2.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + man2.getPartner().getFirstName() + " " + man2.getPartner().getLastName());
        }
        System.out.println("------------------------------");

        man4.deregisterPartnership(true);
        System.out.println("The man details:");
        System.out.println(man4.getFirstName() + " " + man4.getLastName() + " " + man4.getAge());
        System.out.println("Retirement status: " + man4.isRetired());
        if (man4.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + man4.getPartner().getFirstName() + " " + man4.getPartner().getLastName());
        }
        System.out.println("The man details:");
        System.out.println(man3.getFirstName() + " " + man3.getLastName() + " " + man3.getAge());
        System.out.println("Retirement status: " + man3.isRetired());
        if (man3.getPartner() == null) {
            System.out.println("Unmarried");
        } else {
            System.out.println("Married to " + man3.getPartner().getFirstName() + " " + man3.getPartner().getLastName());
        }
        System.out.println("------------------------------");
    }
}