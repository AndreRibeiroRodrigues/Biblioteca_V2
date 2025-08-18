package entities;

public class funcionario {
    private int matricula;
    private String nome;
    private String endereco;
    private String cargo;
    private String data;

    public funcionario(int matricula, String nome, String endereco, String cargo, String data) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.cargo = cargo;
        this.data = data;
    }

    public funcionario() {
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
