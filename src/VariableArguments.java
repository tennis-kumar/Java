public class VariableArguments {

    // A regular method
    static int sum(int a, int b){
        return a+b;
    }


    // A function/method with varargs can be created in Java using th e following syntax
    static int sum(int ...arr){ // similar to  '...' Spread Operator in JavaScript
        // 'arr' here is Available as int [] arr;
        int result =0;
        for (int a: arr) {
            result += a;
        }
        return result;
        //This method will work even if no args are passed
    }



    // This method will not work if no arguments are passed, needs at-least one argument
    static int sum1(int x,int ...arr){ // similar to  '...' Spread Operator in JavaScript
        // 'arr' here is Available as int [] arr;
        int result =x;
        for (int a: arr) {
            result += a;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("------------------fixed Args---------------------");
        System.out.println("The sum of 4 and 5 is:"+ sum(4,5));
        System.out.println("The sum of 5 and 4 is:"+ sum(5,4));
        System.out.println("------------------Varargs---------------------");
        System.out.println("The sum of 4, 5 and 6 is: "+sum(4,5,6));
        System.out.println("------------------------------------------------");
        System.out.println("The sum of 5, 6 and 7 is: "+sum1(5,6, 7));
        System.out.println("The sum of 4, 5, 6 and 7 is: "+sum1(4,5,6,7));
    }
}
