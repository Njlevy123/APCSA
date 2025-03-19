/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tele;

/**
 *
 * @author nlevy2025
 */
public class Tele {
    public static void main(String[] args)
    {
        Contact[] friends = new Contact[8];
        friends[0] = new Contact("John", "Smith", "610-555-7384");
        friends[1] = new Contact("Sarah", "Barnes", "215-555-3827");
        friends[2] = new Contact("Mark", "Riley", "733-555-2969");
        friends[3] = new Contact("Laura", "Getz", "663-555-3984");
        friends[4] = new Contact("Larry", "Smith", "464-555-3489");
        friends[5] = new Contact("Frank", "Phelps", "322-555-2284");
        friends[6] = new Contact("Mario", "Guzman", "804-555-9066");
        friends[7] = new Contact("Marsha", "Grant", "243-555-2837");

        Sorting.selectionSort(friends);
        System.out.println("*** Selection Sort by Telephone Number ***");
        for (Contact friend : friends)
            System.out.println(friend);

        Sorting.insertionSort(friends);
        System.out.println();
        System.out.println("*** Insertion Sort by Telephone Number ***");
        for (Contact friend : friends)
            System.out.println(friend);
    }
}

class Sorting {
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            // Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position - 1]) < 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}

class Contact implements Comparable {
    private String firstName, lastName, phone;

    // Constructor
    public Contact(String first, String last, String telephone) {
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    // Returns a description of this contact as a string.
    public String toString() {
        return lastName + ", " + firstName + "\t" + phone;
    }

    // Determines equality based on last name, first name, and phone number.
    public boolean equals(Object other) {
        return (lastName.equals(((Contact)other).getLastName()) &&
                firstName.equals(((Contact)other).getFirstName()) &&
                phone.equals(((Contact)other).getPhone()));
    }

    // Compares contacts based on telephone numbers.
    public int compareTo(Object other) {
        // Compare phone numbers
        return phone.compareTo(((Contact) other).getPhone());
    }

    // First name accessor
    public String getFirstName() {
        return firstName;
    }

    // Last name accessor
    public String getLastName() {
        return lastName;
    }

    // Phone number accessor
    public String getPhone() {
        return phone;
    }
}
