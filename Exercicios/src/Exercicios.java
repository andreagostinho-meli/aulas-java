import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        ex06();
    }

    public static void ex01() {
        Scanner myScanner = new Scanner(System.in);
        int qtdNumerosPares = 0, limiteNumerosPares = 0;

        System.out.print("Digite um número: ");
        limiteNumerosPares = myScanner.nextInt();

        System.out.println("Os primeiros " + limiteNumerosPares + " números pares são:");

        for (int i = 0; qtdNumerosPares < limiteNumerosPares; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                qtdNumerosPares++;
            }
        }
    }

    public static void ex02() {
        Scanner myScanner = new Scanner(System.in);
        int qtdMultiplos = 0, limiteMultiplos = 0, multiplo = 0;

        System.out.print("Digite a quantidade máxima de múltiplos: ");
        limiteMultiplos = myScanner.nextInt();

        System.out.print("Digite o número que deseja ver os múltiplos: ");
        multiplo = myScanner.nextInt();

        System.out.println("Os primeiros " + limiteMultiplos + " múltiplos são:");

        for (int i = 0; qtdMultiplos < limiteMultiplos; i++) {
            if (i % multiplo == 0) {
                System.out.println(i);
                qtdMultiplos++;
            }
        }
    }

    /*
    * Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o usuário irá
    * inserir pelo console. Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
    * */
    public static void ex03() {
        Scanner myScanner = new Scanner(System.in);
        int numero = 0;
        boolean primo = true;

        System.out.print("Digite um número: ");
        numero = myScanner.nextInt();

        if (numero == 1 || numero == 0) primo = false;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(primo ? "O número é primo" : "O número não é primo");
    }

    /*
    * Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um valor que o
    * usuário irá inserir pelo console.
    * */
    public static  void ex04() {
        Scanner myScanner = new Scanner(System.in);
        boolean primo = true;

        System.out.print("Digite um número: ");
        int limite = myScanner.nextInt();

        for (int i = 2; i < limite; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }

                primo = true;
            }

            if (primo) System.out.println(i);
        }
    }

    public static void ex05() {}

    /*
    * Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores 52, 10, 85, 1324, 01, 13, 62, 30,
    * 12 e 127.
    *
    * Imprima no console:
    *    a) Sua ordenação crescente.
    *    b) Sua ordenação decrescente.
    * */
    public static void ex06() {
        Integer[] myArray = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(myArray);
        System.out.println("Ordem crescente: " + Arrays.toString(myArray));

        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Ordem decrescente: " + Arrays.toString(myArray));
    }

    /*
    * Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e possui uma média
    * de crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões e com sua
    * média de crescimento anual em 32%.
    *
    * Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
    * empresa X ultrapasse a empresa Y em seu valor de empresa.
    * */
    public static void ex07() {

    }
}
