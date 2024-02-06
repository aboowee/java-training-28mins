class Planet {

    void revolve() {
         System.out.println("Revolve");
    }

    void gravity() {
        System.out.println("Attraction and Repulsion");
    }

    public static void main(String[] args) {
    	Planet earth = new Planet();
    	earth.revolve();
        earth.gravity();
    }
}