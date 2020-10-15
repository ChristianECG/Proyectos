import java.util.Scanner;
import javax.swing.JOptionPane;

/
 *
 * @author x
 */
public class Rellenar {

    /
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elementos= Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de elementos"));
        Scanner sc= new Scanner(System.in);
        char[] letras = new char[elementos];
        //Solicitar

        System.out.println("Digite los elementos del arreglo: ");
        for(int i=0;i<elementos;i++){
            System.out.print((i+1)+". Digite un caracter:");
            letras[i] = sc.next().charAt(0);//Guardar primer caracter --charArt
        }
        //Mostrar
        System.out.println("\nLos caracteres son: ");
        for(int i=0;i<elementos;i++){
            System.out.print(letras[i]+ " ");
        }
    }

}