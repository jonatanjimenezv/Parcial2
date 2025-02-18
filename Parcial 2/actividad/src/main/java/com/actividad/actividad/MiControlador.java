package com.actividad.actividad;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MiControlador {

    @GetMapping("/publico")
    public String publico(@RequestParam(name = "lang", required = false) String lang, Model model) {
        String mensaje = "¡Hola! Este es un contenido público.";
        if ("en".equals(lang)) {
            mensaje = "Hello! This is a public content.";
        }
        model.addAttribute("mensaje", mensaje);
        return "publico";
    }

    @GetMapping("/privado")
    public String privado(@RequestParam(name = "lang", required = false) String lang, Model model) {
        String mensaje = "¡Hola! Este es un contenido privado.";
        if ("en".equals(lang)) {
            mensaje = "Hello! This is a private content.";
        }
        model.addAttribute("mensaje", mensaje);
        return "privado";
    }
}