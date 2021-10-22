package ua.dp.zymokos.heorhii;

public class MyList<T> {
    private Object[] array;
    private Integer size;
    public static final int INITIAL_CAPACITY = 5;

    public MyList() {
        this.array = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public Integer getSize() {
        return size;
    }

    public void add(T element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            array[size] = element;
            size++;
        }
    }

    public void set(Integer index, T element) {
        array[index] = element;
    }

    public void remove(Integer index) {
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size - index - 1);
        array = newArray;
        size--;
    }

    public T get(Integer index) {
        return (T) array[index];
    }

    public Integer size() {
        return getSize();
    }

    public void printMyList() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
