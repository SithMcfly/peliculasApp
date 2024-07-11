/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sith_Mcfly
 */
public class PeliculaCrud {

    List<Pelicula> peliculas = new ArrayList<>();

    public void insertarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se ha insertado la pelicula " + pelicula.getTitulo().toUpperCase());
    }

    public void listarPeliculas() {
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
    }

    public void eliminarPelicula(String titulo) {

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculas.remove(pelicula);
                System.out.println("Se ha eliminado la pelicula " + titulo);
                break;
            } else {
                 System.out.printf("No se ha encontrado la película %s\n", titulo.toUpperCase());
            }
        }
    }

    /*if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculaEliminar = pelicula;
                break;
            }
        }
        if (peliculaEliminar != null) {
            peliculas.remove(peliculaEliminar);
            System.out.println("Se ha eliminado la pelicula " + titulo);
        } else {
            System.out.printf("No se ha encontrado la película %s\n", titulo.toUpperCase());
        }
    }
    
    public String buscarPelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula.toString();
            }
        }
        return "No se encontro la película " + titulo.toUpperCase();
    }*/

    public void actualizarDatos(String titulo, String nuevoTitulo, String quien, String lugar, String fecha) {

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                if (nuevoTitulo != titulo) {
                    pelicula.setTitulo(nuevoTitulo);
                }
                if (pelicula.getQuien() != quien) {
                    pelicula.setQuien(quien);
                }
                if (pelicula.getLugar() != lugar) {
                    pelicula.setLugar(lugar);
                }
                if (pelicula.getFecha() != fecha) {
                    pelicula.setFecha(fecha);
                }
            }

        }

    }

}
