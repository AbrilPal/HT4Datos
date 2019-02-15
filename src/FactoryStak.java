
/**
 *
 * @author Marco Fuentes
 */

public class FactoryStak {
    public FactoryStak(){}
    public Stack factoryStack(String tipo){
        if (tipo.equals("1")){
            return new PilaArrayList();
        }else if(tipo.equals("2")){
            return new PilaVector();
        }else if (tipo.equals("3")){
            return new PilaList(1);
        }else if (tipo.equals("4")){
            return new PilaList(2);
        }else if (tipo.equals("5")){
            return new PilaList(3);
        }else{
            return null;
        }
    }

}
