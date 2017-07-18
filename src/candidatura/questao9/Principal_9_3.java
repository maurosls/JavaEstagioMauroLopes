package candidatura.questao9;

import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public class Principal_9_3 {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> lista = new ArrayList();
        
        Pessoa paulo = new Pessoa("Paulo",8,1);
        Pessoa silas = new Pessoa("Silas",19,2);
        Pessoa paulo2 = new Pessoa("Paulo",18,3);
        Pessoa pedro = new Pessoa("Pedro",25,4);
        Pessoa paulo3 = new Pessoa("Paulo",50,5);
        
        lista.add(paulo);
        lista.add(silas);
        lista.add(paulo2);
        lista.add(pedro);
        lista.add(paulo3);
        
        ArrayList<String> nomes = new ArrayList();
        
        for (int i = 0; i < lista.size(); i++) {
            int contador = 0;
            for (int j = 0; j < nomes.size(); j++) {
                if(lista.get(i).getNome() == nomes.get(j)) contador++;
            }
            
            if (contador == 0){
                System.out.println(lista.get(i).getNome());
                nomes.add(lista.get(i).getNome());       
            }
        }   
    }  
}
