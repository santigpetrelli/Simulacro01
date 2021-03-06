package aplicacion.controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import aplicacion.modelo.Libro;
import aplicacion.modelo.Libro;
import aplicacion.modelo.ListaLibros;
import aplicacion.modelo.ListaLibros;
import java.io.Serializable;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@ViewScoped
public class LibrosFormBeans implements Serializable{
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    private ListaLibros listadoLibros;
    private ListaLibros listadoLibrosAux;
    private String auxTitulo;
    
    public LibrosFormBeans() {
        listadoLibros = new ListaLibros();
        listadoLibrosAux = new ListaLibros();
      
    }

    public void guardarLibro() {
        getListadoLibros().getListaLibro().add(new Libro(getIsbn(), getTitulo(), getAutor(), getPrecio()));
    }
    
    public void buscarLibro() {
        for (int i = 0; i < getListadoLibros().getListaLibro().size(); i++) {
            if (getListadoLibros().getListaLibro().get(i).getTitulo().equals(getAuxTitulo())) {
                getListadoLibrosAux().getListaLibro().add(getListadoLibros().getListaLibro().get(i));
            }
        }
    }
    
    public void reinciar() {
        setListadoLibros(new ListaLibros());
        setListadoLibrosAux(new ListaLibros());
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the listadoLibros
     */
    public ListaLibros getListadoLibros() {
        return listadoLibros;
    }

    /**
     * @param listadoLibros the listadoLibros to set
     */
    public void setListadoLibros(ListaLibros listadoLibros) {
        this.listadoLibros = listadoLibros;
    }

    /**
     * @return the listadoLibrosAux
     */
    public ListaLibros getListadoLibrosAux() {
        return listadoLibrosAux;
    }

    /**
     * @param listadoLibrosAux the listadoLibrosAux to set
     */
    public void setListadoLibrosAux(ListaLibros listadoLibrosAux) {
        this.listadoLibrosAux = listadoLibrosAux;
    }

    /**
     * @return the auxTitulo
     */
    public String getAuxTitulo() {
        return auxTitulo;
    }

    /**
     * @param auxTitulo the auxTitulo to set
     */
    public void setAuxTitulo(String auxTitulo) {
        this.auxTitulo = auxTitulo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
  
}