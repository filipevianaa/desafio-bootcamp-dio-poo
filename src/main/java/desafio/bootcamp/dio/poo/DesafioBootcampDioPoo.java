/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package desafio.bootcamp.dio.poo;

import desafio.bootcamp.dio.poo.Bootcamp.Bootcamp;
import desafio.bootcamp.dio.poo.Curso.Curso;
import desafio.bootcamp.dio.poo.Dev.Dev;
import desafio.bootcamp.dio.poo.Mentoria.Mentoria;
import java.time.LocalDate;


/**
 *
 * @author filipe viana
 */
public class DesafioBootcampDioPoo {

    public static void main(String[] args) {

        
        //Criando um novo objeto de Curso utilizando os Setters:        
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java completo");
        curso1.setCargaHoraria(16);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Framework");
        curso2.setDescricao("Curso de Spring Framework");
        curso2.setCargaHoraria(8);
   
        //Criando um objeto de Mentoria:
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Entre no mercado de trabalho");
        mentoria1.setDescricao("Dicas para conseguir a sua primeira vaga Dev.");
        mentoria1.setDate(LocalDate.now());
        
        //Criando um Bootcamp:        
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Orange Tech");
        bootcamp1.setDescricao("Bootcamp Java Back End da Dio.me");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        
        //Criando dois Devs:
        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");  
        devFilipe.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos de Filipe: " + devFilipe.getConteudosInscritos());
        devFilipe.progredir();
        devFilipe.progredir();
        System.out.println("Conteúdos concluidos de Filipe" + devFilipe.getConteudosConcluidos());
        System.out.println("XP Total de Filipe: " + devFilipe.calcularTotalXp());
        
        System.out.println("-----------------------------------------");
        
        Dev devEduardo = new Dev();       
        devEduardo.setNome("Eduardo");     
        devEduardo.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos de Eduardo: " + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        System.out.println("Conteúdos concluidos de Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("XP Total de Eduardo: " + devEduardo.calcularTotalXp());
        
    }
}
