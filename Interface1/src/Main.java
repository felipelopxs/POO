public class Main {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        f.setCPF("123");
        f.setComissao(100);
        f.setSalario(700);
        System.out.println(f.getPagamento());
    }
}