public class EmpleadoTemporario extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
// Pull Up Constructor Body
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }
    
    public int getMesesContrato() { return mesesContrato; }
    public void setMesesContrato(int mesesContrato) { this.mesesContrato = mesesContrato; }
}
