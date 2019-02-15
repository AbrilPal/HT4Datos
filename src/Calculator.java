/**
 * Clase Calculator
 * Esta encargada de hacer todas las operaciones matematicas definidas en la hoja de trabajo.
 *
 * @author Abril Palencia y Marco Fuentes
 * @since 15/02/2019
 */
public class Calculator{
    private static Calculator calcu;
    /**
     * Este es el metodo que permite que se realicen las operaciones
     * @param num1
     * @param num2
     * @param op
     * @return El resultado final de toda la operacion del archivo .txt
     */
    public int calculate(int num1, int num2, String op){
        //resultado es la variable que al final mostrara el resultado final de toda la operacion del .txt
        int resultado = 0;
        if (op.equals("+")){
            resultado = num1 + num2;
        }
        else if (op.equals("-")){
            resultado = num1 - num2;
        }
        else if (op.equals("*")){
            resultado = num1 * num2;
        }
        else if (op.equals("/")){
            if (num2 != 0){
                resultado = num1 / num2;
            }else{
                return 0;
            }
        }
        return resultado;
    }

    /**
     * Metodo Singleton
     * para que no se repitan instancias.
     */
    private synchronized static void createInstance(){
        if (calcu == null){
            calcu = new Calculator();
        }
    }
    /**
     * Metodo Singleton
     * para que no se repitan instancias.
     */
    public static Calculator getInstance(){
        createInstance();
        return calcu;
    }
}
