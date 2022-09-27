package iterator;

/**
 * A class to iterate over an array of assignments
 * @author dbkaiser
 */

import java.util.Iterator;

public class AssignmentIterator implements Iterator
{
    private Assignment[] assignments;
    private int position;

    /**
     * Creates an instance of the class to iterate over an array of assignments
     * @param assignments the name of the array containing the assignments
     */
    public AssignmentIterator(Assignment[] assignments)
    {
        this.assignments = assignments;
    }

    /**
     * A method that determines if the array of assignments is full or has space for more assignments
     * @return a boolean if the array is full
     */
    public boolean hasNext()
    {
        if((assignments == null || position >= assignments.length) || assignments[position] == null)
            return false;
        else
            return true;
    }

    /**
     * A method to return the next assignment in the array of assignments and increment the position
     * @return the next assignment in the assignments array
     */
    public Assignment next()
    {
        Assignment assignment = assignments[position];
        position += 1;
        return assignment;
    }
}
