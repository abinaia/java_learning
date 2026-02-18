import java.util.Scanner; 
class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //create a scanner object to take input from the user
            int num1 = sc.nextInt(); //take input for num1
            int num2 = sc.nextInt(); //take input for num2  
            int num3 = sc.nextInt(); //take input for num3
        int result1 =  num1*num2*num3;
        int result2 = num1+num2+num3;
        int result3 = result1/result2;
        System.out.println(result3);
    }
}