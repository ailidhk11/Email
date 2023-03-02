
/**
 * A class storing details of an email that has been received. 
 *
 * @author Ailidh
 * @version 1.0
 */
public class EMail
{
    // The text containted in the email.
    private String text;
    // Who the email was sent from.
    private String from;
    // If the email has an attachment or not. 
    private boolean attachment;

    /**
     * Constructor for objects of class EMail
     */
    public EMail()
    {
        
        text = "";
        from = "";
        attachment = false;
    }
    
    /**
     * A constructor for objects of class EMail that takes parameters. 
     * @param newEmail The email text.
     * @param emailFrom The sender of the email.
     * @hasAttachement If the email has an attachment or not.
     */
    public EMail(String newEmail, String emailFrom, boolean hasAttachment)
    {
        text = newEmail;
        from = emailFrom;
        attachment = hasAttachment;
    }
    
    /**
     * Set the text of the email.
     * @param emailText The text to be in the email.
     */
    public void setEmail(String emailText)
    {
        text = emailText;
    }
    
    /**
     * Get the text of the email.
     * @ return email text.
     */
    public String getEmail()
    {
        return text;
    }
    
    /**
     * Set who the email was from 
     * @param emailFrom Who sent the email.
     */
    public void setFrom(String emailFrom)
    {
        from = emailFrom;
    }
    
    /**
     * Get who sent the email.
     * @return Who sent the email.
     */
    public String getFrom()
    {
        return from;
    }
    
    /** 
     * Add an attachment to an email.
     */
    public void addAttachment()
    {
        attachment = true;
    }
    
    /**
     * Get details of whether email has an attachment or not.
     * @return boolean True if attachment included, otherwise false
     */
    public boolean getAttachment()
    {
        return attachment;
    }
    
    /**
     * Print all the details of an email.
     */
        public void printDetails()
    {
        System.out.println("Email: " + text);
        System.out.println("From: " + from + ".");
        if(attachment == true) {
            System.out.println("This email has an attachment.");
        }
        else {
            System.out.println("This email does not have any attachments.");
        }
        System.out.println();
    }
    
    /**
     * Get all the details of an email.
     * @return Email details.
     */
    public String getDetails()
    {
        if(attachment == true) {
            return("Email: " + text + ". From " + from + ". This email has an attachment.");
        }
        else {
            return("Email: " + text + ". From " + from + ". This email has no attachments.");
        }
    }
}
