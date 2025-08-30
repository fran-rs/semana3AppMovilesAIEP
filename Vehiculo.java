import java.util.Scanner; // importé Scanner para leer los datos del usuario

public class Vehiculo {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada De Datos
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = sc.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        String combustible = sc.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        String capacidad = sc.nextLine();

        //Salida De Datos

        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
    }
}