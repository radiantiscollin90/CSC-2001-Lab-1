//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // add six to a number
    public static int addSix(int a){
        return a + 6;
    }

    public static int addSeventeen(int a) {
        return a + 17;
    }

    //removes the '*' from the beginning and the end of a string
    public static String decryptorA(String encryptedText) {
        if(encryptedText.startsWith("*") && encryptedText.endsWith("*")) {
            return encryptedText.substring(1, encryptedText.length() - 1);
        } else {
            return encryptedText;
        }
    }

    //swaps the first and last index of a string
    public static String decryptorB(String encryptedText) {
        if(!encryptedText.isEmpty()) {
            return encryptedText.charAt(encryptedText.length() - 1) +
                    encryptedText.substring(1, encryptedText.length() - 1) +
                    encryptedText.charAt(0);

        }else {
            return null;
        }
    }

    //checks if the string ends with an "ay", removes it, then sends the last index back to the front.
    public static String decryptorC(String encryptedText) {
        String tempText;
        if(encryptedText.endsWith("ay")) {
            tempText = encryptedText.substring(0, encryptedText.length() - 2);
            return tempText.charAt(tempText.length() - 1) +
                    tempText.substring(0, tempText.length() - 1);

        } else {
            return null;
        }
    }

    //swaps the middle and last index of a string
    public static String decryptorD(String encryptedText) {
        int targetIndex = encryptedText.length() / 2;
        if(!encryptedText.isEmpty()) {
            return encryptedText.substring(0, targetIndex) +
                    encryptedText.charAt(encryptedText.length() - 1) +
                    encryptedText.substring(targetIndex, encryptedText.length() - 1);
        } else {
            return null;
        }
    }

    //unreverses the first half of the string, then brings the second half back to the front
    public static String decryptorLA(String encryptedText) {
        if(encryptedText.isEmpty()) return null;
        int targetIndex = (encryptedText.length() / 2);
        String firstHalf = encryptedText.substring(0,targetIndex + 1);
        String secondHalf = encryptedText.substring(targetIndex + 1, encryptedText.length());
        String newHalf = "";
        //unreverse the first half
        for(int i = firstHalf.length() - 1; i >= 0; i--) newHalf = newHalf + firstHalf.charAt(i);

        return secondHalf + newHalf;
    }


    //for every vowel in the string, swap it for the vowel in the left of it in the vowel rhyme ( a e i o u)
    public static String decryptorLB(String encryptedText) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] upperVowels = {'A', 'E', 'I', 'O', 'U'};
        if(encryptedText.isEmpty()) return null;

        //for lowercase

        encryptedText = encryptedText.replace(vowels[0], 'A');
        for(int i = 1; i < vowels.length; i++) {
            encryptedText = encryptedText.replace(vowels[i], vowels[i - 1]);
        }
        encryptedText = encryptedText.replace('A', vowels[4]);

        //for uppercase
        encryptedText = encryptedText.replace(upperVowels[0], '@');
        for(int i = 1; i < upperVowels.length; i++) {
            encryptedText = encryptedText.replace(upperVowels[i], upperVowels[i - 1]);
        }

        encryptedText = encryptedText.replace('@', vowels[4]);

        return encryptedText;
    }

    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + Main.addSix(i));
        }
    }
}
