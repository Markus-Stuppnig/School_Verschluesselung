package decrypt;

import tools.Tools;

public class Decrypt {

    public static String decrypt(String message) {



        String formfaktor = "";

        final char form = Tools.getRandomLowLetter();
        final int formnumber = Tools.getNumberOfLowLetter(form);

        final String offset = Tools.getRandomNumber(8) + String.valueOf(Tools.getRandomHighLetter());

        //Verschlüsselungsfaktor
        formfaktor += (formnumber < 10) ? "0": String.valueOf(formnumber).charAt(0);
        formfaktor += form;
        formfaktor += String.valueOf(formnumber).charAt(String.valueOf(formnumber).length() - 1);
        formfaktor += Tools.getChangedChar(form, 13);

        //PositionsInformationen
        formfaktor += offset;

        //BestätigungsInformation
        formfaktor += Tools.getChangedChar(form, 4);

        //Decrypt
        String decrypted = "";

        int first = offset.charAt(0);
        int second = Tools.getNumberOfHighLetter(offset.charAt(1));
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        final int count = first * second;

        System.out.println("Offset: " + offset);
        System.out.println("Count: " + count);

        for(Character character : message.toCharArray()) {
            //decrypted += Tools.decryptChar(character, count);
        }

        System.out.println(formfaktor + "-" + decrypted);
        return decrypted;
    }

    public static void main(String[] args) {
        decrypt("ABC");
    }
}