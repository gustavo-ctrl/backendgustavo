package br.com.gustavo.backendgustavo.entities;

import br.com.gustavo.backendgustavo.models.EnderecoView;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer enderecoId;
    private String rua;
    private Integer numero;
    private Integer cep;
    private String cidade;
    private String bairro;
    private String estado;

    public Endereco() {}
    public Endereco(EnderecoView enderecoView) {
        this.rua=enderecoView.getRua();
        this.cep=enderecoView.getCep();
        this.bairro=enderecoView.getBairro();
        this.cidade=enderecoView.getCidade();
        this.numero=enderecoView.getNumero();
        this.estado=enderecoView.getEstado();

    }

    public Integer getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(Integer enderecoId) {
        this.enderecoId = enderecoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
