class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (a / b)); // 0
        System.out.println("Modulus: " + (a % b)); // 10

        // Relational Operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Greater than: " + (a > b)); // false
        System.out.println("Less than: " + (a < b)); // true
        System.out.println("Greater than or equal to: " + (a >= b)); // false
        System.out.println("Less than or equal to: " + (a <= b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators
        int c = a; // Assignment
        c += 5; // Addition assignment, c = c + 5
        System.out.println("c after addition assignment: " + c); // 15

        c -= 3; // Subtraction assignment, c = c - 3
        System.out.println("c after subtraction assignment: " + c); // 12

        c *= 2; // Multiplication assignment, c = c * 2
        System.out.println("c after multiplication assignment: " + c); // 24

        c /= 4; // Division assignment, c = c / 4
        System.out.println("c after division assignment: " + c); // 6

        c %= 5; // Modulus assignment, c = c % 5
        System.out.println("c after modulus assignment: " + c);
}
}