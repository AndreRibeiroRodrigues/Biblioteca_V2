package entities;

public class Aluno {
    private int matricula;
    private String nome,endereco, curso, data;
    private double multa;

    public Aluno(){

    }
    public Aluno(int matricula, String nome, String endereco, String curso, String data, double multa){
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.curso = curso;
        this.data = data;
        this.multa = multa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
