package br.senac.atividade1;

/**
 *
 * @author felip
 */
public class Soma2Numeros {
    double num1;
    double num2;

    public Soma2Numeros(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void Soma(){
        System.out.println("A soma dos numeros " + this.num1 + " e " + this.num2 + " eh " + (+ this.num1+this.num2));
    }
    
}
