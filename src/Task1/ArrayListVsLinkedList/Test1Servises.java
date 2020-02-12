package Task1.ArrayListVsLinkedList;

public class Test1Servises {


    public void populateArrayA (int numberOfElementsInTheList){
        for (int i=0; i<numberOfElementsInTheList ;i++)
            Test1.arrayA.add (i);
    }
    public void populateArrayB (int numberOfElementsInTheLinkedList){
        for (int i=0; i<numberOfElementsInTheLinkedList ;i++)
            Test1.arrayB.add (i);
    }

    public void displayA (){
        System.out.println ("This is ArrayList A: "+Test1.arrayA );
    }
    public void displayB (){
        System.out.println ("This is LinkedList B: "+Test1.arrayB );
    }
//++++++++  adding N element in the middle of List

    public void addElementsToMiddleOfList(int numberOfElementsToAdd){
        for(Integer j=0;j<numberOfElementsToAdd;j++)
            Test1.arrayA.add (Test1.arrayA.size ()/2,j);
    }
    public void addElementsToList(int numberOfElementsToAdd){
        for(Integer j=0;j<numberOfElementsToAdd;j++)
            Test1.arrayA.add (Test1.arrayA.size (),j);
    }
//++++++++  adding N element in the middle of LinkedList
    public void addElementToMiddleOfLinkedList(int numberOfElementsToAdd){
        for(Integer j=0;j<numberOfElementsToAdd;j++)
            Test1.arrayB.add (Test1.arrayB.size ()/2,j);
    }
    public void addElementToLinkedList(int numberOfElementsToAdd){
        for(Integer j=0;j<numberOfElementsToAdd;j++)
            Test1.arrayB.add (Test1.arrayB.size (),j);
    }
    public void performanceA10 () {
        populateArrayA (10);
        long startTime=System.nanoTime ();
        addElementsToMiddleOfList (10);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 10 elements to the middle of ArrayList: "+ duration/1000+" micro seconds");
    }
    public void performanceA1000 () {
        populateArrayA (10);
        long startTime=System.nanoTime ();
        addElementsToMiddleOfList (1000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 1000 elements to the middle of ArrayList: "+ duration/1000+" micro seconds");
    }
    public void performanceA100000 () {
        populateArrayA (10);
        long startTime=System.nanoTime ();
        addElementsToMiddleOfList (100000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 100000 elements to the middle of ArrayList: "+ duration/1000+" micro seconds" );
    }
    public void performanceB10() {
        populateArrayB(10);
        long startTime=System.nanoTime ();
        addElementToMiddleOfLinkedList (10);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 10 elements to the middle of LinkedList: "+ duration/1000+" micro seconds");
    }
    public void performanceB1000() {
        populateArrayB(10);
        long startTime=System.nanoTime ();
        addElementToMiddleOfLinkedList (1000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 1000 elements to the middle of LinkedList: "+ duration/1000+" micro seconds");
    }
    public void performanceB100000() {
        populateArrayB(10);
        long startTime=System.nanoTime ();
        addElementToMiddleOfLinkedList (100000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 100000 elements to the middle of LinkedList: "+ duration/1000+" micro seconds");
    }
    public void performance2A100000 () {
        populateArrayA (10);
        long startTime=System.nanoTime ();
        addElementsToMiddleOfList (100000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 100000 elements to  ArrayList: "+ duration/1000+" micro seconds" );
    }
    public void performance2B100000() {
        populateArrayB(10);
        long startTime=System.nanoTime ();
        addElementToMiddleOfLinkedList (100000);
        long duration =System.nanoTime ()-startTime;
        System.out.println ("Performance of the adding 100000 elements to  LinkedList: "+ duration/1000+" micro seconds");
    }
}
