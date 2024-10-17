
package paquete;

public class Helicoptero extends VehiculoAereo{
    
    private int numeroHelices;
    private float autonomiaVuelo;
    private int cantidadMotores;

    public Helicoptero(int numeroHelices, float autonomiaVuelo, int cantidadMotores, int alturaMaxima, int cantidadPasajeros, String codigo, String marca, String modelo) {
        super(alturaMaxima, cantidadPasajeros, codigo, marca, modelo);
        this.numeroHelices = numeroHelices;
        this.autonomiaVuelo = autonomiaVuelo;
        this.cantidadMotores = cantidadMotores;
    }
    
    public void verificarAutonomia(){
        System.out.println("Verificando autonomia de helicoptero...");
    }
    
    public void detallesHelicoptero(){
        System.out.println("Detalles del helicoptero: ");
        System.out.println("Numero de helices: " + numeroHelices);
        System.out.println("Cantidad de motores: " + cantidadMotores);
    }
    
    @Override
    public void desplazar(){
        System.out.println("El helicoptero se esta desplazando...");
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public float getAutonomiaVuelo() {
        return autonomiaVuelo;
    }

    public void setAutonomiaVuelo(float autonomiaVuelo) {
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }
    
    
}
