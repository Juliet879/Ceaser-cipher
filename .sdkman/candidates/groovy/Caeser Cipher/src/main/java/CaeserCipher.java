public class CaeserCipher {
    public static void main(String[] args) {
//        StringBuilder var = java("God", 4);
//        System.out.println(var);
//
        StringBuilder var = decipher("Ksh",4);
        System.out.println(var);


    }
    public static StringBuilder java(String word, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        StringBuilder holder = new StringBuilder();
        int WordLength = word.length();

        for (int index = 0; index < WordLength; index++) {
            char ch = word.charAt(index);

    }