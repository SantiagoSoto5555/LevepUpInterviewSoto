package com.santi.levelupinterview;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // aquí puedes poner consultas personalizadas si quieres
}
