package com.itoshi_m_dev.io.BooksDelivery.domain.model;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_livros")
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private Double pesoEmGramas;

    public Livro(Integer id, String titulo, String autor, Double pesoEmGramas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.pesoEmGramas = pesoEmGramas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPesoEmGramas() {
        return pesoEmGramas;
    }

    public void setPesoEmGramas(Double pesoEmGramas) {
        this.pesoEmGramas = pesoEmGramas;
    }


}
