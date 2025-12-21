class CountVowels{
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        int whiteSpaces = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            else if(ch == ' ') {
                whiteSpaces++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of white spaces: " + whiteSpaces);
    }
}