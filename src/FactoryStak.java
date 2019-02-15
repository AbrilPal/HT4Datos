
/**
 *Clase FactoryStak
 * encargado de crear todos los objetos cuando el usuario pide el tipo de implementacion.
 * @author Marco Fuentes y Abril Palencia
 */

public class FactoryStak {
    public FactoryStak(){}

    /**
     * factoryStack
     * @param tipo
     * @return objeto del tipo que desea implementar.
     */
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
