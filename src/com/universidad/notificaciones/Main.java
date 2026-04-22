package com.universidad.notificaciones;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar Sistema de Notificaciones
        SistemaNotificaciones sistema = new SistemaNotificaciones();

        // 2. Crear Usuarios
        Usuario juan = new Usuario("1010", "Juan Muñoz");
        Usuario maria = new Usuario("2020", "Maria Garcia");
        Usuario pedro = new Usuario("3030", "Pedro Lopez");

        // 3. Crear Diferentes Tipos de Notificaciones
        
        // Email para Juan - Publicación de calificaciones
        Notificacion email = new NotificacionEmail(
            "NOT-001", 
            juan, 
            "Tus calificaciones de Cálculo han sido publicadas.", 
            TipoSituacion.PUBLICACION_CALIFICACIONES, 
            "Nuevas Calificaciones Disponibles", 
            "juan.munoz@campusucc.edu.co"
        );

        // SMS para Maria - Recordatorio de pago
        Notificacion sms = new NotificacionSMS(
            "NOT-002", 
            maria, 
            "Recuerda que mañana vence el plazo de pago de la matrícula.", 
            TipoSituacion.RECORDATORIO_PAGO, 
            "+57 300 123 4567"
        );

        // App Push para Pedro - Cancelación de clase
        Notificacion appPush = new NotificacionApp(
            "NOT-003", 
            pedro, 
            "La clase de Física de las 2:00 PM ha sido cancelada.", 
            TipoSituacion.CANCELACION_CLASE, 
            "DEVICE-ABC-123"
        );

        // 4. Procesar los envíos (Demostrando Polimorfismo)
        System.out.println("=== SISTEMA DE NOTIFICACIONES UNIVERSITARIO ===\n");
        
        sistema.procesarEnvio(email);
        sistema.procesarEnvio(sms);
        sistema.procesarEnvio(appPush);

        // 5. Verificar Historial y Estados
        System.out.println("=== RESUMEN DE ENVÍOS ===");
        for (Notificacion n : sistema.getHistorialNotificaciones()) {
            System.out.println("- Código: " + n.getCodigo() + 
                               " | Destinatario: " + n.getDestinatario().getNombre() + 
                               " | Estado: " + n.getEstado() + 
                               " | Fecha: " + n.getFechaEnvio());
        }
    }
}
