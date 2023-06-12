package Button.CipherMetods;


public class Caesar {

    public static String sentence;
    public static int key;
    public static void encrypt() {// encrypt Method
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isUpperCase(c)) {
                int cipherChar = (c - 'A' - key + 26) % 26 + 'A';
                encrypted.append((char) cipherChar);
            } else if (Character.isLowerCase(c)) {
                int cipherChar = (c - 'a' - key + 26) % 26 + 'a';
                encrypted.append((char) cipherChar);
            } else {
                encrypted.append(c);
            }
        }
          sentence = encrypted.toString();
    }
    public static void decrypt() {// decrypt Method
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isUpperCase(c)) {
                int plainChar = (c - 'A' + key) % 26 + 'A';
                decrypted.append((char) plainChar);
            } else if (Character.isLowerCase(c)) {
                int plainChar = (c - 'a' + key) % 26 + 'a';
                decrypted.append((char) plainChar);
            } else {
                decrypted.append(c);
            }
        }
        sentence = decrypted.toString();
    }
}
