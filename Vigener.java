package Button.CipherMetods;

public class Vigener {
    public static String text;
    public static String keyVigener;

    public static void encrypt() {// encrypt Method
        StringBuilder encrypted = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) {
                int keyChar = Character.toUpperCase(keyVigener.charAt(keyIndex)) - 'A';
                int cipherChar = (c - 'A' + keyChar) % 26 + 'A';
                encrypted.append((char) cipherChar);
                keyIndex = (keyIndex + 1) % keyVigener.length();
            } else if (Character.isLowerCase(c)) {
                int keyChar = Character.toLowerCase(keyVigener.charAt(keyIndex)) - 'a';
                int cipherChar = (c - 'a' + keyChar) % 26 + 'a';
                encrypted.append((char) cipherChar);
                keyIndex = (keyIndex + 1) % keyVigener.length();
            } else {
                encrypted.append(c);
            }
        }
        text = encrypted.toString();
    }
    public static void decrypt() {// decrypt Method
        StringBuilder decrypted = new StringBuilder();
        int keyIndex = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) {
                int keyChar = Character.toUpperCase(keyVigener.charAt(keyIndex)) - 'A';
                int plainChar = (c - 'A' - keyChar + 26) % 26 + 'A';
                decrypted.append((char) plainChar);
                keyIndex = (keyIndex + 1) % keyVigener.length();
            } else if (Character.isLowerCase(c)) {
                int keyChar = Character.toLowerCase(keyVigener.charAt(keyIndex)) - 'a';
                int plainChar = (c - 'a' - keyChar + 26) % 26 + 'a';
                decrypted.append((char) plainChar);
                keyIndex = (keyIndex + 1) % keyVigener.length();
            } else {
                decrypted.append(c);
            }
        }

        text = decrypted.toString();
    }
}
