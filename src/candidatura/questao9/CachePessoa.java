package candidatura.questao9;

import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public class CachePessoa {
    
    private ArrayList<Pessoa> lista;
    
    private int verificador;
    
    public Pessoa retornaPessoa(int id){
        
        if(id > this.verificador){
            for (int i = 0; i < this.lista.size(); i++) {
                if(id == this.lista.get(i).getId()){
                    System.out.println(this.lista.get(i).getNome());
                    System.out.println(this.lista.get(i).getIdade());
                    this.verificador = id;
                    return this.lista.get(i);
                }            
            }
        }else{
            System.out.println(this.lista.get(id).getNome());
            System.out.println(this.lista.get(id).getIdade());
            return this.lista.get(id);
        }
        return null;
    }
    
    public CachePessoa(ArrayList lista){
        this.verificador = 0;
        this.lista = lista;
    }
}
