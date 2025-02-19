package com.actividad.actividad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@RestController // Indica que esta clase es un controlador REST.
public class InternacionalizacionController {

    @Autowired // Inyecta una instancia de MessageSource en este controlador.
    private MessageSource messageSource;

    @GetMapping("/saludo") // Mapea la ruta "/saludo" a este método.
    public String obtenerSaludo() {
        // Obtiene el Locale (idioma) actual del contexto de la solicitud.
        Locale locale = LocaleContextHolder.getLocale();

        // Obtiene el mensaje "welcome.message" del archivo de propiedades correspondiente al Locale.
        return messageSource.getMessage("welcome.message", null, locale);
    }
}