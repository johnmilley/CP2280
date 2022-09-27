public class Player {

    /* private instance variables can only be */
    private String name;
    private double health;

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
        this.health = health;
    }
}