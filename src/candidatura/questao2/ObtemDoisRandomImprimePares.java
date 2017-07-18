/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura.questao2;

/**
 *
 * @author Mauro
 */
public class ObtemDoisRandomImprimePares {
    public static void main(String[] args) {
        int R = (int) (Math.random()*100);
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
