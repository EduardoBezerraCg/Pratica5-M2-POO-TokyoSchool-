package CondicioIF;

import javax.swing.*;
import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um nùmero"));

        if (numero >= 0) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");
        }

    }
}
