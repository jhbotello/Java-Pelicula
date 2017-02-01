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
public class items implements IVisualizable {
    
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto;
    // tvisto = tiempo visualizado
    private String tvisto = "00m 00s";
    
    public items(){
            this.titulo = "";
            this.genero = "";
            this.creador = "";
            this.duracion = 0;
            this.visto=false;
            this.tvisto = "00m 00s";       
    }
    
    public items (String titulo, String creador){
            this.titulo = titulo;
            this.genero = "";
            this.creador =creador;
            this.duracion= 0;
            this.visto=false;
            this.tvisto = "00m 00s"; 
  
    }
    
     public items (String titulo, String creador, String genero, int duracion ){
            this.titulo=titulo;
            this.genero=genero;
            this.creador=creador;
            this.duracion=duracion;
            this.visto=false;
            this.tvisto = "00m 00s"; 
  
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public String getTvisto() {
        return tvisto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    
    @Override
    public String toString (){
         return "titulo: " + titulo + ",\ngenero: " + genero + ",\ncreador:" + 
                creador + ",\nduracion: " + duracion + ",\nvisto: " + visto; 
    }
    
    public void marcarVisto(String tvisualizado){
    this.visto = true;
    this.tvisto = "Visualizado hasta el tiempo: " + tvisualizado;
    }
   
    public boolean esVisto() {
    return this.visto;
    } 
    
    public String tiempoVisto() {
    return this.tvisto;
    }
    /**
     * @param args the command line arguments
     */
    
   
}
