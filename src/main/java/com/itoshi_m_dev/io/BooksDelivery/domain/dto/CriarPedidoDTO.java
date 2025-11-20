package com.itoshi_m_dev.io.BooksDelivery.domain.dto;

public class CriarPedidoDTO {

    private Integer clienteId;
    private Integer livroId;

    public CriarPedidoDTO(Integer clienteId, Integer livroId) {
        this.clienteId = clienteId;
        this.livroId = livroId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getLivroId() {
        return livroId;
    }

    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }


}
