package eye.lol;

public class Java extends EyelolAbstract {

    public static double random() {
        return Math.random();
    }

    public static double power(double number, double power) {
        return Math.pow(number, power);
    }

    public static void main(String[] args) {
    double random = random();
    if (random <= 0.696969696969) {
        System.out.println("eye");
    } else {
        System.out.println("lol");
    }
    new Eye("left", "brown", (float) random);
    EyelolAbstract.createEyelol(Eye.createEye());
    System.out.println("Eyelol has been created, terminating...");
  }
}
