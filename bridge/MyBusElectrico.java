package alarcos.patrones.bridge;

import alarcos.patrones.bridge.Auto;
import alarcos.patrones.bridge.Motor;

public class MyBusElectrico {

    private MyMotorElectrico motor;
            
    public MyBusElectrico(MyMotorElectrico motor){
        this.motor = motor;
    }

    
    public void prender() {
        System.out.println("Prendiendo motor electrico");
    }

    
    public void apagar() {
        System.out.println("Apagando motor electrico");
    }

    
    public void aumentaRevoluciones() {
        System.out.println("Aumentando 30 revoluciones");
    }

    
    public void reducirRevoluciones() {
        System.out.println("Reduciendo 30 revoluciones");
    }
    
}
