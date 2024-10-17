
package paquete;
public class Main {
    public static void main(String[] args) {
        
        // 1. Instancia de Motocicleta
        Motocicleta moto = new Motocicleta("M001", "Yamaha", "YZF-R1", 2, false, 400, 998);
        System.out.println("----- Motocicleta -----");
        System.out.println("Código de vehículo: " + moto.getCodVehiculo());
        System.out.println("Marca: " + moto.getMarcaVehiculo());
        System.out.println("Modelo: " + moto.getModeloVehiculo());
        System.out.println("Número de llantas: " + moto.getNumLlantas());
        System.out.println("Autonomía: " + moto.getAutonomia() + " km");
        System.out.println("Cilindrada del motor: " + moto.getCilindraMot() + " cc");

        // Ejecutar métodos locales y heredados
        moto.encender();  // Método de la interfaz Motor
        moto.acelerar();  // Método de la interfaz Motor
        moto.frenar();    // Método de la interfaz Motor

        // 2. Instancia de Automóvil
        Automovil auto = new Automovil("A001", "Toyota", "Corolla", 4, false, "Gasolina", 1.8);
        System.out.println("----- Automóvil -----");
        System.out.println("Código de vehículo: " + auto.getCodVehiculo());
        System.out.println("Marca: " + auto.getMarcaVehiculo());
        System.out.println("Modelo: " + auto.getModeloVehiculo());
        System.out.println("Número de llantas: " + auto.getNumLlantas());
        System.out.println("Tipo de motor: " + auto.getTipoMotor());
        System.out.println("Volumen de cilindrada: " + auto.getVolumenCil() + " L");

        // Ejecutar métodos locales y heredados
        auto.encender();  // Método de la interfaz Motor
        auto.acelerar();  // Método de la interfaz Motor
        auto.frenar();    // Método de la interfaz Motor

        // 3. Instancia de Avión
        Avion avion = new Avion("AV001", "Boeing", "737 Max", 35000, 200, 2, 4000.0f);
        System.out.println("----- Avión -----");
        System.out.println("Código de vehículo: " + avion.getCodVehiculo());
        System.out.println("Marca: " + avion.getMarcaVehiculo());
        System.out.println("Modelo: " + avion.getModeloVehiculo());
        System.out.println("Altura máxima de vuelo: " + avion.getAlturaMaxvue() + " ft");
        System.out.println("Cantidad de pasajeros: " + avion.getCantPasajeros());
        System.out.println("Cantidad de motores: " + avion.getCantMotores());
        System.out.println("Distancia máxima de vuelo: " + avion.getDistMax() + " km");

        // Ejecutar métodos locales y heredados
        avion.volar();    // Método de la clase VehiculoAereo
        avion.planear();  // Método de la clase VehiculoAereo
    }
}
