public class Main {
    public static void main(String[] args) {
        int number = 1879048193;   //entspricht 0x 7000 0001
        int number2 = -1879048193; //entspricht 0x 8FFF FFFF

        System.out.println("Nummer 1");
        toBinary(number);
        System.out.println("Nummer 2");
        toBinary(number2);
        System.out.println("\n");

        System.out.println("Nummer 1 ar:");
        toBinary(number >> 4);
        System.out.println("Nummer 2 ar:");
        toBinary(number2 >> 4);
        System.out.println("\n");

        System.out.println("Nummer 1 log:");
        toBinary(number >>> 4);
        System.out.println("Nummer 2 log: ");
        toBinary(number2 >>> 4);
        System.out.println("\n");

        /*
         * Der arithmetische Bitverschiebungsoperator beachtet das Vorzeichen, der logische nicht.
         *
         * Ist das Bit ganz links eine Eins, so wird beim Bitverschieben mit dem arithmetischen Bitverschiebungsoperator
         * von links an mit Einsen aufgefüllt, ist dem nicht so, so wird mit Nullen aufgefüllt.
         *
         * Anders verhält sich der logische Bitverschiebungsoperator, welcher grundsätzlich mit Nullen auffüllt.
         */

    }


    public static void toBinary(int number) {
        String val = "";
        int comp = 1;
        for (int i = 0; i < 32; i++) {
            if ((number & comp) == comp) val = 1 + val;
            else val = 0 + val;
            comp = comp << 1;
        }
        System.out.println(val);
    }

}
