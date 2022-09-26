public class Main {
    public static void main(String[] args) {
        Tank jastTank = new Tank(0, 0, 100);
        Tank anywareTank = new Tank(10, 10, 100);
        Tank customTank = new Tank(20, 30, 200);
        jastTank.goForward(100);
        jastTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
