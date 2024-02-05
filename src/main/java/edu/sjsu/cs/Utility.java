package edu.sjsu.cs;

public class Utility {
    // Exercise 3
    public static void printInfo(Candidate c) {
        System.out.println("Candidate ID:" + c.candidateId);
        System.out.println("Candidate Name:" + c.name);
        System.out.println("Candidate Party" + c.party);
    }

    public static void printInfo(Voter v) {
        System.out.println("Voter ID:" + v.voterId);
        System.out.println("Voter Name:" + v.name);
        System.out.println("Vote Status:" + v.hasVoted);
    }
}
