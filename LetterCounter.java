import java.util.Scanner;

public class LetterCounter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a line of text: ");
        String line = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        
        StringBuilder neitherLetters = new StringBuilder();
        for (int index = 0; index < line.length(); index++) {
            char ch = line.charAt(index);
            
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            } 
            else if (ch != ' ') {
                neitherLetters.append(ch);
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Neither: " + neitherLetters.toString());
    }
}
