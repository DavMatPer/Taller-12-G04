public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
    }

    @Override
    public void imprimirDetalles() {
    super.imprimirDetalles();
    System.out.println("Bono anual: " + bonoAnual);
    }



    // Más metodos private double tarifaHora;
}
