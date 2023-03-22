public class CharArithmetic {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';

        // addition
        char result = (char) (c1 + c2);
        System.out.println("c1 + c2 = " + result);

        // subtraction
        result = (char) (c2 - c1);
        System.out.println("c2 - c1 = " + result);

        // multiplication
        result = (char) (c1 * c2);
        System.out.println("c1 * c2 = " + result);

        // division
        result = (char) (c2 / c1);
        System.out.println("c2 / c1 = " + result);
    }
}
