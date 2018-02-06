package ejercicio18;

/**
 *
 * @author Arturo
 */
public class Correo {
    private String contido;
    private boolean leido;

    public Correo(){
    }
    
    public Correo(String contido, boolean leido){
        this.contido=contido;
        this.leido=leido;
    }

    public String getContido(){
        return contido;
    }

    public void setContido(String contido){
        this.contido=contido;
    }

    public boolean isLeido(){
        return leido;
    }

    public void setLeido(boolean leido){
        this.leido=leido;
    }
    
}
