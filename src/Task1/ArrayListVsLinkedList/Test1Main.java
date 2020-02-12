package Task1.ArrayListVsLinkedList;

public class Test1Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1 (0);
        Test1Servises service = new Test1Servises ( );

//        service.populateArrayA (10);
//        service.populateArrayB (10);
//        service.displayA ();
//        service.displayB ();
//        service.addElementsToList (3);
//        service.displayA ();
//        service.addElementToLinkedList (3);
//        service.displayB ();
//        service.performanceA10 ( );
//        service.performanceB10 ( );
//        service.performanceA1000 ( );
//        service.performanceB1000 ( );
        service.performanceA100000 ();
        service.performanceB100000 ();
        service.performance2A100000 ();
        service.performance2B100000 ();

    }
}
