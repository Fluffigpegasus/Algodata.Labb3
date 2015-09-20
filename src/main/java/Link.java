import edu.princeton.cs.introcs.StdOut;

/**
 * Created by Madde on 2015-09-19.
 */
public class Link {
    public int value;

    // Reference to next link made in the LinkList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links
    public Link next;
    public boolean ask = false;

    public Link(int value){
        this.value = value;
    }

    public void dis(){
        StdOut.print(value);
    }

    public int getLink(){
        return value;
    }

    public Link nx(){
        return next;
    }

    public boolean ask(){
        return ask;
    }

    public void done(){
        ask = true;
    }

    public void setLink(int n){
        value = n;
    }
}
