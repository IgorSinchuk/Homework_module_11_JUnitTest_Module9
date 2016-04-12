import java.util.ArrayList;
import java.util.List;

public class PrintDrive {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new AudioFile("audiofile"));
        files.add(new TextFile("textfile"));
        files.add(new TextFile("imagefile"));

        System.out.println("File\'s List: " + files + "\n");
        System.out.println("Encrypt File's List: ");
        System.out.println(encrypt((files.toString()), 2) + "\n");
        System.out.println("Decrypt File's List: ");
        System.out.println(decrypt((encrypt((files.toString()), 2)), 2));
    }

    public static String encrypt(String str, int keyLength) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (keyLength % 26);
                if (c > 'Z')
                    c = c - 26;
            } else if (Character.isLowerCase(c)) {
                c = c + (keyLength % 26);

                if (c > 'z')
                    c = c - 26;
            }
            encrypted = encrypted + (char) c;
        }
        return encrypted;
    }

    public static String decrypt(String str, int keyLength) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {

            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c - (keyLength % 26);

                if (c < 'A')
                    c = c + 26;
            } else if (Character.isLowerCase(c)) {
                c = c - (keyLength % 26);

                if (c < 'a')
                    c = c + 26;
            }
            decrypted = decrypted + (char) c;
        }
        return decrypted;
    }
}

