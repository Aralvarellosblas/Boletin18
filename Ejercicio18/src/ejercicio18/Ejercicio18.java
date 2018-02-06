package ejercicio18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon bz =new Buzon();
        ArrayList <Correo> buzon=new ArrayList();
        buzon.add(0,new Correo("qwerty",true));
        buzon.add(1,new Correo("asdfg",false));
        buzon.add(2,new Correo("zxcvb",true));
        buzon.add(3,new Correo("Importante",false));
        buzon.add(4,new Correo("Mas importante",false));
        bz.numeroDeCorreos(buzon);
        System.out.println(bz.primeiroNoLeido(buzon));
        boolean x=bz.sinLeer(buzon);
        if(x==true){
            System.out.println("Correos sin leer");
        }else System.out.println("Correos leidos");
        System.out.println(bz.mostrar(buzon));
        int borrar=Integer.parseInt(JOptionPane.showInputDialog("Que correo quieres borrar?"));
        bz.eliminar(buzon, borrar);
        bz.numeroDeCorreos(buzon);
        
        
        
    }

}
