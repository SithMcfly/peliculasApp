/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

/**
 *
 * @author Sith_Mcfly
 */
public class Main {
    public static void main(String[] args) {
        PeliculaCrud crud = new PeliculaCrud();
        
        crud.insertarPelicula(new Pelicula("Batman"));
        crud.listarPeliculas();
        
        crud.actualizarDatos("Batman", "Batman Begins", "Guti", "cine", "01/01/2023");
        crud.listarPeliculas();
        crud.insertarPelicula(new Pelicula("X-Men"));
        crud.insertarPelicula(new Pelicula("Acorralado"));
        crud.insertarPelicula(new Pelicula("Star-Wars: na nueva esperanza"));
        crud.insertarPelicula(new Pelicula("La Liga de la Justicia"));
        
        crud.listarPeliculas();
        
       crud.eliminarPelicula("X-men");
             
        
         
        
        }
    }

    

