import java.util.*;
import java.util.stream.*;

class House{
    private int Square;
    private int FloorNumber;
    private int RoomQuantity;

    List<House> list = new ArrayList<>();

    public void setSquare(int Square){
        this.Square = Square;
    }

    public int getSquare(){
        return this.Square;
    }

    public void setFloorNumber(int FloorNumber){
        this.FloorNumber = FloorNumber;
    }

    public int getFloorNumber(){
        return this.FloorNumber;
    }

    public void setRoomQuantity(int RoomQuantity){
        this.RoomQuantity = RoomQuantity;
    }

    public int getRoomQuantity(){
        return this.RoomQuantity;
    }

    public String toString(){
        return "Square: " + Square + '\n' + "Floor: " + FloorNumber + '\n' + "RoomQuantity: " + RoomQuantity + '\n';
    }

    public void createArrayOfApartmentCharacteristics(int RoomQuantity, int FloorNumber, int Square){
        House house = new House();
        house.setRoomQuantity(RoomQuantity);
        house.setFloorNumber(FloorNumber);
        house.setSquare(Square);
        list.add(house);
    }

    public void search(int RoomQuantity, int FloorRangeUpperBound, int FloorRangeLowerBound, int Square){
        if(list.isEmpty()){
            System.out.println("no data");
        }//Prints apartment list according to Room quantity
        else if(FloorRangeUpperBound == 0 && FloorRangeLowerBound == 0 && RoomQuantity > 0){
            System.out.println(list.stream().filter(l -> l.getRoomQuantity() == RoomQuantity).collect(Collectors.toList()));
        }//Prints apartments list according to Square value
        else if(RoomQuantity == 0 && FloorRangeUpperBound == 0 && FloorRangeLowerBound == 0 && Square > 0){
            System.out.println(list.stream().filter(l -> l.getSquare() > Square).collect(Collectors.toList()));
        }//Prints apartments list according to Room quantity and located floor range
        else if(FloorRangeUpperBound > 0 || FloorRangeLowerBound > 0 && RoomQuantity > 0){
            System.out.println(list.stream().filter(l -> l.getFloorNumber() < FloorRangeUpperBound && l.getFloorNumber() > FloorRangeLowerBound && l.getRoomQuantity() == RoomQuantity).collect(Collectors.toList()));
        }
    }
}

public class Main{
    public static void main(String[] args){
        House house = new House();
        house.createArrayOfApartmentCharacteristics(5, 3, 27);
        house.createArrayOfApartmentCharacteristics(4, 7, 19);
        house.createArrayOfApartmentCharacteristics(2, 5, 35);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter room quantity to search (if none enter 0)");
        int RoomQuantity = sc.nextInt();
        System.out.println("Enter floor range lower bound to search (if none enter 0)");
        int FloorRangeLowerBound = sc.nextInt();
        System.out.println("Enter floor range upper bound to search (if none enter 0)");
        int FloorRangeUpperBound = sc.nextInt();
        System.out.println("Enter square value to search");
        int Square = sc.nextInt();
        System.out.println("Result:");
        house.search(RoomQuantity, FloorRangeUpperBound, FloorRangeLowerBound, Square);
    }
}