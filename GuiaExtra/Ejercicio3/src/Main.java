import entidades.ServiceVehiculo;

public class Main {
    public static void main(String []args){
        ServiceVehiculo listVehiculo = new ServiceVehiculo();
        listVehiculo.crearVehiculo();
        listVehiculo.mostarList();
        System.out.println("");
        listVehiculo.menorTresCant();
        listVehiculo.mayorTresCant();
    }
}
