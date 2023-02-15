public class Switch_Case {
    public static void main(String[] args) {
        String var = "Harry";

        // traditional switch
        switch (var){
            case "name":
                System.out.println("name");
                break;
            case "naMe":
                System.out.println("naMe");
                break;
            case "Name":
                System.out.println("Name");
                break;
            case "Harry":
                System.out.println("Harry");
                break;
            default:
                System.out.println(var);
        }

        // Enhanced Switch , similar to arrow functions in JavaScript
        // Break stmnt is not required in enhanced switch
        int num = 10;
        switch (num) {
            case 18 -> {
                System.out.println("name");
                System.out.println("yo");}
            case 25 -> System.out.println("naMe");
            case 40 -> System.out.println("Name");
            default -> System.out.println(num);
        }

    }
}
