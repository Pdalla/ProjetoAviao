package main.classes;

import java.io.Serializable;

public class Voo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String origem;
    private String destino;
    private String empresa;
    private String saida;

    @Override
    public String toString() {
        return "Voo{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", empresa='" + empresa + '\'' +
                ", saida='" + saida + '\'' +
                ", chegada='" + chegada + '\'' +
                ", price=" + price +
                '}';
    }

    public Voo(String origem, String destino, String empresa, String saida, String chegada, Double price) {
        this.origem = origem;
        this.destino = destino;
        this.empresa = empresa;
        this.saida = saida;
        this.chegada = chegada;
        this.price = price;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String chegada;
    private Double price;



}

