
package menucine;

/**
 *
 * @author Robinson Concha
 */
public class Actor {
     private String nombre;
     private int edad;
     private String nacionalidad;
     private char sexo;

    public Actor() {
    }
     
    public Actor(String nombre, int edad, String nacionalidad, char sexo) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setNacionalidad(nacionalidad);
        this.setSexo(sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
        }
        else
        {
           System.out.println("Debe ser mayor o igual a 18 Años");
        }
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo !='H'|| sexo !='M') {
        }
         this.sexo = sexo;
        }

               
}
