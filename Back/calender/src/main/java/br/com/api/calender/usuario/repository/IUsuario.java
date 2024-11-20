package br.com.api.calender.usuario.repository;

import br.com.api.calender.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {
}
