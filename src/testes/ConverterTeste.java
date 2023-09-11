package testes;

import cinema.Opcoes;

public class ConverterTeste {
    public static void main(String[] args) {
        Opcoes op = new Opcoes();
        op.imprimeQuantidade();

        System.out.println(op.compraIngresso());

        op.exibirMapa();
        op.imprimeQuantidade();

        System.out.println(op.cancelaIngresso());

        op.exibirMapa();
        op.imprimeQuantidade();
    }
}
