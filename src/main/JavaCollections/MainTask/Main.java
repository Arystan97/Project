import ElectronicDevices.*;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TV energy consumption");
        int TvEnergyConsumptionValue = sc.nextInt();
        System.out.println("Enter Microwave energy consumption");
        int MicrowaveEnergyConsumptionValue = sc.nextInt();
        System.out.println("Enter Lamp energy consumption");
        int LampEnergyConsumptionValue = sc.nextInt();
        System.out.println("Turn on TV?");
        sc.nextLine();
        String answer1 = sc.nextLine();
        System.out.println("Turn on Microwave?");
        String answer2 = sc.nextLine();
        System.out.println("Turn on Lamp?");
        String answer3 = sc.nextLine();
        ElectronicDevice tv = new TV();
        tv.setEnergyConsumption(TvEnergyConsumptionValue);
        ElectronicDevice microwave = new Microwave();
        microwave.setEnergyConsumption(MicrowaveEnergyConsumptionValue);
        ElectronicDevice lamp = new Lamp();
        lamp.setEnergyConsumption(LampEnergyConsumptionValue);
        tv.askToTurnOn(answer1);
        microwave.askToTurnOn(answer2);
        lamp.askToTurnOn(answer3);
        ElectronicDevice.Filter(tv, microwave, lamp);
    }
}