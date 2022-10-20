
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int co=0, vt, i=0;
        while(i<=5){
        System.out.println("Ingrese sus ventas totales: ");
        vt = sc.nextInt();
        if(vt>=1000000 && vt<3000000){
            System.out.println("Le corresponde una comision del 3%");
            co = (int)(vt*0.03);
            System.out.println("Su comision anual es de $: "+co);
        }else if(vt>=3000000 && vt<5000000){
            System.out.println("Le corresponde una comision del 4%");
            co = (int) (vt*0.04);
            System.out.println("Su comision anual es de $: "+co);
        }else if(vt>=5000000 && vt<7000000){
            System.out.println("Le corresponde una comision del 5%");
            co = (int) (vt*0.05);
            System.out.println("Su comision anual es de $: "+co);
        }else if(vt>=7000000){
            System.out.println("Le corresponde una comision del 6%");
            co = (int) (vt*0.6);
            System.out.println("Su comision anual es de $: "+co);
                }
        i++;
        }
        }
    }