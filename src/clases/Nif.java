package clases;


public class Nif {

    public static void main(String... args) {

        String nif = "12345678a";
        if (Solution.isNif(nif))
            System.out.printf("%s", nif.substring(0, nif.length() - 1));
        else
            System.out.println("NIF no valido");
    }

    static class Solution {

        public static boolean isNif(String nif) {
            return nif.length() == 9
                   && Character.isLetter(nif.charAt(nif.length() - 1))
                   && areDigits(nif);
        }

        private static boolean areDigits(String nif) {
            char[] characters = nif.substring(0, nif.length() - 1).toCharArray();
            for (char character : characters)
                if (!Character.isDigit(character))
                    return false;
            return true;
        }
    }
}