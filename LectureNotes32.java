/**
 * Week 1 {
 *     Monday Notes {
 *   ***  Files > Check out CS1332_ResourceIndex.pdf
 *     there is pre recorded exam reviews in there and details of many things
 *     Also TA videos
 *    ** also Files > Extension Resources have WORKSHEETS, VERY BENEFICIAL, MORE IN DEPTH and Recetation Worksheets
 *         Saikrishna slides contain pseudocode we base visalization tool off of. Under File >
 *         Slide_supplement > *_samihb.pdf
 *
 *         Go to visualization tool for edge cases, what happens if arraylist is full, if we delete last node in
 *         linked list?
 *
 *         BEST PATH? EXPLORE EVERYTHING, see what you like
 *
 *         **WHEN DOING MODULES, always make sure to check out saikrishna's slides!!! They are labeled
 *        **** *_samhb.pdf
 *
 *        **Weekly notes also in slides
 *
 *        **Practice exams coming soon
 *
 *     }
 *
 *     Wednesday Notes {
 *         Public Vs Private visibility
 *          Public class has private inner class
 *
 *        constructor chaining is a constructor calling another constructor, default values
 *        "this"
 *
 *        Arrays:
 *        you can have gaps in storage of data in arrays, unlike ArrayList
 *        Store data in contiguous memory, it is a memory fixed block, so it is static memory
 *        Data type is homogeneous, meaning all data stored is the same type
 *        Types stored are primitives, objects, references
 *
 *        the problem with static memory is that when it becomes full, you resize the array. Create a new array,
 *        copy all elements/data into the new array the cost is O(n)
 *
 *        capacity: the actual length of the array, the number of elements you can store
 *        size: how many elements stored
 *
 *        ArrayList: an ADT, dynamic memory, dynamically resizes
 *        addToFront O(n)
 *        removeFromFront O(n)
 *        remove/addAtIndex O(n)
 *        addToBack amortized O(1)
 *        removeFromBack O(1)
 *
 *        stored in contiguous memory AKA memory blocks, start at index 0, no gaps in between storing
 *        meaning all elements are packed next to eachother, no gaps
 *
 *        can store objects, references, wrapper primitives
 *        resize is dynamic by java
 *        initial capacity is 10
 *
 *        add/RemoveFromBack() is O(1)
 *        removeAtIndex/Front is O(n)
 *        amortized O(1) addToBack
 *
 *        Array vs ArrList
 *         Static memory/ dynamic memory
 *         empty cells/ no empty cells
 *         storage flexible/ not flexible because you have to do wrapper around primitives
 *         Similarities - resizing cost is O(n)
 *         add/removeFromFront is O(n)
 *
 *         Linked List:
 *         require head of type node, not contiguous memory REALLY dynamic, stores data of next reference
 *         you ALWAYS have to have head for a linked list
 *         addToFront is O(1), only creating memory that you need
 *
 *         TYPES- ANYTHING, primitive, objects, primitive wrappers, references
 *         add steps- create node, store data, point node's next to head, set node to become head
 *
 *
 *
 *     }
 *
 *     Friday Lecture {
 *         write code out by hand! will see improvement
 *
 *         ArrayList:
 *         the add operation for addToBack ALWAYS has two steps: add element at index size, increment size
 *
 *         addToBack of full array is O(n), when size == capacity, it is the trigger to resize the array.
 *
 *         addToBack of full array is O(n) because you have to make a 2n size array then add all n elements onto array
 *         then add n to back, then increment size,
 *         lets say add 5 elements to capacity 5 and size 5, cost is 5 * 2 = 10 steps
 *         copy array (5), add 5 elements (5), increment size(1)
 *         basically, average cost of adding to back as array gets larger is O(1)
 *
 *         Singly Linked List:
 *         All nodes will contain data, if null, we will have it point to null,
 *         when instantiating singly linked list, set head = to null.
 *
 *         steps for adding to head? create node, you set head's next value to node
 *         you must keep head so you do not lose linked list
 *
 *         addToBack, create node, set next reference to null, create another node to to traverse through list
 *         while(current.next != null) current = current.next...
 *         current.next = node
 *         tail = node  O(n)
 *
 *         removeFromhead,
 *         head is set to head's next value, done in O(1)
 *
 *         removeFromBack is O(n)
 *         while(current.next.next != null)
 *         current.next = null;
 *
 *         SLL with head and tail:
 *         add to front is O(1) add to back is O(1)
 *         removeFromBack is O(n)
 *
 *         Double Linked List:
 *         head and tail references, next and previous references
 *         prev<-node->next
 *         addAtHead() set previous to null, next referenced to null, head.previous will be node, then we say head is
 *         previous
 *         addAtTail/Head() us O(1)
 *
 *         removeFromHead/Tail() is null
 *
 *
 *
 *     }
 * }
 */

public class LectureNotes32 {
}
