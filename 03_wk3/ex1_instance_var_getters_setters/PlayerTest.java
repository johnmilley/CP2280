public class PlayerTest {
    public static void main(String[] args) {
        // Create a new Player object from our class
        Player p1 = new Player();

        // p1.setName("AReallyLongNameForACharacter");
        p1.setName("Bob");

        // the default value for String instance variable is null
        if (p1.getName() != null) {
            System.out.println(p1.getName());
        }
    }
}
