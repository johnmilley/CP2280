public class PlayerTest {
    public static void main(String[] args) {
        // Create a new Player object from our class
        Player p1 = new Player("Joel", 100);
        Player p2 = new Player("Ellie", 100);

        System.out.println("---- Output ----\n");
        
        System.out.println("Player 1: " + p1.getName());
        System.out.println("Player 2: " + p2.getName());

        System.out.println("\n---- End Output ----");
    }
}
