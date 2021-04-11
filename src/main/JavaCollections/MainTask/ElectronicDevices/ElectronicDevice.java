package ElectronicDevices;

import java.util.*;
import java.util.stream.*;

public class ElectronicDevice implements Comparable<ElectronicDevice>
{
    private int EnergyConsumption;
    private boolean isTurnOn;

    public void setEnergyConsumption(int EnergyConsumption){
        this.EnergyConsumption = EnergyConsumption;
    }

    public int getEnergyConsumption(){
        return EnergyConsumption;
    }

    private void turnOn(){
        isTurnOn = true;
    }

    private void turnOff(){
        isTurnOn = false;
        EnergyConsumption = 0;
    }

    public void askToTurnOn(String answer){
        switch(answer){
            case "yes" -> turnOn();
            case "no" -> turnOff();
        }
    }

    public static void Filter(ElectronicDevice device1, ElectronicDevice device2, ElectronicDevice device3) {
        Scanner sc = new Scanner(System.in);
        List<ElectronicDevice> TurnOnDevices = Stream.of(device1, device2, device3).filter(device -> device.isTurnOn).sorted().collect(Collectors.toList());
        List<ElectronicDevice> TurnOffDevices = Stream.of(device1, device2, device3).filter(device -> !device.isTurnOn).sorted().collect(Collectors.toList());
        System.out.println("Turned on devices:");
        TurnOnDevices.forEach(System.out::println);
        System.out.println("Turned off devices:");
        TurnOffDevices.forEach(System.out::println);
        System.out.println("Enter device energy consumption for search");
        int EnergyConsumptionValue = sc.nextInt();
        TurnOnDevices = TurnOnDevices.stream().filter(device -> device.EnergyConsumption == EnergyConsumptionValue).collect(Collectors.toList());
        if(TurnOnDevices.isEmpty()){
            System.out.println("No devices found");
        }else{
            TurnOnDevices.forEach(System.out::println);
        }
    }

    @Override
    public int compareTo(ElectronicDevice o){
        return (this.EnergyConsumption - o.EnergyConsumption);
    }

    public String toString(){
        return "Energy Consumption: " + EnergyConsumption + " Watts";
    }
}