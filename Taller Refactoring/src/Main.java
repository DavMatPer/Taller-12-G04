public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", 45, 15, Departamento.SISTEMAS, "Masculino");
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor", 700, 45, Departamento.CONTABILIDAD, 40, "Masculino");
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas", 200, 20, Departamento.MEDICO, 6, "Masculino");

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        System.out.println("--- Empleado 1 ---");
        emp1.imprimirDetalles();
        
        System.out.println("\n--- Empleado 2 ---");
        emp2.imprimirDetalles();
        
        System.out.println("\n--- Empleado 3 ---");
        emp3.imprimirDetalles();
    }
}