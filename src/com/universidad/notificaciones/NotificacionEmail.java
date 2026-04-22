package com.universidad.notificaciones;

public class NotificacionEmail extends Notificacion {
    private String asunto;
    private String direccionCorreo;

    public NotificacionEmail(String codigo, Usuario destinatario, String mensaje, TipoSituacion situacion, String asunto, String direccionCorreo) {
        super(codigo, destinatario, mensaje, situacion);
        this.asunto = asunto;
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviar() {
        System.out.println("--- ENVIANDO EMAIL ---");
        System.out.println("Para: " + destinatario.getNombre() + " <" + direccionCorreo + ">");
        System.out.println("Asunto: " + asunto);
        System.out.println("Situación: " + situacion);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("-----------------------");
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }
}
