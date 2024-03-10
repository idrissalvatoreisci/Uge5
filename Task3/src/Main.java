import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {


        // INSTANSIERING AF OBJEKTET 'ROOM'
        Room room1 = new Room(2, 3, 5);
        Room room2 = new Room(3, 3, 3);
        Room room3 = new Room(5, 4, 6);

        // ADDING THE ROOM OBJECTS TO THE OBJECT ARRAY LIST
        Building.rooms.add(room1);
        Building.rooms.add(room2);
        Building.rooms.add(room3);

        // INSTANSIATING A ROOM
        Building BuildingOne = new Building(12, 6, true);

        // CREATING AN ARRAY LIST THAT CAN HOLD OBJECTS
        //ArrayList<Room> collection = new ArrayList<>();



        System.out.println(Building.rooms); // THIS LINE PRINTS TO CONSOLE THE ADDRES IN MEMORY

        // PRINTS TO CONSOLE THE NUMBER LAMPS FROM THE TOTAl AMOUNT OF ROOMS
        System.out.println(countLampsInBuilding(BuildingOne));

        // PRINTS TO CONSOLE IF IT IS AN 'OFFICE' BUILDING
        System.out.println(isNormal(BuildingOne));


    }

    // INVOKE A METHOD FOR COUNTING LAMPS IN X-BUILDING
    public static int countLampsInBuilding(Building BuildingOne)
        {
            int totalLamps = 0;
            for (Room r: BuildingOne.getRooms())
            {
                totalLamps += r.getNumberOfLamps();
            }
            return totalLamps;
        }

    public static boolean isNormal(Building BuildingOne)
    {
        if (BuildingOne.getNumberOfFloors() > BuildingOne.getRoomSize())
        {
            return true;
        }
        return false;
    }
}

