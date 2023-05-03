package redesocial;
import br.com.redesocial.Publicacao;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao, nomeUsuario, dataNascimento, senha;
    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    void insertePublicacoes(Publicacao publi){
        publicacoes.add(publi);
    }
    void imprimePublicacoes(){
        System.out.println("Total de publicacoes: " + Publicacao.getContadorPublicacao());
        for(int i=0; i<publicacoes.size(); i++){
            System.out.println("Data da publicacao :" + publicacoes.get(i).getDataPublicacao());
            System.out.println("Texto da publicacao :" + publicacoes.get(i).getTextoPublicacao());
        }
    }


    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
