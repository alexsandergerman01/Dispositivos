public class Main {
    public static void main(String[] args) {
        Proyector proyector = new Proyector("Proyector Sala 201", true);
        Computador computador = new Computador("PC Laboratorio", true);
        Impresora impresora = new Impresora("Impresora Biblioteca", false);

        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();
    }
}