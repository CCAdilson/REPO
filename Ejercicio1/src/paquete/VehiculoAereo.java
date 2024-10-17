
package paquete;

public abstract class VehiculoAereo extends Vehiculo implements Motor{
    
    protected int alturaMaxima;
    protected int cantidadPasajeros;

    public VehiculoAereo(int alturaMaxima, int cantidadPasajeros, String codigo, String marca, String modelo) {
        super(codigo, marca, modelo);
        this.alturaMaxima = alturaMaxima;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    public void volar(){
        System.out.println("El vehiculo aereo esta volando...");
    }
    
    public void planear(){
        System.out.println("El vehiculo aereo esta planeando...");
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo motor del vehículo aéreo...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor del vehículo aéreo...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el vehículo aéreo...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando el vehículo aéreo...");
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
}
