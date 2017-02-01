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
public class series extends items implements IVisulizable {
    private int temporadas;
    
    public series() {
        super();
        this.temporadas=1;
    }
public series (String titulo, String creador){
     super(titulo, creador);  
    this.temporadas=1; 
    }
    
     public series (String titulo, String genero, String creador, int duracion,
             int temporadas ){
       super(titulo, genero, creador, duracion);
         this.temporadas = temporadas; 
    }

    public int gettemporadas() {
        return temporadas;
    }

    public void settemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    @Override
     public String toString(){
         return super.toString() + ",\ntemporadas: " + temporadas;
     }
    
}
