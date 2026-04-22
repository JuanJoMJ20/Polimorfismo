package com.universidad.notificaciones;

public class NotificacionSMS extends Notificacion {
    private String numeroTelefono;

    public NotificacionSMS(String codigo, Usuario destinatario, String mensaje, TipoSituacion situacion, String numeroTelefono) {
        super(codigo, destinatario, mensaje, situacion);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar() {
        System.out.println("--- ENVIANDO SMS ---");
        System.out.println("Para: " + destinatario.getNombre() + " (Tel: " + numeroTelefono + ")");
        System.out.println("Situación: " + situacion);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("---------------------");
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
