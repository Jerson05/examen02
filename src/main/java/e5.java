
import java.util.Scanner;



/**
 *
 * @author Alumno
 */
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op, p, ed, c1,c2,c3,c4,c5, i=0;
        while(i<=5){
        System.out.println("Descuento por edades: ");
        System.out.println("Categoria 1 (5-14 años): ");
        System.out.println("Categoria 2 (15-19 años): ");
        System.out.println("Categoria 3 (20-45 años): ");
        System.out.println("Categoria 4 (46-65 años): ");
        System.out.println("Categoria 5 (66 años en adelante): ");
        op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Tendra un descuento del 35%");
                c1= (int) (36-36*0.35);
                System.out.println("El costo de la entrada es de $: "+c1);
                break;
            case 2:
                System.out.println("Tendra un descuento del 25%");
                c2= (int) (36-36*0.25);
                System.out.println("El costo de la entrada es de $: "+c2);
                break;
            case 3:
                System.out.println("Tendra un descuento del 10%");
                c3= (int) (36-36*0.1);
                System.out.println("El costo de la entrada es de $: "+c3);
                break;
            case 4:
                System.out.println("Tendra un descuento del 25%");
                c4= (int) (36-36*0.25);
                System.out.println("El costo de la entrada es de $: "+c4);
                break;
            case 5:
                System.out.println("Tendra un descuento del 35%");
                c5= (int) (36-36*0.35);
                System.out.println("El costo de la entrada es de $: "+c5);
                break;
        }
        i++;
    }
    
}
}