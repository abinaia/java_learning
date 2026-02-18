/* class Addition {

    public static int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3; //addition of three numbers
    }
    public static void main(String args[]) {
        int num1=5;
        int num2 =7;
        int num3=10;
        System.out.println("The sum of num1, num2 and num3 is: " + addNumbers(num1, num2, num3));
    
    }
} */


class Additiondef {
    public static int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3; //addition of three numbers
    }
}

class Mainclass {
    public static void main(String args[]) {
        int num1=5;
        int num2 =17;
        int num3=10;
        System.out.println("The sum of num1, num2 and num3 is: " + Additiondef.addNumbers(num1, num2, num3));  //Look at how a function from one class is used in another class without creating an object of the first class. This is possible because the function is static.
    
    }
}