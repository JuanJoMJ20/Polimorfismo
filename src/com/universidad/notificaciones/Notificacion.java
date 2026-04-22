package com.universidad.notificaciones;

import java.time.LocalDateTime;

public abstract class Notificacion {
    protected String codigo;
    protected Usuario destinatario;
    protected String mensaje;
    protected LocalDateTime fechaEnvio;
    protected EstadoNotificacion estado;
    protected TipoSituacion situacion;

    public Notificacion(String codigo, Usuario destinatario, String mensaje, TipoSituacion situacion) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.situacion = situacion;
        this.estado = EstadoNotificacion.PENDIENTE;
        this.fechaEnvio = LocalDateTime.now();
    }

    public abstract void enviar();

    public void registrarInformacionBase() {
        System.out.println("Registrando información base para la notificación " + codigo);
    }

    // Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoNotificacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoNotificacion estado) {
        this.estado = estado;
    }

    public TipoSituacion getSituacion() {
        return situacion;
    }

    public void setSituacion(TipoSituacion situacion) {
        this.situacion = situacion;
    }
}
