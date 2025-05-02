package model;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final int age;

    public User(String firstName, String lastName, int age, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email.toLowerCase();
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
