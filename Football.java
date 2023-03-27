public class Football extends Player {
        private int number;
    public Football(String name, int age, String position,int number) {
        super(name, age, position);
        this.number= number;
    }
    @Override
    public void play() {
        System.out.println(getName() + "Playing as a " + getPosition());
    }

    @Override
    public boolean canRun() {
        return true;
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public boolean canJump() {
        return true;
    }

    @Override
    public boolean canKick() {
        return true;
    }
}
