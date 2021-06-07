public class Planet {
    private String name;
    private Integer size;


    public Planet(String name, Integer size) {
        this.name = name;
        this.size = size;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSize(Integer size) {

        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSize() {

        return this.size;
    }

    public void explode(){

        System.out.println("Boom! "+ this.name+" has exploded");
    }



}
