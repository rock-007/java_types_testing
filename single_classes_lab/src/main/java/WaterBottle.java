public class WaterBottle {

    int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }


    public int getVolume() {
        return this.volume;
    }

    public void takeDrink() {
        this.volume -= 10;
    }

    public void emptyBottle() {
        this.volume = 0;
    }

    public void fillBottle() {
        this.volume = 100;
    }
}
