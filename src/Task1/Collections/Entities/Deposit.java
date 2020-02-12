// Create a collection with Deposit objects to save the following data. All the objects must be initialized and populated in init() method:
// Create a method getPrincipal() for get general sum of these deposits
// Iterate over the collection using 3 types of iterations

package Task1.Collections.Entities;

import java.time.LocalDate;

public class Deposit implements Comparable<Deposit> {
    private String depositType;
    private LocalDate startDate;
    private int dayLong;
    private double sum;
    private double interestRate;

    public Deposit(String depositType, LocalDate startDate, int dayLong, double sum, double interestRate) {
        this.depositType = depositType;
        this.startDate = startDate;
        this.dayLong = dayLong;
        this.sum = sum;
        this.interestRate = interestRate;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDayLong() {
        return dayLong;
    }

    public void setDayLong(int dayLong) {
        this.dayLong = dayLong;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return ("Deposit type is:  " + getDepositType ( ) + ("\n") + "Start Day on:     " + getStartDate ( ) + ("\n") +
                "Day Long are:     " + getDayLong ( ) + ("\n") + "Sum is:           " + getSum ( ) + ("\n") + "Interest rate is: " + getInterestRate ( ) + ("\n") + "**********************************");
    }

    @Override
    public int compareTo(Deposit other) {
        if (this.getInterestRate ( ) < other.getInterestRate ( )) {
            return -1;
        }
        if (this.getInterestRate ( ) == other.getInterestRate ( )) {
            return 0;
        }
        return 1;
    }
//    @Override
//    public int compareTo(Deposit other) {
//        return  Double.compare (this.getInterestRate (),other.getInterestRate ()) ;
//    }





}
