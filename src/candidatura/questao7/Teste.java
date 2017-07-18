package candidatura.questao7;

/**
 *
 * @author Mauro
 */
public class Teste {
    
    public static void main(String[] args) {
        
        String let = "B";
        executar(let);
    }
    
    static void executar(String letra){
        
        String aux = letra.toUpperCase();    
        switch (aux){
            case "A":
                A a = new A();
                a.implementeMe();
                break;
            case "B":
                B b = new B();
                b.implementeMe();
                break;
            case "C":
                C c = new C();
                c.implementeMe();
                break;
            default:
                break;
        }   
    }
}
