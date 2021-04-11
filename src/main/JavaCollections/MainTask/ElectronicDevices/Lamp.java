package ElectronicDevices;

public class Lamp extends ElectronicDevice
{
    public String toString(){
        return "Energy Consumption of Lamp: " + getEnergyConsumption() + " Watts";
    }
}