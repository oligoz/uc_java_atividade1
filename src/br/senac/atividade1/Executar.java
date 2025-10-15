package br.senac.atividade1;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class Executar {
    
    public static void Ex1(){
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        Soma2Numeros soma;
        System.out.println("Qual o primeiro numero:");
        num1 = scanner.nextDouble();
        System.out.println("Qual o segundo numero:");
        num2 = scanner.nextDouble();
        soma = new Soma2Numeros(num1, num2);
        soma.Soma();
    }
    
    public static void Ex2(){
        Scanner scanner = new Scanner(System.in);
        double num;
        Cubo cubo = new Cubo();
        System.out.println("Qual o numero:");
        num = scanner.nextDouble();
        cubo.CalculaCubo(num);
    }
    
    public static void Ex3(){
        Scanner scanner = new Scanner(System.in);
        int num;
        int result;
        Impar impar = new Impar();
        System.out.println("Qual o numero:");
        num = scanner.nextInt();
        result = impar.VerificaImpar(num);
        System.out.println("O resultado foi " + result);
    }
    
    public static void Ex4(){
        Scanner scanner = new Scanner(System.in);
        Caracter caracter = new Caracter();
        String input;
        String result;
        System.out.println("Qual o caracter:");
        input = scanner.next();
        result = caracter.VerificaCaracter(input);
        System.out.println("O resultado foi " + result);
    }
    
    public static void Ex5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor: ");
        float valor = scanner.nextFloat();
        System.out.println("Taxa: ");
        float taxa = scanner.nextFloat();
        System.out.println("Tempo: ");
        int tempo = scanner.nextInt();
        CalcularPrestacao.Calcular(valor, taxa, tempo);
    }
    
    public static void Ex6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base: ");
        int base = scanner.nextInt();
        System.out.println("Potencia: ");
        int pot = scanner.nextInt();
        Potencia.Potencia(base, pot);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ex1();
//        Ex2();
//        Ex3();
//        Ex4();
//        Ex5();
        Ex6();
    }
    
}
