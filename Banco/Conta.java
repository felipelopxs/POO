public class Conta {
    private int numero;
    private Double saldo;

    public Conta(int numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void Sacar(double valor){
        if(valor<=saldo)
            this.saldo = this.saldo - valor;
    }
    public void Depositar(double valor){
        this.saldo = this.saldo + valor;
    }

}
