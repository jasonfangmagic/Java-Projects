 public class inheritance extends classes {

    private int food;
    public inheritance (String name, int age, int food){
        super(name, age);
        this.food = food;
    }

    public void speak(){
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }
}
