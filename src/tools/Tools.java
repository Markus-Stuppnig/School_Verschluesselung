package tools;

import java.util.Random;

public class Tools {

    private static Random random = new Random();

    public static boolean isNumber(char character) {
        return (character >= '0' && character <= '9');
    }

    public static boolean isLowLetter(char character) {
        return (character >= 'a' && character <= 'z');
    }

    public static boolean isHighLetter(char character) {
        return (character >= 'a' && character <= 'z');
    }

    public static boolean isLetter(char character) {
        return isLowLetter(character) || isHighLetter(character);
    }

    public static char getRandomLowLetter() {
        return (char) (random.nextInt(26) + 'a');
    }

    public static char getRandomHighLetter() {
        return (char) (random.nextInt(26) + 'A');
    }

    public static char getRandomNumber(int max) {
        return (char) (random.nextInt(max + 1) + '0');
    }

    public static int getNumberOfLowLetter(char character) {
        return character + 1 - 'a';
    }

    public static int getNumberOfHighLetter(char character) {
        return character + 1 - 'A';
    }

    public static char getChangedChar(char character, int change) {
        char zw = (char) (character + change);
        if(zw > 'z') zw -= (change > 0) ? 26: -26;
        return zw;
    }

    public static String decryptChar(char character, int count) {
        final int finalDez = Tools.getNumberOfHighLetter(character) + count;
        System.out.println(character + ": " + finalDez);
        return Integer.toHexString(finalDez);
    }
}