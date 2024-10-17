
package paquete;

public class Avion extends VehiculoAereo{
    
    private int cantidadMortores;
    private float distanciaMaxima;
    private float pesoMaximoCarga;
    private String tipoCabina;

    public Avion(int cantidadMortores, float distanciaMaxima, float pesoMaximoCarga, String tipoCabina, int alturaMaxima, int cantidadPasajeros, String codigo, String marca, String modelo) {
        super(alturaMaxima, cantidadPasajeros, codigo, marca, modelo);
        this.cantidadMortores = cantidadMortores;
        this.distanciaMaxima = distanciaMaxima;
        this.pesoMaximoCarga = pesoMaximoCarga;
        this.tipoCabina = tipoCabina;
    }
    
    public void cargarCarga(){
        System.out.println("Cargando el avion con carga...");
    }
    
    public void detallesAvion(){
        System.out.println("Detalles del avion: ");
        System.out.println("Cantidad motores: " + cantidadMortores);
        System.out.println("Tipo de cabina: " + tipoCabina);
    }
    
    @Override
    public void desplazar(){
        System.out.println("El avion se esta desplazando...");
    }

    public int getCantidadMortores() {
        return cantidadMortores;
    }

    public void setCantidadMortores(int cantidadMortores) {
        this.cantidadMortores = cantidadMortores;
    }

    public float getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void setDistanciaMaxima(float distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public float getPesoMaximoCarga() {
        return pesoMaximoCarga;
    }

    public void setPesoMaximoCarga(float pesoMaximoCarga) {
        this.pesoMaximoCarga = pesoMaximoCarga;
    }

    public String getTipoCabina() {
        return tipoCabina;
    }

    public void setTipoCabina(String tipoCabina) {
        this.tipoCabina = tipoCabina;
    }
    
    
}
