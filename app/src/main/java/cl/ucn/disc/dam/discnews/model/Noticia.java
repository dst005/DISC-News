package cl.ucn.disc.dam.discnews.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDateTime;

import lombok.Getter;

/**
 * Created by QWERTY on 12-10-2017.
 */

/**
 * Representa una Noticia en un instante de tiempo
 * para el sistema DISC News.
 *
 * @author Diego Saavedra Tapia.
 */
public final class Noticia {
    /**
     * Descripcion en una linea de la noticia
     */
    @Getter
    private String titulo;

    /**
     * Descripcion en 2 lineas y con un maimo de 140 chars
     */
    @Getter
    private String resumen;

    /**
     * Contenido completo de la Noticia
     */
    @Getter
    private String contenido;

    /**
     * Fecha de la Noticia
     */
    @Getter
    private LocalDateTime fecha;

    /**
     * Icono de la noticia de 6464 pixels
     */
    @Getter
    private String icono;

    /**
     * Autor de la noticia en formato: "Diego Saavedra Tapia<dst005@alumnos.ucn.cl>"
     */
    @Getter
    private String autor;

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString( this, ToStringStyle.MULTI_LINE_STYLE);
    }


}
