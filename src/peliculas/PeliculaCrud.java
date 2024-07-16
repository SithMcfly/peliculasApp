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

    public void insertarPelicula(Pelicula pelicula) throws IllegalArgumentException {
        for (Pelicula peli : peliculas) {
            if (peli.getTitulo().equalsIgnoreCase(pelicula.getTitulo())) {
                throw new IllegalArgumentException("La pelicula " + pelicula.getTitulo().toUpperCase() + " ya esta registrada");
            }
        }
        peliculas.add(pelicula);
        System.out.printf("Se agregó la pelicula %s \n", pelicula.getTitulo());
    }

    public void listarPeliculas() {
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
    }

    public void eliminarPelicula(String titulo) throws IllegalArgumentException {
        boolean eliminada = false;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculas.remove(pelicula);
                eliminada=true;
                System.out.printf("Se eliminó la pelicula %s\n", titulo);
                break;
            } 
            } if (!eliminada) {
                throw new IllegalArgumentException("No se encontro la pelicula " + titulo);
        }
    }

    /*public void eliminarPelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculas.remove(pelicula);
                System.out.println("Se ha eliminado la pelicula " + titulo);
            }
        }
        System.out.printf("No se ha encontrado la película %s\n", titulo.toUpperCase());
    }*/
    public void buscarPelicula(String titulo) {
        boolean encontrada = false;
        for (Pelicula pelicula : peliculas) {
            if (titulo.equalsIgnoreCase(pelicula.getTitulo())) {
                System.out.println(pelicula.toString());
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("no encontrada");
        }

    }

    public void actualizarDatos(String titulo, String quien, String lugar, String fecha) {

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                if (titulo != pelicula.getTitulo()) {
                    pelicula.setTitulo(titulo);
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
