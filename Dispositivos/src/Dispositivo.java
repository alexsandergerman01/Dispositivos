// Archivo: Dispositivo.java
public class Dispositivo {

    // Atributos privados
    private String nombre;
    private boolean activo;

    // Constructor
    public Dispositivo(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    // Método para mostrar el estado
    public void mostrarEstado() {
        System.out.println("Dispositivo: " + nombre + " | Estado activo: " + activo);
    }

    // Método para ejecutar diagnóstico
    public void ejecutarDiagnostico() {
        System.out.println("Ejecutando diagnóstico general en " + nombre + "...");
    }
}