package com.actividad.actividad;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration // Indica que esta clase es una clase de configuración de Spring.
public class ConfigurationInternacionalizacion {

    @Bean // Define un bean gestionado por Spring.
    public MessageSource messageSource() {
        // Crea una instancia de ResourceBundleMessageSource para cargar mensajes desde archivos .properties.
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

        // Especifica el nombre base de los archivos de propiedades (sin la extensión .properties).
        messageSource.setBasename("messages");

        // Configura la codificación de los archivos de propiedades como UTF-8 para manejar caracteres especiales.
        messageSource.setDefaultEncoding("UTF-8");

        // Devuelve el MessageSource configurado.
        return messageSource;
    }
}