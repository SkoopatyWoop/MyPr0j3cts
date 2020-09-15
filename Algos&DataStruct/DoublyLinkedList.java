/**
 * Your implementation of a non-circular DoublyLinkedList with a tail pointer.
 *
 * @author Leul Wubete
 * @version 1.0
 * @userid lwubete3
 * @GTID 903568155
 *
 * Collaborators: NA
 *
 * Resources: GT modules
 */
public class DoublyLinkedList<T> {

    // Do not add new instance variables or modify existing ones.
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;
    private int size;

    // Do not add a constructor.

    /**
     * Adds the element to the specified index. Don't forget to consider whether
     * traversing the list from the head or tail is more efficient!
     * <p>
     * Must be O(1) for indices 0 and size and O(n) for all other cases.
     *
     * @param index the index at which to add the new element
     * @param data  the data to add at the specified index
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or index > size
     * @throws java.lang.IllegalArgumentException  if data is null
     */
    public void addAtIndex(int index, T data) {
        if (index < 0 || index > size) {
            throw new java.lang.IndexOutOfBoundsException("You are either giving a negative index"
                    + "or your index is larger than the size");
        }

        if (data == null) {
            throw new java.lang.IllegalArgumentException("You are trying to add null data");
        }

        if (head == null) {
            head = new DoublyLinkedListNode<T>(data);
            tail = head;
        } else {
            DoublyLinkedListNode<T> addMe = new DoublyLinkedListNode<T>(data);
            if (index == 0) {
                addMe.setNext(head);
                head.setPrevious(addMe);
                head = addMe;
            } else if (index == size) {
                tail.setNext(addMe);
                addMe.setPrevious(tail);
                tail = addMe;
            } else {
                DoublyLinkedListNode<T> traversal;
                if ((size) - index < (size) / 2) {
                    traversal = tail;
                    while (size - (++index) >= 0) {
                        traversal = traversal.getPrevious();
                    }
                    addMe.setNext(traversal.getNext());
                    addMe.setPrevious(traversal);
                    traversal.getNext().setPrevious(addMe);
                    traversal.setNext(addMe);
                } else {
                    traversal = head;
                    while (--index > 0) {
                        traversal = traversal.getNext();
                    }
                    addMe.setNext(traversal.getNext());
                    addMe.setPrevious(traversal);
                    traversal.getNext().setPrevious(addMe);
                    traversal.setNext(addMe);
                }
            }
        }
        size++;
    }


    /**
     * Adds the element to the front of the list.
     *
     * Must be O(1).
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Trying to add null data to front");
        }

        addAtIndex(0, data);
    }

    /**
     * Adds the element to the back of the list.
     *
     * Must be O(1).
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Trying to add null data to back");
        }

        addAtIndex(size, data);
    }

    /**
     * Removes and returns the element at the specified index. Don't forget to
     * consider whether traversing the list from the head or tail is more
     * efficient!
     *
     * Must be O(1) for indices 0 and size - 1 and O(n) for all other cases.
     *
     * @param index the index of the element to remove
     * @return the data formerly located at the specified index
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or index >= size
     */
    public T removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new java.lang.IndexOutOfBoundsException("Trying to remove from from negative or overvalued index");
        }
        T removed;
        if (size == 1) {
            removed = head.getData();
            head = null;
            tail = null;
        } else if (index == 0) {
            removed = head.getData();
            head = head.getNext();
            head.setPrevious(null);
        } else if (index == size - 1) {
            removed = tail.getData();
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            DoublyLinkedListNode<T> traverse;
            if ((size) - index < (size) / 2) {
                traverse = tail;
                while ((size - 1) - (++index) >= 0) {
                    traverse = traverse.getPrevious();
                }
                removed = traverse.getData();
                traverse.getPrevious().setNext(traverse.getNext());
                traverse.getNext().setPrevious(traverse.getPrevious());
                traverse = null;
            } else {
                traverse = head;
                while (--index >= 0) {
                    traverse = traverse.getNext();
                }
                removed = traverse.getData();
                traverse.getPrevious().setNext(traverse.getNext());
                traverse.getNext().setPrevious(traverse.getPrevious());
                traverse = null;
            }
        }
        size--;
        if (size == 1) {
            tail = head;
        }
        return  removed;
    }

    /**
     * Removes and returns the first element of the list.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Trying to remove from front of empty list");
        }
        return removeAtIndex(0);
    }

    /**
     * Removes and returns the last element of the list.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("Trying to remove from back of empty list");
        }

        return removeAtIndex(size - 1);
    }

    /**
     * Returns the element at the specified index. Don't forget to consider
     * whether traversing the list from the head or tail is more efficient!
     *
     * Must be O(1) for indices 0 and size - 1 and O(n) for all other cases.
     *
     * @param index the index of the element to get
     * @return the data stored at the index in the list
     * @throws java.lang.IndexOutOfBoundsException if index < 0 or index >= size
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new java.lang.IndexOutOfBoundsException("Trying to get element from negative index"
                    + "or from out of bounds size");
        }
        T value;
        if (index == 0) {
            value = head.getData();
        } else if (index == size - 1) {
            value = tail.getData();
        } else {
            DoublyLinkedListNode<T> traverse = head;
            while (--index >= 0) {
                traverse = traverse.getNext();
            }
            value = traverse.getData();
        }
        return value;
    }

    /**
     * Returns whether or not the list is empty.
     *
     * Must be O(1).
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Clears the list.
     *
     * Clears all data and resets the size.
     *
     * Must be O(1).
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Removes and returns the last copy of the given data from the list.
     *
     * Do not return the same data that was passed in. Return the data that
     * was stored in the list.
     *
     * Must be O(1) if data is in the tail and O(n) for all other cases.
     *
     * @param data the data to be removed from the list
     * @return the data that was removed
     * @throws java.lang.IllegalArgumentException if data is null
     * @throws java.util.NoSuchElementException   if data is not found
     */
    public T removeLastOccurrence(T data) {
        if (data == null) {
            throw new java.lang.IllegalArgumentException("Trying to search for null data");
        }
        int index = size - 1;

        if (tail.getData().equals(data)) {
            return removeFromBack();
        }

        DoublyLinkedListNode<T> traverse = tail;
        while (traverse != null) {
            if (traverse.getData().equals(data)) {
                return removeAtIndex(index);
            }
            traverse = traverse.getPrevious();
            index--;
        }

        throw new java.util.NoSuchElementException("No element of given data found after parsing");


    }

    /**
     * Returns an array representation of the linked list.
     *
     * Must be O(n) for all cases.
     *
     * @return an array of length size holding all of the objects in the
     * list in the same order
     */
    public Object[] toArray() {
        Object[] obj = new Object[size];
        if (size == 0) {
            return obj;
        }
        DoublyLinkedListNode<T> traverse = head;
        int index = 0;
        while (traverse != null) {
            obj[index++] = traverse.getData();
            traverse = traverse.getNext();
        }
        return obj;
    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public DoublyLinkedListNode<T> getHead() {
        // DO NOT MODIFY!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public DoublyLinkedListNode<T> getTail() {
        // DO NOT MODIFY!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY!
        return size;
    }
}
