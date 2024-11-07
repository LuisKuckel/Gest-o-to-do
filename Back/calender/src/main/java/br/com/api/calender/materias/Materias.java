package br.com.api.calender.materias;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idmaterias" )
    private Integer id;
    @Column (name = "nome", length = 100)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
