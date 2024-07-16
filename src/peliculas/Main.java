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
        System.out.println("INSERTO");
        try {
            crud.insertarPelicula(new Pelicula("Rafa"));
            crud.insertarPelicula(new Pelicula("Civil War"));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("LISTADO");
        crud.listarPeliculas();
        System.out.println("BORRAR");
        crud.eliminarPelicula("Civil War");
        System.out.println("INSERTO");
        try {
            crud.insertarPelicula(new Pelicula("Rafa"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
        
        System.out.println("LISTO");
        crud.listarPeliculas();
        System.out.println("INSERTO");
        try {
            crud.insertarPelicula(new Pelicula("Matrix"));
            crud.insertarPelicula(new Pelicula("Matrix II"));
            crud.insertarPelicula(new Pelicula("Roma"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("BUSCAR");
        crud.buscarPelicula("Roma");
        try {
        crud.eliminarPelicula("terminator");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        

    }

}
