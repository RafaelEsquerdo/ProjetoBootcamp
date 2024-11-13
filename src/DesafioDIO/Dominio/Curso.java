package DesafioDIO.Dominio;

public class Curso extends Conteudo {
        private  String titulo;
        private String descricao;
        private int cargaHoraria;


        @Override
    public double calcularXp() {
        return Xp_padrao * cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



}
