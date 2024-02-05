package edu.sjsu.cs;

public class Candidate {
    final int candidateId;
    String name;
    String party;
    String firstName;
    String lastName;

    //Exercise 1
    public Candidate(int id, String n, String p) {
        candidateId = id;
        name = n;
        party = p;
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
