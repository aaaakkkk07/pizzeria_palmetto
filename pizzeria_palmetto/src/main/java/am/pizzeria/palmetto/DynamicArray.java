package am.pizzeria.palmetto;

/**
 * Homework: Implement a Dynamic Array (simplified version of java.util.ArrayList).
 *
 * Rules:
 * - Use a plain Object[] array internally to store elements.
 * - When the array is full, create a new array with double the capacity,
 *   copy all existing elements into it, and replace the old array.
 * - Keep track of the current number of elements (size) vs the array capacity.
 *
 * Good luck!
 */
public class DynamicArray {

    private Object[] data;
    private int size;

    /**
     * Creates a DynamicArray with the given initial capacity.
     * The size should start at 0.
     */
    public DynamicArray(int initialCapacity) {
        // TODO: implement
    }

    /**
     * Creates a DynamicArray with a default initial capacity of 10.
     */
    public DynamicArray() {
        // TODO: implement (hint: call the other constructor)
    }

    /**
     * Returns the number of elements currently stored in the array.
     */
    public int size() {
        // TODO: implement
        return 0;
    }

    /**
     * Returns true if the array contains no elements.
     */
    public boolean isEmpty() {
        // TODO: implement
        return false;
    }

    /**
     * Returns the element at the given index.
     * Should throw IndexOutOfBoundsException if index < 0 or index >= size.
     */
    public Object get(int index) {
        // TODO: implement
        return null;
    }

    /**
     * Replaces the element at the given index with the new value.
     * Should throw IndexOutOfBoundsException if index < 0 or index >= size.
     */
    public void set(int index, Object value) {
        // TODO: implement
    }

    /**
     * Adds a new element to the end of the array.
     * If the internal array is full, it should grow (double its capacity)
     * before adding the element.
     */
    public void add(Object value) {
        // TODO: implement
    }

    /**
     * Inserts a new element at the given index, shifting all elements
     * after that index one position to the right.
     * If the internal array is full, it should grow before inserting.
     * Should throw IndexOutOfBoundsException if index < 0 or index > size.
     */
    public void add(int index, Object value) {
        // TODO: implement
    }

    /**
     * Removes the element at the given index and returns it.
     * All elements after the removed one should shift one position to the left.
     * Should throw IndexOutOfBoundsException if index < 0 or index >= size.
     */
    public Object remove(int index) {
        // TODO: implement
        return null;
    }

    /**
     * Returns true if the array contains the given value.
     * Use .equals() for comparison (handle null safely).
     */
    public boolean contains(Object value) {
        // TODO: implement
        return false;
    }

    /**
     * Returns the index of the first occurrence of the given value,
     * or -1 if the value is not found.
     */
    public int indexOf(Object value) {
        // TODO: implement
        return -1;
    }

    /**
     * Removes all elements from the array. Size becomes 0.
     */
    public void clear() {
        // TODO: implement
    }

    /**
     * Returns a string representation of the array.
     * Example format: [1, 2, 3]
     * Empty array: []
     */
    @Override
    public String toString() {
        // TODO: implement
        return "[]";
    }

    // ---- Private helper methods ----

    /**
     * Doubles the capacity of the internal array and copies all
     * existing elements into the new array.
     * (Hint: create a new Object[] with double length, copy elements, reassign)
     */
    private void grow() {
        // TODO: implement
    }

    /**
     * Checks whether the given index is valid (0 <= index < size).
     * If not, throws IndexOutOfBoundsException.
     */
    private void checkIndex(int index) {
        // TODO: implement
    }
}
