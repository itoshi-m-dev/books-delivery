package com.itoshi_m_dev.io.BooksDelivery.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class PedidoEntrega implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valorEntrega;
    private Integer protocolo;

    private Cliente cliente;
    private Livro livro;
    private StatusEntrega status;

    public PedidoEntrega(Integer id, Double valorEntrega, Integer protocolo, Cliente cliente, Livro livro, StatusEntrega status) {
        this.id = id;
        this.valorEntrega = valorEntrega;
        this.protocolo = protocolo;
        this.cliente = cliente;
        this.livro = livro;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(Double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public Integer getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Integer protocolo) {
        this.protocolo = protocolo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public StatusEntrega getStatus() {
        return status;
    }

    public void setStatus(StatusEntrega status) {
        this.status = status;
    }
}
