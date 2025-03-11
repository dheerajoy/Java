import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        // .subString() = A Mathod used to exract portion of a string
        // .subString(startIndex, endIndex)

        Scanner sc = new Scanner(System.in);

        String email;
        String userName;
        String domain;
        
        System.out.print("Enter Your Email: ");
        email = sc.nextLine();

        if (email.contains("@")) {
            userName = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
    
            System.out.println(userName);
            System.out.println(domain);
        }else{
            System.out.println("emails must contain @");
        }

        sc.close();
    }
}