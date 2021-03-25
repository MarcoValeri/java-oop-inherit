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

    public boolean insert(Object o, int index) {
        
        if (index < 0 || index > size || size >= items.length) return false;

        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = o;
        size++;
        return true;
    };

    public Object remove(int index) {
        if (index < 0 || index >= size) return null;

        Object output = items[index];

        for (int i = index; i < size; i++) {
            items[i] = items[i+1];
        }

        return output;
    };

    // Accessorts
    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            return items[index];
        }
    };

    public int size() {
        return size;
    };

    public boolean contains(Object o) {
        for (Object e: items) {
            if (e == null) {
                if (o == null) {
                    return true;
                }
            } else if (e.equals(o)) {
                return true;
            }
        }
        return false;
    };

    public String toString() {

        String output = "";

        if (size == 0) return "";

        output = "" + items[0];
        for (int i = 1; i < size; i++) {
            output = ", " + items[i];
        }

        return output;
    };

    public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = items[i];
        }
        return arr;
    };
}


