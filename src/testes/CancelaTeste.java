package testes;

import cinema.Opcoes;

public class CancelaTeste {
    public static void main(String[] args) {
        Opcoes op = new Opcoes();
        op.imprimeQuantidade();

        System.out.println(op.compraIngresso());

        op.imprimeQuantidade();

        System.out.println(op.cancelaIngresso());
        op.exibirMapa();
    }
}
