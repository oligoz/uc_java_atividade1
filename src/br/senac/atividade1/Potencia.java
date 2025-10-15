package br.senac.atividade1;

/**
 *
 * @author vieira.felipe
 */
public class Potencia {

    public static void Potencia(int x, int y) {
        int valor = 1;
        for (int i = 0; i < y; i++) {
            valor *= x;
        }
        System.out.println("Resultado: " + valor);
    }
}
