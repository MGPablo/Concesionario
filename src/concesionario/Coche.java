/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Pablo
 */
public class Coche {
    
    public final static int OK=0;
    public final static int BROKEN=1;
    public final static int REPAIRING=2;
    public final static int READY=3;
    
    public enum status{OK,BROKEN,REPAIRING,READY};
   
    private int estado;
    private String matricula;
    private double precio;

    public Coche(int estado, String matricula, double precio) throws Exception {
        if(estado==OK | estado==BROKEN | estado== REPAIRING | estado== READY ){
            this.estado = estado;
        this.matricula = matricula;
        this.precio = precio;
        }
        else{
            throw new Exception("estado no valido");
        }
        
    }

    @Override
    public String toString() {
        return "Coche{" + "estado=" + estado + ", matricula=" + matricula + ", precio=" + precio + '}';
    }

    
    
    
    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
