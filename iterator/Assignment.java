package iterator;

/**
 * A class for an assignment
 * @author dbkaiser
 */

public class Assignment 
{
    private String title;
    private String description;
    private Topic topic;

    /**
     * Creates a new assignment with the following attributes
     * @param title the title of the assignment
     * @param description a description of the assignment
     * @param topic the category the assignment falls into
     */
    public Assignment(String title, String description, Topic topic)
    {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /**
     * A method that determines if the assignment matches a specified topic
     * @param topic the name of the topic to be matched
     * @return a boolean if the assignment is of the specified topic
     */
    public boolean hasTopic(Topic topic)
    {
        if(this.topic.equals(topic))
            return true;
        else
            return false;
    }

    /**
     * A method to return a string description of an assignment in a user friendly format
     * @return a string of the assignment description
     */
    public String toString()
    {
        return title + ": " + description;
    }
}
