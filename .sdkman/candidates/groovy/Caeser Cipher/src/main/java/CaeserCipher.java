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

            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char shiftedWord = (char) (ch + shift);
                    if (shiftedWord > 'z') {
                        holder.append((char) (ch - (26 - shift)));
                    } else {
                        holder.append(shiftedWord);
                    }
                } else if (Character.isUpperCase(ch)) {
                    char shiftedWord = (char) (ch + shift);
                    if (shiftedWord > 'Z') {
                        holder.append((char) (ch - (26 - shift)));
                    } else {
                        holder.append(shiftedWord);
                    }
                }

            }
            return holder;
        }

        private static StringBuilder decipher(String word, int shift) {
            if (shift > 26) {
                shift = shift % 26;
            } else if (shift < 0) {
                shift = (shift % 26) + 26;
            }
            StringBuilder holder2 = new StringBuilder();
            int WordLength2 = word.length();


        }