
package paquete;

public abstract class VehiculoTerrestre extends Vehiculo implements Motor{
    
    protected int numeroLlantas;
    protected boolean tieneRemolque;

    public VehiculoTerrestre(int numeroLlantas, boolean tieneRemolque, String codigo, String marca, String modelo) {
        super(codigo, marca, modelo);
        this.numeroLlantas = numeroLlantas;
        this.tieneRemolque = tieneRemolque;
    }
    
    public void remolque(){
        if (tieneRemolque) {
            System.out.println("Este vehiculo puede remolcar.");
        } else {
            System.out.println("Este vehiculo no puede remolcar.");
        }
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo motor del vehículo terrestre...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor del vehículo terrestre...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando vehículo terrestre...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando vehículo terrestre...");
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    public void setTieneRemolque(boolean tieneRemolque) {
        this.tieneRemolque = tieneRemolque;
    }
    
    
}
