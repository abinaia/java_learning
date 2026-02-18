class Basics {
    public static void main(String[] args) {
        Boolean rain = true;
       if (rain)
       {
        Basics2.CheckBoolean();
       }
       else {
        System.out.println("It's not raining");
       }
    }
}

class Basics2 {
    public static void CheckBoolean() {
        Boolean rain = true;
       if (!rain)
       {
        System.out.println("It's raining");
       }
       else {
        System.out.println("It's not raining");
       }
    }
}