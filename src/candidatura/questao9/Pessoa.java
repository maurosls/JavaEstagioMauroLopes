package candidatura.questao9;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mauro
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        //gerador de id única baseado no timestamp
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String datetime = ft.format(dNow);
        this.id = Integer.parseInt(datetime);
        
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, int id){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
