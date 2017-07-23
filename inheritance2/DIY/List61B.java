/* TODO: Set up this interface so that it covers all common
 * methods to AList and SLList. Also add a default method
 * print that prints a list. */
public interface List61B<Item> {
    public void addLast(Item x);

    public Item getLast();

    public Item get(int i);

    public int size();
    public Item removeLast();

    public void insert(Item x, int position);

    public void addFirst(Item x);

    public Item getFirst();

    default void print() {
        for (int i = 0; i < size(); i = i +  1) {
            System.out.print(get(i) + " ");
        }
    }


} 