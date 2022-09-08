import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /*
         * The addLast method can be used to populate a list.
         */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");

        // This list is currently: DHRT

        /*
         * The listIterator method creates a new list iterator that is
         *      positioned at the front of the list.
         * The "|" in the comment represents the iterator position.
         */
        ListIterator<String> iterator = staff.listIterator(); // |DHRT

        /*
         * The next method advances the iterator over the next element
         *  in the list.
         */
        iterator.next();        // D|HRT

        /*
         * The next method also returns the element that the iterator
         *  is passing.
         */
         String name = iterator.next();     // DH|RT
         System.out.println(name);
         System.out.println("Expected: Harry");
    }
}
