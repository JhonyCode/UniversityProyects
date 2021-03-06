package com.saberpro.modelo.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.util.Date;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public class PruebaProgramaUsuarioPreguntaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(PruebaProgramaUsuarioPreguntaDTO.class);
    private String activo;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private Long idPruebaProgramaUsuarioPregunta;
    private Long usuCreador;
    private Long usuModificador;
    private Long idPregunta_Pregunta;
    private Long idPruebaProgramaUsuario_PruebaProgramaUsuario;

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Long getIdPruebaProgramaUsuarioPregunta() {
        return idPruebaProgramaUsuarioPregunta;
    }

    public void setIdPruebaProgramaUsuarioPregunta(
        Long idPruebaProgramaUsuarioPregunta) {
        this.idPruebaProgramaUsuarioPregunta = idPruebaProgramaUsuarioPregunta;
    }

    public Long getUsuCreador() {
        return usuCreador;
    }

    public void setUsuCreador(Long usuCreador) {
        this.usuCreador = usuCreador;
    }

    public Long getUsuModificador() {
        return usuModificador;
    }

    public void setUsuModificador(Long usuModificador) {
        this.usuModificador = usuModificador;
    }

    public Long getIdPregunta_Pregunta() {
        return idPregunta_Pregunta;
    }

    public void setIdPregunta_Pregunta(Long idPregunta_Pregunta) {
        this.idPregunta_Pregunta = idPregunta_Pregunta;
    }

    public Long getIdPruebaProgramaUsuario_PruebaProgramaUsuario() {
        return idPruebaProgramaUsuario_PruebaProgramaUsuario;
    }

    public void setIdPruebaProgramaUsuario_PruebaProgramaUsuario(
        Long idPruebaProgramaUsuario_PruebaProgramaUsuario) {
        this.idPruebaProgramaUsuario_PruebaProgramaUsuario = idPruebaProgramaUsuario_PruebaProgramaUsuario;
    }
}
