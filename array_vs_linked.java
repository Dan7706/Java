import java.util.ArrayList;
import java.util.LinkedList;

class Main
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer> () ;
        ArrayList<Integer> arrayList = new ArrayList<Integer> () ;

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++)
        {
            linkedList.add(i); 
            arrayList.add(i);
        }


        //**************LINKEDLIST**********

        startTime = System.nanoTime();
        
        //linkedList.get (0);  //around 10000 ns
        //linkedList.get (500000); //around 350000 ns
        //linkedList.get (999999); //around 9000 ns
        //linkedList.remove (0);  //around 15000 ns
        //linkedList.remove (500000); //around 3500000 ns
        //linkedList.remove (999999); //around 11000 ns
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");



        //*****************ARRAYLIST********************

        startTime = System.nanoTime();
        
        //arrayList.get (0);  //around 3000 ns
        //arrayList.get (500000); //around 5000 ns
        //arrayList.get (999999);  //around 3000 ns
        //arrayList.remove (0);  // around 600000 ns
        //arrayList.remove (500000);  //around 350000
        //arrayList.remove (999999);  //around 5000 ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");

    }
}








