import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;
    private double feesPaid;
    private double feesTotal;

    Student(String name, int rollNumber, double feesTotal) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.feesTotal = feesTotal;
        this.feesPaid = 0;
    }

    public void payFees(double amount) {
        feesPaid += amount;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber +
               ", Fees Paid: " + feesPaid + ", Fees Total: " + feesTotal;
    }
}
