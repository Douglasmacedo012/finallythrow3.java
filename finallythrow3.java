import java.util.*;
public class finallythrow3 {

    public static int metodoUm(String stringVar) {

        return 0;
    }

    public static String metodoDois(short shortVar) {

        return "0";
    }

    public static boolean metodoTres(char charVar) {

        return false;
    }

    public static char metodoQuatro(long longVar) {

        return 'd';
    }

    public static short metodoQuatro(byte byteVar) {

        return 'd';
    }

    public static byte metodoCinco(float floatVar) {

        return 99;
    }

    public static float metodoSeis(double floatVar) {

        return 9.90f;
    }

    public static long metodoSete(int floatVar) {

        return 409000000000000L;
    }

    public static void selecionaMetodo(int teste) {
        try {
            switch (teste) {
                case 1:
                    metodoUm("teste");
                    break;
                case 2:
                    metodoDois(Short.valueOf("5000"));
                    break;
                case 3:
                    metodoTres('c');
                    break;
                // parei aqui...
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }

    public static void main(String[] args) {
        // chamar os métodos criados de acordo com o algoritmo dowhile5
    }
}

