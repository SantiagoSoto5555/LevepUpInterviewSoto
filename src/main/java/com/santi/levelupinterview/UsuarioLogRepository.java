package com.santi.levelupinterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioLogRepository extends JpaRepository<UsuarioLog, Long> {

    @Query(value = "SELECT * FROM usuarios_log ORDER BY fecha DESC", nativeQuery = true)
    List<UsuarioLog> findAllOrderedByFecha();

    @Query(value = "SELECT * FROM usuarios_log WHERE usuario_id = :usuarioId ORDER BY fecha DESC", nativeQuery = true)
    List<UsuarioLog> findByUsuarioIdOrdered(Integer usuarioId);
}
