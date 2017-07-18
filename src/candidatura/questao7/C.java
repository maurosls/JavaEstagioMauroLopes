package candidatura.questao7;

/**
 *
 * @author Mauro
 */
public class C extends B{
    
    @Override
    public void implementeMe() {
        System.out.println("Meu nome é: "+ this.getClass().getSimpleName());
    }
}
