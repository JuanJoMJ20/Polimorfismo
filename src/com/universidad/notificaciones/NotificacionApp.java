package com.universidad.notificaciones;

public class NotificacionApp extends Notificacion {
    private String idDispositivo;

    public NotificacionApp(String codigo, Usuario destinatario, String mensaje, TipoSituacion situacion, String idDispositivo) {
        super(codigo, destinatario, mensaje, situacion);
        this.idDispositivo = idDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("--- ENVIANDO PUSH APP ---");
        System.out.println("Para: " + destinatario.getNombre() + " (DeviceID: " + idDispositivo + ")");
        System.out.println("Situación: " + situacion);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("--------------------------");
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }
}
