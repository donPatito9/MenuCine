package menucine;

/**

 * @author Robinson Concha
 * 
 * Estimado Docente decia en la descripcion del examen
 * crear 3 objetos pelicula y listarlas, espero no equivocarme 
 * le envio lo solicitado ademas la prueba de mis Metodos 
 * no me queda muy claro el tema en JUnit al probar el metodo Listar
 * Creo que ambos resultados son los mismos ya que tenemos una lista
 * creada en el Main, por ende, espero el listado y obtengo el listado 
 * esa es la duda que me queda,
 * un Cordial Saludo.
 * 
 */
public class MenuCine {
    
    public static void main(String[] args) {
                
       SalaDeCine sdc = new SalaDeCine();
       
       //En este punto le puse Nacionalidad chilena independiente de su sexo por Nacionalidad
        
       Actor protagonista1 = new Actor("Vin Diesel", 30, "Chilena",'H');
       
       Actor protagonista2 = new Actor("Paul Walker", 29, "EEUU", 'H');
       
       Actor protagonista3 = new Actor("Michele Rodriguez", 30, "Chilena", 'M');
      
       System.out.println(">>>>>>>>>>>>>Menu Sala de Cine<<<<<<<<<<<<<<<");
       
       System.out.println("-------------Agregar Peliculas---------------");
       
       System.out.println(sdc.agregarPelicula("FastF1", "Accion", "Beto", protagonista1));
       //Agregue nuevamente la pelicula para probar regla de negocio si titulo existe no se agrega
       System.out.println(sdc.agregarPelicula("FastF1", "Accion", "Beto", protagonista1));
                    
       System.out.println(sdc.agregarPelicula("FastF2", "Accion", "Beto",protagonista2));
       
       System.out.println(sdc.agregarPelicula("FastF3", "Accion", "Beto",protagonista3));
                     
       System.out.println("---------------------------------------------");
       
       System.out.println("------------Lista Peliculas------------------");
       
       System.out.println(sdc.listarPeliculas());
       
       System.out.println(">>>>>>>>>>>>>>>>>>Fin<<<<<<<<<<<<<<<<<<<<<<<<");
       
       System.out.println("---------------------------------------------");
      
    }
    
}  

