package advocacia;

public class Escritorio {
    private String nome;
    private String endereco;
    private String cep;
    private String cnpj;
    private String responsavel;


    public Escritorio(String nome, String endereco, String cep, String cnpj, String responsavel) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

}