/**
 * Your implementation of a LinkedDeque.
 *
 * @author Leul Wubete
 * @version 1.0
 * @userid lwubete3
 * @GTID 903568155
 *
 * Collaborators: None
 *
 * Resources: None
 */

public class LinkedDeque<T> {

    // Do not add new instance variables or modify existing ones.
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size;

    // Do not add a constructor.

    /**
     * Adds the element to the front of the deque.
     *
     * Must be O(1).
     *
     * @param data the data to add to the front of the deque
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addFirst(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Trying to add null data to first.");
        }

        if (size == 0) {
            head = new LinkedNode<>(data);
            tail = head;
        } else {
            head.setPrevious(new LinkedNode<T>(data, null, head));
            head = head.getPrevious();
        }
        size++;
    }

    /**
     * Adds the element to the back of the deque.
     *
     * Must be O(1).
     *
     * @param data the data to add to the back of the deque
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addLast(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Trying to add null data to last.");
        }
        if (size == 0) {
            head = new LinkedNode<>(data);
            tail = head;
        } else {
            tail.setNext(new LinkedNode<T>(data, tail, null));
            tail = tail.getNext();
        }
        size++;
    }

    /**
     * Removes and returns the first element of the deque.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the front of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */
    public T removeFirst() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Trying to remove null from first of empty list.");
        }
        T removed = head.getData();

        if (size == 1) {
            head = null;
            tail = null;
        } else if (size == 2) {
            head = tail;
            head.setPrevious(null);
            head.setNext(null);
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
        size--;
        return removed;
    }

    /**
     * Removes and returns the last element of the deque.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the back of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */
    public T removeLast() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Trying to remove null from last of empty list.");
        }

        T removed = tail.getData();

        if (size == 1) {
            head = null;
            tail = null;
        } else if (size == 2) {
            tail = head;
            tail.setNext(null);
            tail.setPrevious(null);
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        size--;
        return removed;
    }

    /**
     * Returns the first data of the deque without removing it.
     *
     * Must be O(1).
     *
     * @return the data located at the front of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */
    public T getFirst() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Trying to get first of empty list.");
        }
        return head.getData();
    }

    /**
     * Returns the last data of the deque without removing it.
     *
     * Must be O(1).
     *
     * @return the data located at the back of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */
    public T getLast() {
        if (size == 0) {
            throw new java.util.NoSuchElementException("Trying to get last of empty list.");
        }
        return tail.getData();
    }

    /**
     * Returns the head node of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return node at the head of the deque
     */
    public LinkedNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return node at the head of the deque
     */
    public LinkedNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the deque
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
