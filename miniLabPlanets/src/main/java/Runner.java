public class Runner {
    public static void main(String[] args) {
        Planet newPlanet = new Planet( "mars", 908973);
        System.out.println("original-name===>"+ newPlanet.getName());
        System.out.println("original-size===>"+ newPlanet.getSize());

        newPlanet.setName("Jupiter");
        System.out.println("updated-name===>"+ newPlanet.getName());
        newPlanet.setSize(888888);
        System.out.println("updated-size====>"+ newPlanet.getSize());
        System.out.println(newPlanet.getName()+" is "+newPlanet.getSize());
        newPlanet.explode();

    }
}
