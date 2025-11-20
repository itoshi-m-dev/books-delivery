package com.itoshi_m_dev.io.BooksDelivery.domain.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String endereco;
    private Double distanciaCentroKm;

    public Cliente(Integer id, String nome, String email, String endereco, Double distanciaCentroKm) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.distanciaCentroKm = distanciaCentroKm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public Double getDistanciaCentroKm() {
        return distanciaCentroKm;
    }

    public void setDistanciaCentroKm(Double distanciaCentroKm) {
        this.distanciaCentroKm = distanciaCentroKm;
    }
}
