package projetovendas;

public class Promotor {
    String cnpj;

    public Promotor(String cnpj, String s) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
