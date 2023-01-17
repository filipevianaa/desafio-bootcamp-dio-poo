/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.bootcamp.dio.poo.Curso;

import desafio.bootcamp.dio.poo.Conteudo.Conteudo;

/**
 *
 * @author filipe viana
 */
public class Curso extends Conteudo {
    

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_DA_ATIVIDADE * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao()
                + ", cargaHoraria=" + cargaHoraria + '}';
    }

    
    
    
}
