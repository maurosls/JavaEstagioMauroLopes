package candidatura.questao7;

/**
 *
 * @author Mauro
 */
public class B implements Contrato {

    @Override
    public void implementeMe() {
        System.out.println("Meu nome é: "+ this.getClass().getSimpleName());
    }
    
}
