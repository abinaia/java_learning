package getuserinputfromterminal;

import java.util.Scanner;

class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        System.out.println("Enter your address in 3 lines:");
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();

        String address = line1 + "\n" + line2 + "\n" + line3; // combine lines with newline

        System.out.println("\nYour Name: " + name);
        System.out.println("Your Age: " + age);
        System.out.println("Your Address:\n" + address);
    }
}
