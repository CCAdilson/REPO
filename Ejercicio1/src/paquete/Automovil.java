
package paquete;

public class Automovil extends VehiculoTerrestre {
    
    private String tipoMotor;
    private double volumenCilindro;
    private int capacidadTanque;
    private String tipoCombustible;

    public Automovil(String tipoMotor, double volumenCilindro, int capacidadTanque, String tipoCombustible, int numeroLlantas, boolean tieneRemolque, String codigo, String marca, String modelo) {
        super(numeroLlantas, tieneRemolque, codigo, marca, modelo);
        this.tipoMotor = tipoMotor;
        this.volumenCilindro = volumenCilindro;
        this.capacidadTanque = capacidadTanque;
        this.tipoCombustible = tipoCombustible;
    }
    
    public void calcularRendimiento(){
        System.out.println("Calculando rendimiento del automovil...");
    }
    
    public void detallesAutomovil(){
        System.out.println("Detalles del automovil:");
        System.out.println("Tipo de motor: " + tipoMotor);
        System.out.println("Volumen del cilindro: " + volumenCilindro);
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
    
    @Override
    public void desplazar(){
        System.out.println("El automovil se esta desplazando...");
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getVolumenCilindro() {
        return volumenCilindro;
    }

    public void setVolumenCilindro(double volumenCilindro) {
        this.volumenCilindro = volumenCilindro;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
}
