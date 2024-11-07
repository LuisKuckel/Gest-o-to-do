package br.com.api.calender.notas_atividades;

import br.com.api.calender.atividade.Atividades;
import br.com.api.calender.materias.Materias;
import br.com.api.calender.usuario.Usuario;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "notas_atividades")
public class Notas_Atividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idnotas_atividades")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    private Usuario idusuario;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idatividade", referencedColumnName = "idatividade")
    private Atividades idatividade;
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

    public Atividades getIdatividade() {
        return idatividade;
    }

    public void setIdatividade(Atividades idatividade) {
        this.idatividade = idatividade;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
}
