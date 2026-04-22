package com.universidad.notificaciones;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificaciones {
    private List<Notificacion> historialNotificaciones;

    public SistemaNotificaciones() {
        this.historialNotificaciones = new ArrayList<>();
    }

    public void procesarEnvio(Notificacion notificacion) {
        System.out.println("Procesando notificación " + notificacion.getCodigo() + "...");
        
        // Polimorfismo en acción: se llama al método enviar() de la subclase correspondiente
        notificacion.enviar();
        
        // Cambiar el estado a ENVIADA
        notificacion.setEstado(EstadoNotificacion.ENVIADA);
        
        // Guardar en el historial
        historialNotificaciones.add(notificacion);
        System.out.println("Notificación " + notificacion.getCodigo() + " marcada como ENVIADA.\n");
    }

    public List<Notificacion> getHistorialNotificaciones() {
        return historialNotificaciones;
    }
}
