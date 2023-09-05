package testes;

import cinema.Opcoes;

public class ConverterTeste {
    public static void main(String[] args) {
        Opcoes op = new Opcoes();
        op.imprimeQuantidade();

        System.out.println(op.compraIngresso());

        op.imprimeMapa();
        op.imprimeQuantidade();
    }
}
