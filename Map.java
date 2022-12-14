public class Map {
    private static Room currentRoom;

    public static void main(String[] args) {
        currentRoom = new Shop(0);
        currentRoom.enter();

        System.out.println("\nYou have entered the dungeon.");
        System.out.println(currentRoom.toString());
    }
}