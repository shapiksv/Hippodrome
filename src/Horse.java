public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    public void move(){
         double dis = Math.random();
         distance += dis * speed;

    }
    public void print(){
        int f = (int) distance;
        String s = "";
        for (int i = 0; i < f; i++) {
            s = s + ".";
        }
        System.out.println(s + name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
