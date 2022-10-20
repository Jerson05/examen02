
import java.util.Scanner;



/**
 *
 * @author Alumno
 */
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int ht, s=0, the=0, a,i=0;
        do{
            System.out.println("Ingrese la cantidad de horas trabajadas : ");
            ht = sc.nextInt();
            
            if(ht>35){
                the=ht-35;
                s=(the*22)+(35-15);
                
            }if(ht<=35){
                s=ht*15;
            }
            System.out.println("Su salario es de: "+s);
            System.out.println("¿Desea calcular otro salario?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            a=sc.nextInt();
            i++;
        }while(a==1);
                
        }
    }