package com.santi.levelupinterview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
@CrossOrigin(origins = {"https://levepupinterviewsoto.onrender.com", "http://localhost:5500"})
public class UsuarioLogController {

    @Autowired
    private UsuarioLogRepository usuarioLogRepository;

    @GetMapping
    public List<UsuarioLog> obtenerTodosLogs() {
        return usuarioLogRepository.findAllOrderedByFecha();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<UsuarioLog> obtenerLogsPorUsuario(@PathVariable Integer usuarioId) {
        return usuarioLogRepository.findByUsuarioIdOrdered(usuarioId);
    }
}