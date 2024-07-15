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
        crud.insertarPelicula(new Pelicula("Z"));
        crud.insertarPelicula(new Pelicula("Civil War"));
        
        
        crud.listarPeliculas();
        
        
        
        
             
        
         
        
        }
    }

    

