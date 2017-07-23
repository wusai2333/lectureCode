/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    int[] items;
    int size;
    int maxsize;
    public AList() {
        maxsize = 100;
        items = new int[maxsize];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == maxsize) {
            maxsize = maxsize * 2;
            int[] a = new int[maxsize];
            System.arraycopy(items, 0, a, 0, size);
            items = a;
        }
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size --;
        return x;
    }
} 