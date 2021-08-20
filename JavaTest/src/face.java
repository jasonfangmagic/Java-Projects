
public class face implements interfaces{
    private int gear;
    private int speed;

    public void changegear(int gear) {
        this.gear = gear;
    }
    public  void speedup(int change){
        this.speed += change;

    }
    public void slowdown(int change){
        this.speed -= change;
    }

    public  void  display() {
        System.out.println("I am a car, going" + this.speed +" km/h and I am in gear " + this.gear);
    }
}
