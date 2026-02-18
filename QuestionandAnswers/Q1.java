//get input for a variable name and age, then print it
import java.util.Scanner; //import the Scanner class to take input from the user
import java.lang.System; //import the System class to print output to the console
class Question1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in); //create a scanner object to take input from the user
        String name = sc.nextLine(); //take input for name
        int age = sc.nextInt(); //take input for age
        sc.nextLine(); //consume the newline character left by nextInt()
        String Address = sc.nextLine(); //take input for address
        System.out.println("Your Name: " + name); //print name
        System.out.println("Your Age: " + age); //print age
        System.out.println("Your Address: " + Address); //print address
    }
}
