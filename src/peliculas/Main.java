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

        try {
            crud.insertarPelicula(new Pelicula("Z"));
            crud.insertarPelicula(new Pelicula("Civil War"));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        crud.listarPeliculas();
        crud.eliminarPelicula("Z");
        try {
            crud.insertarPelicula(new Pelicula("Gattaca"));
            crud.insertarPelicula(new Pelicula("Matrix"));
            crud.insertarPelicula(new Pelicula("Z"));
            crud.insertarPelicula(new Pelicula("Terminator"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("******************************");
        crud.listarPeliculas();
        System.out.println("******************************");
        crud.buscarPelicula("Z");
    }
    
}
