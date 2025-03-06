public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Primitive types
        byte b = 127; // 8 bits from -128 to 127
        short s = 32767; // 16 bits from -32768 to 32767
        int i = 2147483647; // 32 bits from -2147483648 to 2147483647
        // long must be followed by L or l
        long l = 9223372036854775807L; // 64 bits from -9223372036854775808 to 9223372036854775807
        // float must be followed by F or f
        float f = 3.4028235F; // 32 bits
        double d = 1.7976931348623157; // 64 bits with 15 decimal digits
        char c = 'A'; // 16 bists must be between single quotes ''
        boolean bool = true; // logical value must by true or false

        // Not primitive types
        // This class has many methods to manipulate strings
        String str = "Hello World!"; // String is a class representing a sequence of characteres

        // Print the values and types
        System.out.println("length: " + str.length()
                + "\ntoUpperCase: " + str.toUpperCase()
                + "\ntoLowerCase: " + str.toLowerCase());
        System.out.println("byte type: " + b);
        System.out.println("short type: " + s);
        System.out.println("int type: " + i);
        System.out.println("long type: " + l);
        System.out.println("float type: " + f);
        System.out.println("double type: " + d);
        System.out.println("char type: " + c);
        System.out.println("boolean type: " + bool);

    }
}
