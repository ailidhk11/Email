import java.util.ArrayList;
/**
 * A class that holds an ArrayList of EMail objects.
 *
 * @author Ailidh
 * @version 1.0
 */
public class EmailClient
{
    // An ArrayList of EMail objects.
    private ArrayList<EMail> emails;

    /**
     * Constructor for objects of class EmailClient
     */
    public EmailClient()
    {
        // initialise instance variables
        emails = new ArrayList<>();
    }
    
    /**
     * Return EMail objects in collection.
     * @return the EMail objects in the collection.
     */

    public ArrayList getEmails()
    {
        return emails;
    }
    
    /**
     * Add an EMail onject to the collection.
     * @param emailToAdd The EMail object to be added to the collection.
     * @return True if EMail object added, otherwise false.
     */
    
    public boolean addEmail(EMail emailToAdd)
    {
        boolean added;
        if(emails.contains(emailToAdd)) {
            added = false;
        }
        else {
            emails.add(emailToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     * Remove an EMail object from the collection.
     * @param index The index of the EMail object to be removed.
     */
    public void removeEmail(int index)
    {
        if(indexValid(index)) {
            emails.remove(index);
            System.out.println("EMail object removed successfully from your collecton!");
        }
        else {
            System.out.println("This email is not in your collection to delete!");
        }
    }
    
    /**
     * Tells caller if the EmailClient is empty or not.
     * @return False if no objects in EmailClient, otherwise true.
     */
    public boolean hasObjects()
    {
        boolean hasObjects;
        if(emails.isEmpty()) {
            hasObjects = false;
        }
        else {
            hasObjects = true;
        }
        return hasObjects;
    }
    
    /**
     * Prints the details of emails in the collection, or displays a message if there are no emails to print.
     */
    public void printEmails()
    {
        if(emails.size() > 0) {
            for(EMail email : emails) {
                email.printDetails();
            }
        }
        else {
            System.out.println("There are no EMail objects in this collection to list.");
        }
    }
    
    /**
     * Search for emails received from a specific contact that contain attachments.
     * Displays a message if no emails are in collection to search through.
     * @param searchString The contact to see emails from. 
     */
    public void listRelevantEmails (String searchString)
    {
        if(emails.isEmpty()){
            System.out.print("There are no objects in your collection to search!.");
        }
        else
        {
            int index = 0;
            int notFound = 0;
            while (index < emails.size()) 
            {
                EMail email = emails.get(index);
                if(email.getFrom() == searchString && email.getAttachment() == true)  {
                    email.printDetails();
                    index++;
                }
                else if(email.getFrom() != searchString) {
                    notFound++;
                    index++;
                    if (notFound == emails.size()){
                        System.out.println("No results from " + searchString + " were found.");
                    }
                }   
                else {
                    index++;
                }
            }
        }
    }
    
    /**
     * Check if an integer value to be used as an index is a valid index position for the collection.
     * @param index The index positon to check validity of.
     */
    private boolean indexValid(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= emails.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}
