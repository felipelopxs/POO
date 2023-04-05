public class Funcionario extends Pessoa implements Pagavel {
    private float salario;
    private float comissao;
    private static final float salarioMinimo = 500;

    public int setSalario(float salario) {
        int result = 0;
        if (salario > salarioMinimo)
            this.salario = salario;
        else
            result = -1;
        return result;

    }
    public float getSalario(){
        return this.salario;
    }
    public void setComissao(float comissao){
        if (comissao > 0)
            this.comissao = comissao;
    }
    public float getComissao(){
        return this.comissao;
    }
    //método implementado da interface Pagável
    public float getPagamento(){
        return this.salario + this.comissao;
    }
}