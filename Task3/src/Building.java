import java.util.ArrayList;

public class Building {
    public static ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding)
    {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;

    }


    public ArrayList<Room> getRooms()
    {
        return rooms;
    }

    public int getNumberOfFloors()
    {
        return numberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public boolean isOfficeBuilding()
    {
        return isOfficeBuilding;
    }

    public int getRoomSize()
    {
        return rooms.size();
    }
}

