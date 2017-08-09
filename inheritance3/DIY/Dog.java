public class Dog implements OurComparable /* implements OurComparable*/ { // You don't have to implements OurComparable to use the compareTo method.
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

    public void barkMany(int x) {
        for (int i = 0; i < x; i ++) {
            bark(); 
        }
    }

    public int compareTo(Object o) {
        Dog uddaDog = (Dog) o;
        return this.size - uddaDog.size;
    }
}