package candidatura.questao8;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro
 */
public class Excecao {
    
    public void lancaChecada() {
        
        Date d = new Date();
        int dia = d.getDay();
        
        if(dia%2 != 0){
            try {
                throw new ChecadaException("dia impar!");
            } catch (ChecadaException ex) {
                Logger.getLogger(Excecao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }
    
    public void propagaChecada() throws ChecadaException{
        lancaChecada();
    }
    
    public void trataChecada(){
        
        try {
            propagaChecada();
        } catch (ChecadaException ex) {
            System.out.println("Exceção capturada");
        } finally{
            System.out.println("Tratamento de exceção");
        }
    }
}
