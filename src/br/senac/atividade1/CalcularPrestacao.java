package br.senac.atividade1;

/**
 *
 * @author vieira.felipe
 */
class CalcularPrestacao {
    public static void Calcular(float valor, float taxa, int tempo){
        System.out.println("Valor da prestacao: "+(valor+(valor*(taxa/100)*tempo)));
    }
}
