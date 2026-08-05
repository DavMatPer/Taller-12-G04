public enum Departamento {
    SISTEMAS("Sistemas") {
        @Override
        public double getBono() {
            return 20;
        }
    },
    CONTABILIDAD("Contabilidad") {
        @Override
        public double getBono() {
            return 10;
        }
    }, 
    MEDICO("Medico") { // Clase médico por si luego recibe un bono distinto 
        @Override
        public double getBono() {
            return 0;
        }
    },
    GENERAL("General") { // Clase para un empleado sin departamento
        @Override
        public double getBono() {
            return 0;
        }
    };

    private final String nombre;

    Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double getBono();
}
