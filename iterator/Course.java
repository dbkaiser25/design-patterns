package iterator;

/**
 * A class that defines a course
 * @author dbkaiser
 */

public class Course 
{
   /**
    * An array of assignments that are unique for that course
    */
   private Assignment[] assignments;

   private int count;
   private String name;
   private String title;
   
   /**
    * Creates an instance of a course with the following attributes
    * @param name A string for name of the course
    * @param title A string for the title of the course 
    */
   public Course(String name, String title)
   {
        this.name = name;
        this.title = title;
        count = 0;
        this.assignments = new Assignment[5];
   }

   /**
    * A method to add an assignment to the array of assignments for the course
    * @param title a string for the title of the assignment
    * @param description a string for the description of the assignment
    * @param topic a topic for the topic of the assignment
    */
   public void addAssignment(String title, String description, Topic topic )
   {
        Assignment assignment = new Assignment(title,description,topic);

        if(count == assignments.length)
        {
          assignments = growArray(assignments);
        }
        assignments[count] = assignment;
        count++;
   }

   /**
    * method to return an the iterator so the array of assignments can be traversed
    * @return the name of the iterator
    */
   public AssignmentIterator createIterator()
   {
        return new AssignmentIterator(assignments);
   }

   /**
    * method that returns a string description of the course
    * @return a string for the description of the course
    */
   public String toString()
   {
        return name + ": " + title;
   }

   /**
    * A method to increase the size of the assignments array so that more assignments can be added
    * @param first the original array of assignments
    * @return the new array of assignments with an increased size
    */
   private Assignment[] growArray(Assignment[] first)
   {
     if(first == null)
          return first;
     else
     {
          Assignment[] second = new Assignment[first.length * 2];
          for(int i = 0; i < first.length; i++)
          {
               second[i] = first[i];
          }
          return second;
     }      
   }
}
