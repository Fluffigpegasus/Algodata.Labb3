import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import java.util.LinkedList;

/**
 * Created by Madde on 2015-09-18.
 */
public class driver {

    public static void main (String[] args){
        LinkList myList = new LinkList();
        /*for(int i = 0; i <5; i++) {
            myList.insertFirstLink(i);
        }*/
        myList.insertFirstLink(3);
        myList.insertFirstLink(1);
        myList.insertFirstLink(7);
        myList.insertFirstLink(5);
        myList.insertFirstLink(10);

        myList.dis();
        myList.smart(myList);
        myList.dis();

        /*LinkedList list = new LinkedList();

        list.add("Russ");
        list.add("Arab");
        list.add("Welsh");
        list.add("Connemara");
        StdOut.println("We have: " + list);
        list.addFirst("Fallabella");
        StdOut.println("And now we have: " + list);
        //LinkedList first = new LinkedList();
        Object second = new Object();
        second = list.get(1);
        list.remove(1);
        StdOut.println("And now we have removed " + second + " from the list, result: " + list);
        list.remove("Welsh");
        StdOut.println("And now we have: " + list);
        StdOut.println("Amout of elements: " + list.size());
        list.addFirst(second);
        StdOut.println("And now we have: " + list);
        StdOut.println("Amout of elements: " + list.size());
        Object first = new Object();
        first = list.get(2);
        second = list.get(1);
        list.set(1, first);
        list.set(2, second);
        StdOut.println("And now we have: " + list);
        StdOut.println("Amout of elements: " + list.size());*/


        /*StdOut.println("Number of elements: ");
        arg = new int[StdIn.readInt()];

        StdOut.println("Write your elements you want to be sorted: ");
        for(int i = 0; i < arg.length; i++){
            arg[i] = StdIn.readInt();
            StdOut.print(arg[i]);
        }
        sllBubbleSort sort = new sllBubbleSort();
        sort.bubbleSort();*/
    }
}
