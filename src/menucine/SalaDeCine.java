
package menucine;

import java.util.ArrayList;

/**
 *
 * @author Robinson Concha
 * 
 */
public class SalaDeCine {
    private ArrayList <Pelicula> listaPeliculas;
        
    public SalaDeCine() {
        listaPeliculas = new ArrayList<Pelicula>();
    }
        
    public String agregarPelicula(String titulo, String genero, String director, Actor protagonista) {
    
       String salida = "" ;
        boolean encontrado = false;
        for (Pelicula pelicula:listaPeliculas) {
        if (pelicula.getTitulo().equals(titulo)) {
              encontrado = true;
        }
    }
        if(encontrado==false) {
         Pelicula nuevaPelicula = new Pelicula(titulo, genero, director, protagonista);
           listaPeliculas.add(nuevaPelicula);
           salida = "Pelicula agregada con exito";
        }
        else
        {
            salida = "Titulo existe No se puede agregar";
    }
        return salida;
}
    
    public String buscarPelicula(String titulo) {
        String salida = "";
        boolean encontrado = false;
        for (Pelicula pelicula : listaPeliculas) {
             if(pelicula.getTitulo().equals(titulo)) { 
             encontrado = true;
             salida = "Pelicula Encontrada ";
        }
             if(encontrado == false) {
             salida = "Pelicula no encontrada ";
        }
    }
        return salida;
        
}

    public String listarPeliculas() {
        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (Pelicula pelicula : listaPeliculas) {
            sb.append("Datos de la Pelicula: ").append(i).append("\n");
            sb.append("--------------------------------------------").append(i).append("\n");
            sb.append("Titulo: ").append(pelicula.getTitulo()).append("\n");
            sb.append("Genero: ").append(pelicula.getGenero()).append("\n");
            sb.append("Protagonista: ").append(pelicula.getProtagonista().getNombre()).append("\n");
            sb.append("Nacionalidad: ").append(pelicula.getProtagonista().getNacionalidad()).append("\n");
            i++;   
        }  
        return sb.toString();
}

    public int obtenerActricesMujeres() {
   
        int cantidadMujeres = 0;
	  for(Pelicula pelicula : listaPeliculas) {
           if(pelicula.getProtagonista().getSexo() == 'M'){
     
               cantidadMujeres++;
        } 
        }
        return cantidadMujeres;
} 
 
    public int obtenerActoresJovenes() {
      
         int cantidadJovenes = 0;
           for(Pelicula pelicula: listaPeliculas) {
            if (pelicula.getProtagonista().getEdad() >= 18 &&
                pelicula.getProtagonista().getEdad() <= 30 && 
                pelicula.getProtagonista().getNacionalidad() == "Chilena") {
        
               cantidadJovenes++;
        }
        }
        return cantidadJovenes;
    }
}
