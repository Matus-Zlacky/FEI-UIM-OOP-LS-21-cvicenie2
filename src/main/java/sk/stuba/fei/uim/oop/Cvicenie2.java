package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Cvicenie2 {
    public static void main(String[] args) {
        uloha1();
        int x = KeyboardInput.readInt("zadaj prve cislo ");
        int y = KeyboardInput.readInt("zadaj prve cislo ");
        System.out.println("Vysledok ulohy2 je: " + uloha2(x, y));

  /*  char y = KeyboardInput.readChar("zadaj pismeno: ");
    System.out.println(x+ " "+ y);

    public static void vypis( String text, int... pole) {
        System.out.println(text);
        System.out.println(Arrays.toString(pole));
    }*/
    }
        //PRIKLADY 1
        static void uloha1() {
            System.out.println("Hello World");
        }

        static int uloha2(int x,int y) {
            if (x > y) {
                return 1;
            }
            else if (x == y) {
                return 0;
            }
            else{
                return -1;
            }
        }

        //PRIKLADY 2


}
