public class SP1List {
    // Instance variables
    private Object[] items;
    private int size;

    // Constructors
    public SP1List(int capacity) {
        items = new Object[capacity];
        size = 0;
    };

    public SP1List(Object[] array) {
        items = new Object[array.length];
        size = array.length;
        for (int i = 0; i < array.length; i++) {
            items[i] = array[i];
        }
    };

    // Mutators
    public boolean add(Object o) {

        if (size < items.length) {
            items[size] = o;
            size++;
            return true;
        } else {
            return false;
        }

    };

    public boolean set(Object o, int index) {
        
        if (index < 0 || index >= size) {
            return false;
        } else {
            items[index] = o;
            return true;
        }

    };

    public boolean insert(Object o, int index) {};
    public Object remove(int index) {};

    // Accessorts
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return items[index];
        }
    };

    public int size() {};
    public boolean contains(Object o) {};
    public String toString() {};
    public Object[] toArray() {};
}


