
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int p, op, pc, pt;
        System.out.println("Ingrese el costo de su compra: ");
        p = sc.nextInt();
        System.out.println("Seleccione un color de la bolita: ");
        System.out.println("1. Rojo: ");
        System.out.println("2. Amarillo: ");
        System.out.println("3. Blanco: ");
        op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Selecciono la bolita de color rojo");
                    System.out.println("Felicidades obtuvo un descuento del 40%");
                    pc = (int) (p*0.4);
                    pt = p-pc;
                    System.out.println("El costo total de su compra es $"+pt);
                    break;
                case 2:
                    System.out.println("Selecciono la bolita de color amarillo");
                    System.out.println("Felicidades obtuvo un descuento del 25%");
                    pc = (int) (p*0.25);
                    pt = p-pc;
                    System.out.println("El costo total de su compra es $"+pt);
                    break;
                default:
                    System.out.println("Selecciono la bolita de color blanco");
                    System.out.println("No consiguio ningun descuento");
                    System.out.println("El costo total de su compra es $"+p);
                    break;
            }

        }
    }