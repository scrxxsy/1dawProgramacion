package ejerEdificios;

public class Edificio {
    /**
     * Variables de instancia
     */
    private Direccion dirEdificio;
    private int numHabitaciones;
    private int numPlantas;
    private float areaEdificio;

    /**
     * Constructor que recibe todos los datos de un edificio
     */
    public Edificio(Direccion dirEdificio, int numHabitaciones, int numPlantas, float areaEdificio) {
        this.dirEdificio = dirEdificio;
        this.numHabitaciones = numHabitaciones;
        this.numPlantas = numPlantas;
        this.areaEdificio = areaEdificio;
    }

    /**
     * Constructor que recibe los datos del edificio, creando la dirección internamente
     */
    public Edificio(String nomCalle, int numDireccion, int codPostal, 
                    int numHabitaciones, int numPlantas, float areaEdificio) {
        this(new Direccion(nomCalle, numDireccion, codPostal), numHabitaciones, numPlantas, areaEdificio);
    }

    /**
     * Getters y Setters
     */
    public Direccion getDirEdificio() { return dirEdificio; }
    public int getNumHabitaciones() { return numHabitaciones; }
    public int getNumPlantas() { return numPlantas; }
    public float getAreaEdificio() { return areaEdificio; }

    public void setDirEdificio(Direccion dirEdificio) { this.dirEdificio = dirEdificio; }
    public void setNumHabitaciones(int numHabitaciones) { this.numHabitaciones = numHabitaciones; }
    public void setNumPlantas(int numPlantas) { this.numPlantas = numPlantas; }
    public void setAreaEdificio(float areaEdificio) { this.areaEdificio = areaEdificio; }

    /**
     * Calcula el IBI del edificio
     */
    public float calculaIBI() {
        return this.areaEdificio * 1.2f + this.numPlantas * 100;
    }

    /**
     * Redefinición de toString
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName().toUpperCase() +
               "\n\tDirección: " + this.dirEdificio.toString() +
               (this.calculaIBI() < 0 
                       ? "\n\tImpuesto de IBI: No debe ningún impuesto IBI" 
                       : "\n\tImpuesto de IBI: " + this.calculaIBI() + " €") +
               "\n\tNúmero de habitaciones: " + this.numHabitaciones +
               "\n\tNúmero de plantas: " + this.numPlantas +
               "\n\tÁrea del edificio: " + this.areaEdificio;
    }
}
