package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Cvicenie2 {
    public static void main(String[] args) {

      /*  char y = KeyboardInput.readChar("zadaj pismeno: ");
    System.out.println(x+ " "+ y);

    public static void vypis( String text, int... pole) {
        System.out.println(text);
        System.out.println(Arrays.toString(pole));
    }
        uloha1();  //PRIKLADY 1
        int x = KeyboardInput.readInt("zadaj prve cislo ");
        int y = KeyboardInput.readInt("zadaj prve cislo ");
        System.out.println("Vysledok ulohy2 je: " + uloha2(x, y));
*/      //PRIKLADY 2
     //   int d = KeyboardInput.readInt("zadaj den: ");
        //int m = KeyboardInput.readInt("zadaj mesiac: ");
     //   System.out.println("znamenie je: "+uloha1(d,m));
        int pole[] = new int[10];
        System.out.println(Arrays.toString(uloha2a(pole)));
        uloha2b();
        uloha4();
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
    static String uloha1(int den, int mesiac){
        switch (mesiac){
            case 1:
                if (den < 21) {
                    return "kozorozec";
                }
                else if (21 <= den && den < 31){
                    return "vodnar";
                }
                break;
            case 2:
                if (den < 20){
                    return "vodnar";
                }
                else if (20 <= den && den < 31){
                    return "ryby";
                }
                break;
            default:
                return "nieco ine";

        }
        return "zly input";
    }

    static int[] uloha2a(int pole[]){
        for (int i = 0; i < pole.length; i++){
            int x = KeyboardInput.readInt("zadaj cislo: ");
            pole[i] = x;
        }
        return pole;
    }

    static void uloha2b(){
        int[] pole = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(pole));
    }

    static void uloha4(){
        int[][] dvojrozmernePole = {{1,2}, {3,4}, {5,6}};
        System.out.println(Arrays.deepToString(dvojrozmernePole));
    }
}
