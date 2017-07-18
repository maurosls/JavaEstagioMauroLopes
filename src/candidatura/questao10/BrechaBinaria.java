
package candidatura.questao10;

/**
 *
 * @author Mauro
 * 
 */
public class BrechaBinaria {
    
    public BrechaBinaria(){}


    public int solucao(int N){
        
        if(N<1 || N >2147483647){
            return 0;
        }
        
        String bin = transformaBinario(N);
        //System.out.println(bin);
        String[] intervalos = bin.split("1");
        
        int cand = 0;
        for (int i = 0; i < intervalos.length; i++) {
            //System.out.println(intervalos[i]);
            if (intervalos[i].length() > intervalos[cand].length()) {
                cand = i;
            }
        }
        System.out.println("O número "+N+" em binário é igual a "+bin);
        System.out.println("A Brecha Binária deste número é: "+intervalos[cand]);
        
        return intervalos[cand].length();
    }

    private String transformaBinario(int N) {
        String bin = Integer.toBinaryString(N);
        return bin;
    }  
}
