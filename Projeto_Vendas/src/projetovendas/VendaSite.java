package projetovendas;

import java.util.ArrayList;


public class VendaSite {
    private final int qteMax;
    private ArrayList<Ingresso> vendas;
    int qtdemax;

    public int getQtdemax() {
        return qtdemax;
    }

    public void setQtdemax(int qtdemax) {
        this.qtdemax = qtdemax;
    }

    public VendaSite(int qteMax) {
        this.qteMax = qteMax;
        vendas = new ArrayList<>();
    }

    public boolean validaQtdeIngresso(Ingresso ingresso) {
        return vendas.size() < qteMax;
    }

    public void insereVenda(Ingresso ingresso) {
        vendas.add(ingresso);
    }

    public void cadastrarIngresso(Ingresso ingresso) {
    }
}

