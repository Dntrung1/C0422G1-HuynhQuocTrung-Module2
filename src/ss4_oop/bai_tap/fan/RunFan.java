package ss4_oop.bai_tap.fan;

public class RunFan {
    public static void main(String[] args) {
       Fan fan1 = new Fan();
       fan1.setSpeed(fan1.FAST);
       fan1.setRadius(10);
       fan1.setColor("yellow");
       fan1.setOn(true);
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan1.setSpeed(fan2.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan2);
    }
}
