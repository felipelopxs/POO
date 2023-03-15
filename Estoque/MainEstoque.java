package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setNome("Caneta");
        e.setQtdAtual(18);
        e.setQtdMinima(5);
        System.out.println(e.mostra());

        Estoque e1 = new Estoque(1, "borracha",12,5);
        e1.darBaixa(10);
        System.out.println("Estoque atual: " + e1.getQtdAtual());
        e1.darBaixa(10);
        System.out.println(e1.precisaRepor());

    }
}
