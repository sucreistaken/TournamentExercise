public class Basketball extends Player {
    private int height;

    public Basketball(String name, int age, String position,int height) {
        super(name, age, position);
        this.height= height;
    }

    @Override
    public void play() {
        System.out.println("Player plays as a" + getPosition());
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
    public String toString(){
        return  "Basketball";
    }

    @Override
    public boolean canKick() {
        return false;
    }
}
