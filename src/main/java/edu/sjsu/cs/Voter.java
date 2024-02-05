package edu.sjsu.cs;

public class Voter {
    final int voterId;
    String name;
    boolean hasVoted;
    String firstName;
    String lastName;

    // Exercise 2
    Voter(int id, String n, boolean voted) {
        voterId = id;
        name = n;
        hasVoted = voted;
    }

    // Exercise 3
    public String getName() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }
}
