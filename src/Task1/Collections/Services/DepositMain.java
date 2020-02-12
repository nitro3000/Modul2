package Task1.Collections.Services;

import Task1.Collections.Entities.Deposit;

import java.util.Collections;

public class DepositMain {

    public static void main(String[] args) {

        DepositService service = new DepositService ( );
//*************   Create a collection with Deposit objects to save the following data. All the objects must be initialized and populated in init() method:
        service.init ( );
//**********   Iterate over the collection using 3 types of iterations
//        System.out.println ("Types of Deposit: " );
//        service.iter1 ();
//        System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++ ");
//        System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++ ");
//        service.iter2 ();
//        System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++ ");
//        System.out.println ("+++++++++++++++++++++++++++++++++++++++++++++++++ ");
//        service.iter3 ();
//**********   Create a method getPrincipal() for get general sum of these deposits
//        service.getPrincipal ( );
        //List<Deposit> deposits = new ArrayList<Deposit> ( );
//***************  Sort a list of deposits from table above by interest value, then print sum and interest value of all deposits from the list
//        for (int i = 0; i < DepositService.deposits.size ( ); i++) {
//            System.out.println (DepositService.deposits.get (i).getSum ( ));
//            System.out.println (DepositService.deposits.get (i).getInterestRate ( ));
//        }
        //service.sortByInterestValue ();

//*****************  Modify the code for the previous task in order to sort deposit list by principal sum using Comparator interface.++++++PRINCIPAL ONLY ONE ????????
        //service.sortByPrincipal ();
//***************Apply three different styles of Comparators: inner class, anonymous class, lambda
//        SortByPrincipalSum service2 = new SortByPrincipalSum ();
//        SortByPrincipalSum service3 = new SortByPrincipalSum ();
        service.removeDepositLessThan10K ( );
        service.iter3 ();


    }

}
