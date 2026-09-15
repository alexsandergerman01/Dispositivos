public class Main {
    public static void main(String[] args) {
        Dispositivo sensorPrincipal = new Dispositivo("Sensor de Temperatura", true);

        sensorPrincipal.mostrarEstado();
        sensorPrincipal.ejecutarDiagnostico();
    }
}