public class Player {

    /* private instance variables can only be */
    private String name;
    private double health;

    // constructor
    public Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    // constructor with basic validation
    // public Player(String name, double health) {
    //     if(name.length() < 15) {
    //         this.name = name;
    //     }
    //     if(health > 0) {
    //         this.health = health;
    //     }
    // }

    // Get and Set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        /* Using a setter allows us to validate
         * the data in useful ways. For instance,
         * here we could use a regular expressio
         * (regex) to only accept valid names. 
         */
        if(name.length() < 15) {
            this.name = name;
        }
        else {
            System.out.println("Name must be under 15 characters.");
        }
    }

    public double getHealth() {
        /* Using a getter can allow us to present
         * a different value to the user than what 
         *  is store internally
         */
        return (int)health;
    }

    public void setHealth(double health) {
        if (health > 0) {
            this.health = health;
        }
    }
}