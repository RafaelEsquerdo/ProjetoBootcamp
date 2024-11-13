package DesafioDIO.Dominio;

public abstract class Conteudo {
    protected static final  double Xp_padrao = 10;
       private String titulo;
       private String descricao;

        public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
