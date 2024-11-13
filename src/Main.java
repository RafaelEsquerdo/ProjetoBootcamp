import DesafioDIO.Dominio.*;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Linguagem de Programação");
        curso.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("HTML");
        curso2.setDescricao("Front-End");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descricção Bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamilla = new Dev();
        devCamilla.setNome("Camilla");
        devCamilla.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Camilla: " + devCamilla.getConteudosInscritos());
        devCamilla.progredir();
        System.out.println(" ---------------------- ");
        System.out.println("Conteudos Inscritos de Camilla: " + devCamilla.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Camilla: "+ devCamilla.getConteudosConcluidos());
        System.out.println("XP: " +devCamilla.calcularXp());

        System.out.println(" ----------------------- ");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" ---------------------- ");
        System.out.println("Conteudos Inscritos de João: " + devJoao.getConteudosInscritos());
        System.out.println(" ----------------------- ");
        System.out.println("Conteudos Concluidos de João: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularXp());



    }
}
