
import java.util.Scanner;



/**
 *
 * @author Alumno
 */
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int p, cb, ac, ct;
        System.out.println("Que pizza desea: ");
        System.out.println("1. Pequeña: (10 pulgadas de diametro) ");
        System.out.println("2. Mediana: (12 pulgadas de diametro) ");
        System.out.println("3. Grande: (16 pulgadas de diametro) ");
        p = sc.nextInt();
            switch (p) {
                case 1:
                    System.out.println("Seleccionaste la pizza pequeña");
                    System.out.println("Desea agregarle algo extra a la pizza: ");
                    System.out.println("1. Pepinillos: ");
                    System.out.println("2. Champiñones: ");
                    System.out.println("3. Cebollas: ");
                    ac = sc.nextInt();
                    ct= (int) (15+10+1*1.5);
                    System.out.println("El costo total de su pizza es $: "+ct);
                    break;
                case 2:
                    System.out.println("Seleccionaste la pizza mediana");
                    System.out.println("Desea agregarle algo extra a la pizza: ");
                    System.out.println("1. Pepinillos: ");
                    System.out.println("2. Champiñones: ");
                    System.out.println("3. Cebollas: ");
                    ac = sc.nextInt();
                    ct= (int) (15+12+1*1.5);
                    System.out.println("El costo total de su pizza es $: "+ct);
                    break;
                case 3:
                    System.out.println("Seleccionaste la pizza grande");
                    System.out.println("Desea agregarle algo extra a la pizza: ");
                    System.out.println("1. Pepinillos: ");
                    System.out.println("2. Champiñones: ");
                    System.out.println("3. Cebollas: ");
                    ac = sc.nextInt();
                    ct= (int) (15+16+1*1.5);
                    System.out.println("El costo total de su pizza es $: "+ct);
                    break;
                default:
                    break;
            }
 
        }
    }