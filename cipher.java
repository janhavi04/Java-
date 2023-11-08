import java.util.Scanner;

public class cipher {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Type 'encode' to encrypt, type 'decode' to decrypt:");
            String direction = scanner.nextLine();
            System.out.println("Type your message:");
            String text = scanner.nextLine().toLowerCase();
            System.out.println("Type the shift number:");
            int shift = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            shift = shift % 26;
            String result = caesar(text, shift, direction);
            System.out.println("Here's the " + direction + "d result: " + result);

            System.out.println("Type 'yes' if you want to go again, or type 'no'.");
            String userInput = scanner.nextLine();
            if (userInput.equals("no")) {
                shouldContinue = false;
            }
        }
    }

    public static String caesar(String startText, int shiftAmount, String cipherDirection) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String endText = "";

        if (cipherDirection.equals("decode")) {
            shiftAmount *= -1;
        }

        for (char character : startText.toCharArray()) {
            if (alphabet.contains(String.valueOf(character))) {
                int position = alphabet.indexOf(character);
                int newPosition = (position + shiftAmount + 26) % 26;  // Ensure wrapping around the alphabet
                endText += alphabet.charAt(newPosition);
            } else {
                endText += character;
            }
        }

        return endText;
    }
}
