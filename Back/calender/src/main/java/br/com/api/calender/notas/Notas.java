package br.com.api.calender.notas;


import br.com.api.calender.materias.Materias;
import br.com.api.calender.usuario.Usuario;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "notas")
public class Notas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idnotas" )
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    private Usuario idusuario;
    @ManyToOne
    @JoinColumn(name = "idmateria", referencedColumnName = "idmaterias")
    private Materias idmateria;
    @Column (name = "nota", precision = 4, scale = 2)
    private BigDecimal nota;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    public Materias getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Materias idmateria) {
        this.idmateria = idmateria;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
