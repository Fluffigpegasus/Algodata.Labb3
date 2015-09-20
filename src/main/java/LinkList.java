import edu.princeton.cs.introcs.StdOut;

/**
 * Created by Madde on 2015-09-19.
 */
public class LinkList {
    public Link firstLink = null;
    public Link presentLink;

    public void insertFirstLink(int value){
        Link newLink = new Link(value);
        // Connect the newly inserted link with the old inserted link
        newLink.next = firstLink;
        presentLink = newLink;
        firstLink = newLink;

    }

    public Link nx(){
        return firstLink;
    }

    public Link present(){
        return presentLink;
    }

    // Print out the linked list
    public void dis(){
        Link theLink = firstLink;
        while(theLink != null){
            theLink.dis();
            StdOut.print(", ");
            theLink = theLink.next;
        }
        StdOut.println(" (the end!)");
    }

    public void smart(LinkList in){
        sllBubbleSort thaList = new sllBubbleSort();
        thaList.smart(in);
    }
}
