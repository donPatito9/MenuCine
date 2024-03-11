
package menucine;

/**
 *
 * @author Robinson Concha
 */
public class Pelicula {
     private String titulo;
     private String genero;
     private String director; 
     private Actor protagonista;
     
     public Pelicula() {
     
    }
    public Pelicula(String titulo, String genero, String director, Actor protagonista) {
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setDirector(director);
        this.setProtagonista(protagonista);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() == 6) {
        
        this.titulo = titulo;
    }
    else
    {
            titulo = "titulo debe tener 6 caracteres";
            
        }
            this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", protagonista=" + protagonista + '}';
    }

   
}
