public class MethodOverloading {

    // Method overloading cannot be performed by changing return type of the methods.

    static  void foo(){
        System.out.println("Good morning foo!");
    }
    //Overloaded function -> different function with same name but different functionality
    static  void foo(int a ){ // 'int a' is a parameter, which will receive some value when method is called
        System.out.println("Good morning "+a+" Bro!!!");
    }

    static void foo(String a, int b){
        System.out.println("Good "+a+" "+b+" Bro!!");
    }

    public static void main(String[] args) {

        foo();
        foo(3000); // here 'a' is an argument , which we are passing to the method
        foo(50);
        foo("morning",3);
        foo("Afternoon",50);
        // Arguments are actual!!!!!!!!

    }
}
