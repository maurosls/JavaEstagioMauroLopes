package candidatura.questao1;

import java.util.Random;

/**
 *
 * @author Mauro
 * 
 * Sorteia um número R entre 1 e 100
 * imprime todos os pares entre 1 e R exceto os múltimos de 5
 */
public class ObtemRandomImprimePares {
    
    public static void main(String[] args) {
        
        int R = (int) (Math.random()*100);
        
        
        System.out.println("o número sorteado foi: "+R);
        
        for (int i = 1; i < R; i++) {
            if(i%2==0 && i%5!=0) System.out.println(i);
        }
    }
}
