package candidatura.questao9;

import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public class Principal_9_1 {
    
    public static void main(String[] args) {
    
        ArrayList<Pessoa> lista = new ArrayList();
        
        Pessoa joao = new Pessoa("Joao",10,1);
        lista.add(joao);
        Pessoa alice = new Pessoa("Alice",5,2);
        lista.add(alice);
        Pessoa fernando = new Pessoa("Fernando",27,3);
        lista.add(fernando);
        Pessoa carlos = new Pessoa("Carlos",12,4);
        lista.add(carlos);
        Pessoa priscila = new Pessoa("Priscila",31,5);
        lista.add(priscila);
        
        ordenaLista(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome() +" = "+lista.get(i).getIdade());
        }
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getIdade() == 27) lista.remove(i); 
        }
      
    }
    
    static void ordenaLista(ArrayList<Pessoa> lista){
        
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size()-1; j++) {
                if(lista.get(j).getIdade() > lista.get(j+1).getIdade()){
                    swap(i,j,lista);
                }
                
            }
            
        }
    }

    private static void swap(int i, int j, ArrayList<Pessoa> lista) {
        
        Pessoa aux = lista.get(i);    
        lista.set(i, lista.get(j));
        lista.set(j, aux);
        
    }
    
}
