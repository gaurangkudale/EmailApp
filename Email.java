import java.util.Scanner;

public class Email {
    private String FirstName;
    private String LastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "company.com";
    private int mailBoxCapacity = 10000;
    private int defaultPasswordLength = 10;

    //Constructor to receive the Firstname and LastName
    public Email(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        System.out.println("New Employe :- "+ this.FirstName +" "+ this.LastName );

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        //Combine elements to generate Email
        email = FirstName.toLowerCase() + "." + LastName.toLowerCase() +"@" + department + "."+ companySuffix;
        System.out.println("Your email is : "+ email);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+ this.password);
    }

    //Ask for department
    private String setDepartment(){
        System.out.println("Department Codes\n1 for Sales\n2 for Devlopment\n3 for Accounting\no for none\nEnter Deparment Code : ");
        Scanner in = new Scanner(System.in);
        int depChoise = in.nextInt();
        if(depChoise == 1 ){return "sales";}
        else if(depChoise == 2) {return "devlopment";}
        else if(depChoise == 3) {return "accounting";}
        else {return "";}
    }

    //Generate Randome Password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //Set the mailBox Capacity 
    public void setMailBocCapacity(int Capacity){
        this.mailBoxCapacity = Capacity;
    }

    //Set the alternate Email
    public void seAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String chnPassword){
        this.password = chnPassword;
    }

    //Get
    public int getMailboxCapacity(){return mailBoxCapacity;}

    public String getChangePassword() {return password;}

    public String getAlternateEmail() {return alternateEmail;}

    //Method to display name ,Email,Mailbox Capacity

    public String showInfo(){
        return "\n*DISPLAY NAME:- " + FirstName + " " + LastName +
                "\n*COMPANY EMAIL:- " + email +
                "\n*MAILBOX CAPACITY:- " +mailBoxCapacity+ "mails per employe";
    }

}
