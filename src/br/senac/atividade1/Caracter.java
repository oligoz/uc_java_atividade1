package br.senac.atividade1;

/**
 *
 * @author felip
 */
public class Caracter {

    public Caracter() {
    }

    public String VerificaCaracter(String caracter){
        if (caracter.length() == 1 && caracter.charAt(0) >= '0' && caracter.charAt(0) <= '9'){
            return "Caracter";
        } else {
            return "Letra";
        }
    }
}
