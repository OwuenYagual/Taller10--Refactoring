public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Genero: " + genero);
    }

    // Más metodos
}
