

public class Student {
    
    private int usn;
    private String email;

    public void setUsn(int USN)/* //why this method is used? to set the value of usn from outside the class 
    as it is private and cannot be accessed directly */
     {
        this.usn = USN;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getUsn()
    //to get the value of usn from outside the class as it is private and cannot be accessed directly
    {
        return this.usn;
    }
    public String getEmail() {
        return this.email; 
    }

}