package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e =new Estoque();
        e.setNome("Caneta");
        e.setQtdAtual(18);
        e.setQtdMinima(5);
        System.out.println(e.mostra());

    }
}
