public class ArrayList<T> implements ArrayListInterface<T> {

    private T[] backingArray;
    private int size;

    public ArrayList() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }
    @Override
    public void addAtIndex(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index negative or too large");
        }
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }

        if (size > backingArray.length)
            regrow();

        for(int i = size - 1; i >= index; i--) { //decrement from end of list, moving everything to the right of index by 1, including current index val
            //the, set index element at index + 1, set the original index value to given index.
            backingArray[i +1] = backingArray[i];
        }
        backingArray[index] = data;
        size++;


    }

    private void regrow() {
       T[] newArr = (T[]) new Object[backingArray.length * 2];
       for (int i = 0; i  < size; i++) {
           newArr[i] = backingArray[i];
       }
       backingArray = newArr;
    }

    @Override
    public void addToFront(T data) {
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }
        addAtIndex(0, data);
    }

    @Override
    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }
        addAtIndex(size, data);
    }

    @Override
    public T removeAtIndex(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index is too large or negative");
        }
        T removed = backingArray[index];
       for(int i = index; i < backingArray.length; i++) {
           backingArray[i] = backingArray[i+1];
       }
       backingArray[index] = null;
       size--;
       return removed;
    }

    @Override
    public T removeFromFront() {
        if (isEmpty())
            return null;
        return removeAtIndex(0);
    }

    @Override
    public T removeFromBack() {
        if (isEmpty())
            return null;
        return removeAtIndex(size - 1);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Index (-) or too large");
        return backingArray[index];
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public Object[] getBackingArray() {
        return new Object[0];
    }
}
