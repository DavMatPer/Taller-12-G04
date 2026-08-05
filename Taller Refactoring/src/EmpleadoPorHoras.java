public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;


    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento, genero);

        this.tarifaHora = tarifaHora;


        super.setSalarioBase(calcularSalario());

    }
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tarifa por hora: " + tarifaHora);
    }


    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * this.tarifaHora;
        return salario;
    }
        public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Más metodos
}