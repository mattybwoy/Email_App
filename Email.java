package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        //Call a method asking for department - return department

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Department Codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter Department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£%";
        char[] password = new char[length];
        for (int i = 0; i <length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity

    // Set alternate email

    // Change the password
}
