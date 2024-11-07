package br.com.api.calender.atividade;

import br.com.api.calender.materias.Materias;
import jakarta.persistence.*;

@Entity
@Table(name = "atividades")
public class Atividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idatividade" )
    private Integer idatividade;
    // USAR QUANDO FOREIGN KEY!!!!!
    @ManyToOne
    @JoinColumn(name = "idmateria", referencedColumnName = "idmaterias")
    private Materias idmateria;

    @Column (name = "nome_atividade", length = 45)
    private String nome_atividade;

    public Integer getIdatividade() {
        return idatividade;
    }

    public void setIdatividade(Integer idatividade) {
        this.idatividade = idatividade;
    }

    public Materias getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Materias idmateria) {
        this.idmateria = idmateria;
    }

    public String getNome_atividade() {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade) {
        this.nome_atividade = nome_atividade;
    }
}