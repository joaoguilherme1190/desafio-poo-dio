import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(4);

        curso2.setTitulo("Java Script");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Primeira mentoria do curso Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João:" + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("-------------------");

        Dev devGuilherme = new Dev();
        devJoao.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Guilherme:" + devGuilherme.getConteudosInscritos());

        devGuilherme.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos Guilherme:" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos concluidos Guilherme:" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());
    }
}
