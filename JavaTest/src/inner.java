public class inner {
    private class innerclass{
        public void display() {
            System.out.println("This is an inner class");
        }
    }
    public void inner(){
        innerclass in = new innerclass();
        in.display();
    }
}
