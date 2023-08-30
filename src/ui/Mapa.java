package ui;

import java.sql.SQLOutput;

public class Mapa {
    private char[][] assentos;
    private int quantLivres;
    private int quantOcupados;

    public Mapa() {
        this.assentos = new char[12][14];

        for (int i = 0; i < this.assentos.length; i++) {
            for (int j = 0; j < this.assentos[i].length; j++) {
                assentos[i][j] = 'O';
            }
        }

        this.quantLivres = 168;
        this.quantOcupados = 0;
    }

    public void imprimeAssentos() {
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
        System.out.println("    1 2 3 4 5 6 7    8 9 10 11 12 13 14");

        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " - ");
            imprime(i);
            System.out.println();
        }
    }

    public void imprime(int linha) {
        for (int j = 0; j < assentos[linha].length / 2; j++) {
            System.out.print(assentos[linha][j] + " ");
        }
        System.out.print("|| ");

        for (int j = assentos[linha].length / 2; j < assentos[linha].length; j++) {
            if (j >= 9) {
                System.out.print(assentos[linha][j] + "  ");
            } else {
                System.out.print(assentos[linha][j] + " ");
            }
        }
    }

    public void imprimeQuantidade(){
        System.out.println("Temos " + quantLivres + " assentos livres. " +
                            "E um total de " + quantOcupados + " pessoas na sessão");
    }
}
