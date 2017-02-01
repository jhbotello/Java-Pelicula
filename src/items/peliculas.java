/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author SENA
 */
public class peliculas extends items implements IVisulizable {
    private int año;
    
    public peliculas() {
        super();
        this.año=1900;
    }
public peliculas (String titulo, String creador){
     super(titulo, creador);  
    this.año=1900; 
    }
    
     public peliculas (String titulo, String creador, String genero, int duracion, int año ){
       super(titulo, genero, creador, duracion);
         this.año = año; 
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    @Override
     public String toString(){
         return super.toString() + ",\naño: " + año;
     }
}
