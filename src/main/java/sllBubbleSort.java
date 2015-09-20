import java.util.LinkedList;

/**
 * Created by Madde on 2015-09-18.
 */
public class sllBubbleSort {
    static int swaps = 0;
    // Check if the link is sorted or not
    public void smart(LinkList full){
        Link i = full.present();
        while(!i.ask()){
            this.bubbleSort(i);
        }
    }

    public void bubbleSort(Link in){
        if(in.nx() != null && !in.nx().ask()) {
            if (in.nx().getLink() < in.getLink()) {
                swap(in);
            }
            this.bubbleSort(in.nx());
        }
        else{
            in.done();
        }
    }

    public static void swap(Link in){
        swaps++;
        int temp = in.nx().getLink();
        in.nx().setLink(in.getLink());
        in.setLink(temp);
    }
}
