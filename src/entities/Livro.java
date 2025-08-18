package entities;

public class Livro {
    private int codigo;
    private char tipo;
    private String autor;
    private String titulo;
    private String fatorImpacto;
    private String editora;
    private int anoPublicacao;
    private String issn;

    public Livro() {
    }


    public Livro(int codigo, char tipo, String autor, String titulo, String fatorImpacto, String editora, int anoPublicacao, String issn) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.autor = autor;
        this.titulo = titulo;
        this.fatorImpacto = fatorImpacto;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.issn = issn;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFatorImpacto() {
        return fatorImpacto;
    }

    public void setFatorImpacto(String fatorImpacto) {
        this.fatorImpacto = fatorImpacto;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }




}
