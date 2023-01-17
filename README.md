# Desafio de Projeto do Bootcamp da DIO.me
Desafio de Projeto do Bootcamp da Dio.me referente à abstração de um Bootcamp e seus atributos e métodos.

## Visão Geral
Neste desafio foi solicitado ao aluno que realizasse a abstração das classes, e seus respectivos atributos e métodos, de um Bootcamp e implementasse o código em Java
utilizando o paradigma de Programação Orientada a Objetos.

## Abstração (Definição das Classes, atributos e métodos)
Em um bootcamp existem dois tipos de conteúdos, os cursos e as mentorias e ambas possuem atributos em comum, portanto criou-se a classe Conteudo:

Atributos da classe Conteudo:
  - Titulo;
  - Descrição;
  - XP padrão do conteúdo (constante).
Métodos da classe Conteudo:
  - Método abstrato para calcularXp (será utilizado pelas classes que o herdarão);
  - Getters and Setters.
  
A classe Curso herda de Conteudo
Atributos de Curso:
  - Todos de Conteudo;
  - Carga Horaria
Métodos de Curso:
  - Todos de Conteudo
    
A classe Mentoria também herda de Conteudo
Atributos de Mentoria:
  - Todos de Conteudo;
  - Data
Métodos de Curso:
  - Todos de Conteudo
  
Atributos da classe Bootcamp:
  - Nome;
  - Descrição;
  - Data de início;
  - Data de Término;
  - Lista de Devs Inscritos (Set);
  - Lista de Conteúdos (Set)

Atributos da classe Dev:
  - Nome;
  - Conteúdos Inscritos;
  - Conteúdos Concluídos;
  
 
   
 
  
 

