public class Character {
    private char value;

   
    public Character(char value) {
        this.value = value;
    }

    
    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    // Method to check if the character is a vowel
    public boolean isVowel() {
        char lowercase = Character.toLowerCase(value);
        return lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u';
    }

    // Main method for testing
    public static void main(String[] args) {
        Character ch = new Character('A');
        System.out.println("Character: " + ch.getValue());
        System.out.println("Is vowel? " + ch.isVowel()); // Output: true
    }
}

