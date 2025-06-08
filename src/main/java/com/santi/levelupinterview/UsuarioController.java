package com.santi.levelupinterview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        return List.of(
                new Usuario(1, "Ana"),
                new Usuario(2, "Luis"),
                new Usuario(3, "Santiago")
        );
    }
}