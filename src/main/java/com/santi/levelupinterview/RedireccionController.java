package com.santi.levelupinterview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedireccionController {

    @GetMapping("/")
    public String redirigirAUsuarios() {
        return "redirect:/usuarios.html";
    }
}