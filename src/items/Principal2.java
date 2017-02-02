/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<peliculas> p = new ArrayList<>();
        ArrayList<series> s = new ArrayList<>();

        p.add(new peliculas());
        p.add(new peliculas("La comunidad del anillo", "Peter Jackson"));
        p.add(new peliculas("Warrior ", "Acción", "Gavin O'Connor", 134, 2011));
        p.add(new peliculas("Sherlock", "Ficción", "Alfonso Cuarón", 89, 2010));
        p.add(new peliculas("Aliados", "Romantica", "Robert Zemeckis", 126, 2016));

        s.add(new series());
        s.add(new series("The crown", "Peter Morgan"));
        s.add(new series("Grace and Frankie", "Martha Kauffman", "Comedia", 90, 3));
        s.add(new series("The Ranch", "Steve Thompkins", "Comedia", 85, 1));
        s.add(new series("Inspector Gadget", "Jean Chalopin", "Infantil", 30, 2));

        p.get(2).marcarVisto("52m 49s");
        p.get(3).marcarVisto("46m 25s");
        s.get(3).marcarVisto("98m 40s");
        s.get(4).marcarVisto("29m 06s");
        
        System.out.println("Peliculas Visualizadas\n");
        for (int i=0;i<=4;i++)
        { 
          if (!"00m 00s".equals(p.get(i).tiempoVisto()))
            {
              System.out.println(p.get(i).toString());
                                System.out.println("");
          }
        }
        
        System.out.println("Series Visualizadas\n");
        for(int i=0;i<=4;i++)
        {
            if ("00m 00s".equals(s.get(i).tiempoVisto()))
            {
            } else {
                System.out.println(s.get(i).toString());
                System.out.println("");
            }
        }
        int indice=0;
        int mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (s.get(i).gettemporadas()>mayor)
            {
                indice=i;
                mayor=s.get(i).gettemporadas();
            }
        }
        System.out.println("Serie con mas Temporadas:\n");
        System.out.println(s.get(indice).toString());
        
        indice=0;
        mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (p.get(i).getAño()>mayor)
            {
                indice=i;
                mayor=p.get(i).getAño();
            }
        }
        System.out.println("\nPelicula mas Reciente:\n");
        System.out.println(p.get(indice).toString());

    }

}
