
package paquete;

public abstract class Vehiculo {
    
    private String codigo;
    private String marca;
    private String modelo;

    public Vehiculo(String codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarCoordenadas(){
        System.out.println("Mostrando coordenadas actuales...");
    }
    
    public void transportarPasajeros(){
        System.out.println("Transportando pasajeros");
    }
    
    public abstract void desplazar();
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
