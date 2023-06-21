package projetovendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Promotor> promotores = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Pessoa");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        Pessoa pessoa = new Pessoa(nome, email, senha);
        pessoas.add(pessoa);

        System.out.println("Cadastro de Promotor");
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        Promotor promotor = new Promotor(nome, cnpj);
        promotores.add(promotor);


        System.out.println("Cadastro do Evento");
        System.out.print("Nome: ");
        String titulo = scanner.nextLine();
        System.out.print("Data: ");
        String data = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Local: ");
        String local = scanner.nextLine();
        Evento evento = new Evento(titulo, data, hora,local);
        eventos.add(evento); ///coloquei nome do evento como (título) pq tava dando conflito com o atributo nome da classe pessoal


        System.out.println("Cadastro do Ingresso");
        System.out.print("Evento: ");
        String nomEvento = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int qtdemax = scanner.nextInt();
        scanner.nextLine();
        Ingresso ingresso = new Ingresso(preco, qtdemax, nomEvento);
        ingressos.add(ingresso);


        System.out.println("Criação do objeto VendaSite");
        System.out.print("Quantidade máxima de ingressos: ");
        int qtdeMax = scanner.nextInt();
        VendaSite vendaSite = new VendaSite(qtdeMax);


        System.out.println("Cadastre os ingressos para vender no site");
        if (vendaSite.validaQtdeIngresso(ingresso)) {
            vendaSite.cadastrarIngresso(ingresso);
            System.out.println("Ingresso cadastrado com sucesso!");
        } else {
            System.out.println("Quantidade de ingressos excedeu o limite!");
        }

        scanner.close();
    }
}

