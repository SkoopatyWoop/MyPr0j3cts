public class DoubleHw<T> implements LinkedListInterface<T> {
   private LinkedListNode<T> head;
   private LinkedListNode<T> tail;
    private int size;

    public DoubleHw(T data) {
        head = new LinkedListNode<T>(data);
        tail = head;
        size = 1;
    }
    @Override
    public void addAtIndex(int index, T data) {
        LinkedListNode<T> dataNode = new LinkedListNode<>(data);
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index is negative or too large");
        }
        if (data == null)
            throw new IllegalArgumentException("null data");
        if (index == 0) {
            dataNode.setNext(head);
            head.setPrevious(dataNode);
            tail = dataNode;
        } else if(index == size()) {
            dataNode.setPrevious(tail);
            tail.setNext(dataNode);
            tail = dataNode;
        } else {
            LinkedListNode<T> iterate = head;
            for (int i = 1; i < index; i++)
                iterate = iterate.getNext();
            dataNode.setNext(iterate.getNext());
            iterate.setNext(dataNode);
            dataNode.setPrevious(iterate);
            dataNode.getNext().setPrevious(dataNode);
//                iterate = iterate.getNext(); //keep traversing until we find said index
//            dataNode.setNext(iterate.getNext()); //set the current index at original list to next node to new data
//            iterate.setNext(dataNode); //set new data at said index
//            dataNode.setPrevious(iterate); //set previous node to data to be iterate
//            dataNode.getNext().setPrevious(dataNode);
        }
        size++;



    }




    @Override
    public void addToFront(T data) {
        addAtIndex(0, data);
    }

    @Override
    public void addToBack(T data) {
        addAtIndex(size , data);
    }

    @Override
    public T removeAtIndex(int index) {
        return null;
    }

    @Override
    public T removeFromFront() {
        return null;
    }

    @Override
    public T removeFromBack() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(T data) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {
        LinkedListNode<T> toArr = head;
        Object[] arr = new Object[size];
        int count = 0;
        while(toArr != null) {
            arr[count] = toArr;
            toArr = toArr.getNext();
            count++;
        }
        return arr;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        if(head == null) {
            return 0;
        }
        return size;
    }

    @Override
    public void clear() {

    }

    @Override
    public LinkedListNode<T> getHead() {
        return null;
    }

    @Override
    public LinkedListNode<T> getTail() {
        return null;
    }
}
