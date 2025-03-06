public class Operadores {

    public static void main(String[] args) {
        /* String concatenation operations test */
        String concatenation = "?";

        // Operation start with integer 1+1+1 = 3
        // When concat string "1" everything turn into string: "31"
        concatenation = 1 + 1 + 1 + "1";
        System.out.println("1 + 1 + 1 + \"1\" = " + concatenation); // Output: "31"

        // Operation start with integer 1
        // then concat string turning all into string: "1111"
        concatenation = 1 + "1" + 1 + 1;
        System.out.println("1 + \"1\" + 1 + 1 = " + concatenation); // Output: "1111"

        // Operation start with integer 1
        // then concat string turning all into string: "1111"
        concatenation = 1 + "1" + 1 + "1";
        System.out.println("1 + \"1\" + 1 + \"1\" = " + concatenation); // Output: "1111"

        // Operation start with string "1" turning all into string: "1111"
        concatenation = "1" + 1 + 1 + 1;
        System.out.println("\"1\" + 1 + 1 + 1 = " + concatenation); // Output: "1111"

        // Here the () is used to make the sum operation firt
        // then concat with string: "1"
        concatenation = "1" + (1 + 1 + 1);
        System.out.println("\"1\" + (1 + 1 + 1) = " + concatenation); // Output: "13"

        /* Sum operation */
        int number = 1;
        // print before increment
        System.out.println(number++); // Output: 1

        // print after increment
        System.out.println(++number); // Output: 3
    }
}
