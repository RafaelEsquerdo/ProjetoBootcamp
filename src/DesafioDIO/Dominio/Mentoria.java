package DesafioDIO.Dominio;

import java.time.LocalDate;

public class Mentoria  extends  Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate data;

    @Override
    public double calcularXp() {
        return Xp_padrao + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



}
