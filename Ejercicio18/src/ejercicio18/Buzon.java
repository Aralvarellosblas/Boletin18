package ejercicio18;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Buzon{

    public int numeroDeCorreos(ArrayList<Correo> correos){
        int ncorreos=correos.size();
        System.out.println("Numero de correos: "+ncorreos);
        return ncorreos;
    }

    public void engadir(Correo c, ArrayList<Correo> correos){
        correos.add(c);
    }

    public boolean sinLeer(ArrayList<Correo> correos){
        boolean resposta=false;
        for(int i=0; i<correos.size(); i++){
            if(correos.get(i).isLeido()==false){
                resposta=true;
            }else{
                resposta=false;
            }
        }
        return resposta;
    }

    public String primeiroNoLeido(ArrayList<Correo> correos){
        String mensage="a";
        for(int i=0; i<correos.size(); i++){
            if(correos.get(i).isLeido()==false){
                mensage=correos.get(i).getContido();
                correos.get(i).setLeido(true);
                break;
            }
        }
        return mensage;
    }

    public String mostrar(ArrayList<Correo> correos){
        String mensage="a";
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Que correo quieres leer?"));
        mensage=correos.get(numero).getContido();
        correos.get(numero).setLeido(true);
        return mensage;
    }
    public void eliminar(ArrayList<Correo> correos, int numero){
        correos.remove(numero);
    }

}
