package candidatura.questao1;

/**
 *
 * @author Mauro
 */
public class ObtemRandomImprimePares {
    
    public static void main(String[] args) {
        
        int ran = (int) (Math.random()*100);
    
        System.out.println("o número sorteado foi: "+ran);
        
        for (int i = 1; i < ran; i++) {
            if(i%2==0 && i%5!=0) System.out.println(i);
        }
    
    }
}
