package candidatura.questao2;

/**
 *
 * @author Mauro
 * 
 * Obtem dois aleatórios R e S
 * Imprime todos os pares entre 1 e S
 * Se algum divisor do dobro de R for encontrado, encerra a execução
 */
public class ObtemDoisRandomImprimePares {
    public static void main(String[] args) {
        int R = (int) (Math.random()*10);
        int S = (int) (Math.random()*100);
        
        System.out.println("Valor de S: "+S);
        System.out.println("Valor de R: "+R);
        
        for (int i = 1; i < S; i++) {
            
            if(i%2 == 0) System.out.println(i);
            
            if(i%(2*R)==0) {
                System.out.println("Múltiplo do dobro de R encontrado");
                break;
            }           

        }
    }
}
