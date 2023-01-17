/*
Criação da classe Conteudo que irá conter os atributos que Curso e Mentoria
irão herdar
*/

package desafio.bootcamp.dio.poo.Conteudo;

/**
 *
 * @author filipe viana
 */

// Classe abstrata: não se pode instanciar objetos nesta classe.
public abstract class Conteudo { 
    
    private String titulo;
    private String descricao;
    protected static final double XP_DA_ATIVIDADE = 10d;


    public abstract double calcularXp();
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
