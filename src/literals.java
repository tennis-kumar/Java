public class literals {
    public static void main( String[] args){
        // literals are variables which have constant values assigned to them
        byte ag = 5;
        int age = 22;
        short sh = 45; // short can only small small values
        long num = 566666666666l; // need to add l/L at end of value while working with Long data type
        char ch = 'A'; // should always be enclosed in '' single quotes
        float f1 = 5.6f; // by default java decimal values are read as double, to convert/ specify as float use f after the value
        double d1 = 4.66;
        double d2 = 4.78d; // can also use d to specify as double / optional, by default d is assigned even if we don't specify
        System.out.println(age);
    }
}
