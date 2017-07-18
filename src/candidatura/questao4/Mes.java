package candidatura.questao4;

import java.util.Random;

/**
 *
 * @author Mauro
 * 
 * Classe Mes com atributos qtdDias que equivale a quantidade de dias do mês e numeroDoMes que relaciona o mês a sua ordem entre os 12
 * O construtor recebe o numeroDoMes e calcula quantos dias esse mês terá
 * 
 * o Método diaMes vai imprimir uma mensagem de acordo com o atributo qtdDias do objeto Mes que foi passado como parâmetro
 * 
 * o Método qualDiaMes vai sorter um número entre 1 e 12 e vai criar um objeto Mes passando esse valor como parâmetro, depois, então, chamará o método diaMes
 */
public class Mes {
    private int qtdDias;
    private int numeroDoMes;
    
    public Mes(){
        
    }
    
    public Mes(int numeroDoMes){
        this.numeroDoMes = numeroDoMes;
        
        switch(numeroDoMes){
            case 1:
                this.qtdDias = 31;
                break;
            case 2:
                this.qtdDias = 28;
                break;
            case 3:
                this.qtdDias = 31;
                break;
            case 4:
                this.qtdDias = 30;
                break;
            case 5:
                this.qtdDias = 31;
                break;
            case 6:
                this.qtdDias = 30;
                break;
            case 7:
                this.qtdDias = 31;
                break;    
            case 8:
                this.qtdDias = 31;
                break;
            case 9:
                this.qtdDias = 30;
                break;
            case 10:
                this.qtdDias = 31;
                break;
            case 11:
                this.qtdDias = 30;
                break;
            case 12:
                this.qtdDias = 31;
                break;      
        }
    }
    
    private void diaMes(Mes M){ 
        switch(M.qtdDias){
            case 30:
                System.out.println("Mês com 30 dias.");
                break;
            case 31:
                System.out.println("Mês com 31 dias.");
                break;
            default:
                System.out.println("Mês com menos de 30 dias");
                break;
        }
    }

    public final void qualDiaMes(){
        
        Random gerador = new Random();
        int R = gerador.nextInt(12);
        System.out.println("R sorteado foi: "+R);
        
        Mes M = new Mes(R);
        diaMes(M);   
    }
    
    public static void main(String[] args) {
        Mes M = new Mes();
        M.qualDiaMes();
    }
}
