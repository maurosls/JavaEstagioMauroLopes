package candidatura.questao3;

/**
 *
 * @author Mauro
 * 
 * Obtem dois números aleatórios R e S
 * imprime no console a soma dos divisores de R entre 1 e S
 */
public class ObtemDoisRandomImprimeSomaDosDivisores {
    public static void main(String[] args) {
        
        int R = (int) (Math.random()*10);
        int S = (int) (Math.random()*1000);
        
        System.out.println("Valor de S: "+S);
        System.out.println("Valor de R: "+R);
        
        int soma = 0;
        
        for (int i = 1; i < S; i++) {
            if(R%i == 0){
                soma = soma + i;
                System.out.println(soma);
            }
        }
        
        System.out.println("A soma dos divisóres de R é: "+soma);
    }
}
