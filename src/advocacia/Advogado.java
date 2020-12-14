package advocacia;

public class Advogado {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private double ganhos;
    private String oab;
    private Estado estadoDaOab;

    public Advogado(String nome, String email, String senha, String telefone, double ganhos, String oab, Estado estadoDaOab) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.ganhos = ganhos;
        this.oab = oab;
        this.estadoDaOab = estadoDaOab;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getGanhos() {
        return ganhos;
    }

    public void setGanhos(double ganhos) {
        this.ganhos = ganhos;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public Estado getEstadoDaOab() {
        return estadoDaOab;
    }

    public void setEstadoDaOab(Estado estadoDaOab) {
        this.estadoDaOab = estadoDaOab;
    }

    public void criaProcesso(double honorario, double totalFinal){

    }

    public void adicionarResposta(String texto){

    }

    public void editarResposta(String texto){

    }
}