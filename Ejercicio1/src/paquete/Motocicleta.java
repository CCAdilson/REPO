
package paquete;

public class Motocicleta extends VehiculoTerrestre{
    
    private int autonomia;
    private int cilindradaMotor;
    private String tipoSuspension;
    private boolean esDeportiva;

    public Motocicleta(int autonomia, int cilindradaMotor, String tipoSuspension, boolean esDeportiva, int numeroLlantas, boolean tieneRemolque, String codigo, String marca, String modelo) {
        super(numeroLlantas, tieneRemolque, codigo, marca, modelo);
        this.autonomia = autonomia;
        this.cilindradaMotor = cilindradaMotor;
        this.tipoSuspension = tipoSuspension;
        this.esDeportiva = esDeportiva;
    }
    
    public void esDeLargaDistancia(){
        if (autonomia > 500) {
            System.out.println("Esta motocicleta es adecuada para largas distancias.");
        } else {
            System.out.println("ESta motocicleta es adecuada para distancias cortas.");
        }
    }
    
    public void detallesMotocicleta(){
        System.out.println("Detalles de la motocicleta: ");
        System.out.println("Tipo de suspension: " + tipoSuspension);
        System.out.println("Deportiva: " + esDeportiva);
    }
    
    @Override
    public void desplazar(){
        System.out.println("La motocicleta se esta desplazando...");
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getCilindradaMotor() {
        return cilindradaMotor;
    }

    public void setCilindradaMotor(int cilindradaMotor) {
        this.cilindradaMotor = cilindradaMotor;
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }

    public boolean isEsDeportiva() {
        return esDeportiva;
    }

    public void setEsDeportiva(boolean esDeportiva) {
        this.esDeportiva = esDeportiva;
    }
    
    
}
