public class Practise_set2_chapter2 {
    public static void main(String[] args) {
        float a = 7/4 * 9/2; // will return integer value 4.0
        System.out.println(a);

        float b = 7/4.0f * 9/2.0f; // will return correct value 7.4
        System.out.println(b);
        char grade = 'B';
        //Encrypting
        grade = (char) (grade + 8);
        System.out.println("Encrypted Grade is: "+grade);
        //Decrypting
        grade = (char) (grade -8);
        System.out.println("Decrypted grade is: "+grade);
    }
}
