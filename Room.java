import java.util.LinkedList;

public class Room {
    private int depth;
    private LinkedList<Enemy> enemies;
    private LinkedList<Room> connections;
    private boolean entered = false;

    public Room(int depth) {
        this.depth = depth;
        enemies = new LinkedList<Enemy>();
        connections = new LinkedList<Room>();
    }

    public void enter() {
        // only generate new connected rooms when first entering
        if(!entered) {
            entered = true;

            int newConnectionsCount = 
                (int) ((Math.random() * (3 - 1)) + 1);
            
            // generate new connected rooms
            for(int i = 0; i < newConnectionsCount; i++) {
                // try to generate a shop
                int shopGenerationAttempt = 
                    (int) ((Math.random() * (10 - 1)) + 1);
                
                if(shopGenerationAttempt <= 2) {
                    connections.add(
                        new Shop(depth + 1));
                }
                else {
                    connections.add(
                        new Room(depth + 1));
                }
            }
        }
    }

    public String toString() {
        String connectionsAsAString = "";
        for(int i = 0; i < connections.size(); i++) {
            connectionsAsAString += "room";

            if(i < connections.size() - 1) {
                connectionsAsAString += ", ";
            }
        }

        return "ROOM:" + 
            "\n  depth: " + depth + 
            "\n  connections: " + connectionsAsAString;
    }
}
