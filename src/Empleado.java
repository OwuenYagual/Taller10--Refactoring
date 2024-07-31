public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }
    public void imprimirDetalles() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Salario: " + this.getSalarioBase());
        System.out.println("Horas trabajadas: " + this.getHorasTrabajadas());
        System.out.println("Departamento: " + this.getDepartamento());
    }
    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
    
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
        if (horasTrabajadas > 40) {
            salarioTotal += (horasTrabajadas - 40) * 50;
        }
        salarioTotal+=departamento.getSalarioAdicional();
        return salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
