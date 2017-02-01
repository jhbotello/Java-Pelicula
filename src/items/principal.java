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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        series ListadoSeries []=new series [5];
        peliculas ListadoPeliculas[]=new peliculas[5];
        
        ListadoPeliculas[0]=new peliculas();
        ListadoPeliculas[1]=new peliculas("La comunidad del anillo","Peter Jackson");
        ListadoPeliculas[2]=new peliculas("Warrior ","Acción","Gavin O'Connor",134,2011);
        ListadoPeliculas[3]=new peliculas("Sherlock","Ficción","Alfonso Cuarón",89,2010);
        ListadoPeliculas[4]=new peliculas("Aliados","Romantica","Robert Zemeckis",126,2016);
        
        ListadoSeries[0]=new series();
        ListadoSeries[1]=new series("The crown","Peter Morgan");
        ListadoSeries[2]=new series("Grace and Frankie","Martha Kauffman", "Comedia",90,3);
        ListadoSeries[3]=new series("The Ranch","Steve Thompkins", "Comedia",85,1);
        ListadoSeries[4]=new series("Inspector Gadget", "Jean Chalopin", "Infantil",30,2);
        
        ListadoPeliculas[2].marcarVisto("52m 49s");
        ListadoPeliculas[3].marcarVisto("46m 25s");
        ListadoSeries[3].marcarVisto("98m 40s");
        ListadoSeries[4].marcarVisto("29m 06s");
        
        System.out.println("Peliculas Visualizadas\n");
        for (int i=0;i<=4;i++)
        { 
          if (!"00m 00s".equals(ListadoPeliculas[i].tiempoVisto()))
            {
              System.out.println(ListadoPeliculas[i].toString());
                                System.out.println("");
          }
        }
        
        System.out.println("Series Visualizadas\n");
        for(int i=0;i<=4;i++)
        {
            if ("00m 00s".equals(ListadoSeries[i].tiempoVisto()))
            {
            } else {
                System.out.println(ListadoSeries[i].toString());
                System.out.println("");
            }
        }
        int indice=0;
        int mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (ListadoSeries[i].gettemporadas()>mayor)
            {
                indice=i;
                mayor=ListadoSeries[i].gettemporadas();
            }
        }
        System.out.println("Serie con mas Temporadas:\n");
        System.out.println(ListadoSeries[indice].toString());
        
        indice=0;
        mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (ListadoPeliculas[i].getAño()>mayor)
            {
                indice=i;
                mayor=ListadoPeliculas[i].getAño();
            }
        }
        System.out.println("\nPelicula mas Reciente:\n");
        System.out.println(ListadoPeliculas[indice].toString());
    }
    
}
