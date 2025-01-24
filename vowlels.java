

public class vowlels {
    static boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = "compuuuter";
        StringBuilder result = new StringBuilder();

        boolean prevVowel = false;
        for (int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if (!isVowel(c)) {
                
                result.append(c);
                //prevVowel = false;
            } else {
                (!isVowel(c) || (i > 0 && !isVowel(input.charAt(i - 1))) || (i < input.length() - 1 && !isVowel(input.charAt(i + 1))))
                {
                    result.append(c);
                }
            
              
                
            }
        }

        System.out.println("Result after removing consecutive vowels: " + result.toString());
    }
}

