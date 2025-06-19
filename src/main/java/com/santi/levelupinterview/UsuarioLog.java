package com.santi.levelupinterview;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.time.LocalDateTime;

    @Entity
    @Table(name = "usuarios_log")
    public class UsuarioLog {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "usuario_id")
        private Integer usuarioId;

        private String accion;

        @Column(columnDefinition = "jsonb")
        private String datos;

        @Column(columnDefinition = "TIMESTAMP")
        private LocalDateTime fecha;

        // Getters
        public Long getId() { return id; }
        public Integer getUsuarioId() { return usuarioId; }
        public String getAccion() { return accion; }
        public String getDatos() { return datos; }
        public LocalDateTime getFecha() { return fecha; }
    }