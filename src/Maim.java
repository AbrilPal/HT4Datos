
/**
 *
 * @author Marco Fuentes
 * Clase Main, contiene el metodo main y se encarga de ejecutar el programa
 *
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Maim {
    public static void main (String args []) {
        System.out.print("holi");
        //variables
        String op;
        //crear objeto scannner
        Scanner scanner = new Scanner(System.in);
        //para leer el archivo
        ArrayList<String> arreglo = new ArrayList<String>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(System.getProperty("user.dir") + "\\src\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> arreglo.add(a));
        } catch (IOException e) {
            System.out.println("Error!");
        }

        //separar cada elemento
        for (int a = 0; a < arreglo.size(); a++) {
            String[] caracteres = arreglo.get(a).split("");
            ArrayList<String> operacion = new ArrayList<>();
            for (int i = 0; i < caracteres.length; i++) {
                operacion.add(caracteres[i]);
            }

            //pedir la implementacion del stack al usuario
            System.out.println("Que implementacion desea para el stack? ");
            System.out.println("1. ArrayList");
            System.out.println("2. Vector");
            System.out.println("3. Lista simplemente encadenada");
            System.out.println("4. Lista doblemente encadenada");
            System.out.println("5. Lista circular");
            op = scanner.nextLine();
            FactoryStak obj1 = new FactoryStak();
            Stack lista = obj1.factoryStack(op);
            Calculator calculator = new Calculator();
            for (int car = 0; car < operacion.size(); car++) {
                int num;
                String caracter = operacion.get(car);
                try {
                    num = Integer.parseInt(caracter);
                    lista.push(num);
                } catch (Exception e) {
                    if (!caracter.equals(" ")) {
                        int num1 = (int) lista.pop();
                        int num2 = (int) lista.pop();
                        int resultado = calculator.calculate(num2, num1, caracter);
                        lista.push(resultado);
                    }
                }
            }
            System.out.println("resultado = " + lista.peek());
        }
    }
}
