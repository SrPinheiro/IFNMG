package model;

public class Endereco {
    private static long id_s = 0;
    
    private final long ID;
    private String estado;
    private String cidade;
    private String CEP;
    private String Bairro;
    private String Rua;
    private String numero;
    private String complemento;

    public Endereco(long ID, String estado, String cidade, String Bairro, String Rua) {
        this.estado = estado;
        this.cidade = cidade;
        this.Bairro = Bairro;
        this.Rua = Rua;
        this.ID = ID;
    }

    public long getID() {
        return ID;
    }
    
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
}
