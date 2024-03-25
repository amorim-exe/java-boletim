import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();
    
            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();
    
            scanner.close();
    
            Boletim boletim = new Boletim(nota1, nota2);
            boletim.calculaMedia();
            boletim.imprimeBoletim();
        }
    }
