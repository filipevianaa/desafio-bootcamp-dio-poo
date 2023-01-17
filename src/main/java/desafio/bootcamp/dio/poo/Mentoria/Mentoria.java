/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.bootcamp.dio.poo.Mentoria;

import desafio.bootcamp.dio.poo.Conteudo.Conteudo;
import java.time.LocalDate;

/**
 *
 * @author filipe viana
 */
public class Mentoria extends Conteudo {
    
       private LocalDate date;

    public Mentoria() {
    }

    
    @Override
    public double calcularXp() {
        return XP_DA_ATIVIDADE + 20;
    }
    
    public LocalDate getDate() {
        return date;
    }

    
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo= " +getTitulo() + ", descricao= " + getDescricao() +
                ", date=" + date + '}';
    }
  
}
