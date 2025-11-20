package com.itoshi_m_dev.io.BooksDelivery.domain.dto;

public class RetornarPedidoDTO {

    private Integer pedidoId;
    private Double valorEntrega;
    private String protocolo;
    private String mensagem;

    public RetornarPedidoDTO(Integer pedidoId, Double valorEntrega, String protocolo, String mensagem) {
        this.pedidoId = pedidoId;
        this.valorEntrega = valorEntrega;
        this.protocolo = protocolo;
        this.mensagem = mensagem;
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(Double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
