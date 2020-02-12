package Task1.ArrayListVsLinkedList;
//+++++ Create two methods for inserting n integers into the middle of a list.
// One of these methods should use ArrayList and another – LinkedList.
// Compare performance of the methods for different n (e.g. n = 10, 100, 1000, 10000).

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
    private Integer i;
    private int j;
    private int n;
    public static ArrayList<Integer> arrayA = new ArrayList<> ( );
    public static LinkedList<Integer> arrayB = new LinkedList<> ( );

    public Test1(Integer i, int n) {
        this.i = i;
        this.n = n;
    }

    public Test1(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static ArrayList<Integer> getArrayA() {
        return arrayA;
    }
    public static LinkedList<Integer> getArrayB() {
        return arrayB;
    }



}


