package Task1.Collections.Services;

import Task1.Collections.Entities.Deposit;
//import Task1.Collections.Utilities.SortByInterestRateClass;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.IntStream;

public class DepositService implements Comparable<DepositService> {

    public static List<Deposit> deposits = new ArrayList<Deposit> ( );

    // ***********************************All objects initialized and populated in init() method  ************************
    // ******************  Initializations  *********************
    public void init() {
        //Deposit deposit1 =
        Deposit deposit2 = new Deposit ("MonthCapit", LocalDate.of (2012, 2, 1), 181, 10000.00, 21.0);
        Deposit deposit3 = new Deposit ("Simple", LocalDate.of (2013, 11, 12), 30, 5500.00, 15.3);
        Deposit deposit4 = new Deposit ("Barrier", LocalDate.of (2011, 12, 18), 370, 43000.00, 19.56);
        Deposit deposit5 = new Deposit ("MonthCapit", LocalDate.of (2013, 7, 12), 91, 2000.00, 16.0);

        // ******************  Population  *********************
        // joined declaration and initialization
        deposits.add (new Deposit ("Simple", LocalDate.of (2013, 9, 8), 61, 25000.00, 18.0));
        deposits.add (deposit2);
        deposits.add (deposit3);
        deposits.add (deposit4);
        deposits.add (deposit5);

    }

//    public ArrayList<Deposit> init() {              // ******************  Initializations  *********************
//
//        Deposit deposit1 = new Deposit ("Simple", LocalDate.of (2013, 9, 8), 61, 2500.00, 18.0);
//        Deposit deposit2 = new Deposit ("MonthCapit", LocalDate.of (2012, 2, 1), 181, 10000.00, 21.0);
//        Deposit deposit3 = new Deposit ("Simple", LocalDate.of (2013, 11, 12), 30, 5500.00, 15.3);
//        Deposit deposit4 = new Deposit ("Barrier", LocalDate.of (2011, 12, 18), 370, 43000.00, 19.56);
//        Deposit deposit5 = new Deposit ("MonthCapit", LocalDate.of (2013, 7, 12), 91, 12000.00, 16.0);
//        deposits.add (deposit1); // ******************  Population  *********************
//        deposits.add (deposit2);
//        deposits.add (deposit3);
//        deposits.add (deposit4);
//        deposits.add (deposit5);
//
//        return ArrayList<Deposit>;
//    }

    public void iter1() {

        System.out.println ("Using  'For loop'");

        for (int i = 0; i < deposits.size ( ); i++) {
            System.out.println (deposits.get (i).getDepositType ( ));
        }
    }

    public void iter2() {
        System.out.println ("Using  'For each'");
        //List<Deposit> deposits = new ArrayList<Deposit> ( ); made it public in top of this class, so no need to declare each method in this class
        for (Deposit i : deposits) {
            System.out.println (i);
        }
    }

    public void iter3() {
        //System.out.println ("Using  'Iterator'");
        Iterator<Deposit> iter = deposits.iterator ( );
        while (iter.hasNext ( )) {
            System.out.println (iter.next ( ).toString ( ));
        }
    }

    public double getPrincipal() {

//        DepositService depositService = new DepositService ();
//        depositService.init ();

        double totalSum = 0.00;
        for (int i = 0; i < deposits.size ( ); i++) {
            totalSum += (deposits.get (i).getSum ( ));
        }
        System.out.println ("Total sum1 = " + totalSum);
        return totalSum;
    }

//++++++++++++++++++++++++++++++++++++++++   sorting by, using 'Comparable' interface

    public void sortByInterestValue() {
        System.out.println ("\nSorting by, using 'Comparable' interface\n");
        Collections.sort (deposits);
        {
            System.out.println (deposits);
        }
    }

//+++++++++++++++++++++++++++++++++++++++   sorting by, using 'Comparator' interface //need to create new separate Class

    public void sortByPrincipal() {
        System.out.println ("\nSorting by, using 'Comparator' interface\n");
        Collections.sort (deposits);
        {
            System.out.println (deposits);
        }
    }

//++++++++++++++++++++++++++++++++++++++
    @Override
    public int compareTo(DepositService other) {
        return Double.compare (getPrincipal ( ), other.getPrincipal ( ));
    }

//++++++++++++++++ Create remove() method that removes deposits from the list if deposit’s sum < 10000.0

    public void removeDepositLessThan10K() {
        Iterator<Deposit> iter = deposits.iterator ( );
        while (iter.hasNext ( )) {
            if (iter.next ( ).getSum ( ) < 10000) {
                iter.remove ( );
            }
        }
    }

//+++++ Create two methods for inserting n integers into the middle of a list.
// One of these methods should use ArrayList and another – LinkedList.
// Compare performance of the methods for different n (e.g. n = 10, 100, 1000, 10000).


}