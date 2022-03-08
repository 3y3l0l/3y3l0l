package eye.lol;

public abstract class EyelolAbstract {

    public static void createEyelol(Eye eye) {
        System.out.println("Creating eyelol...");
        System.out.println("Eyelol created.");
        double id = Java.random() * Java.power(10, 12);
        System.out.println("ID: " + (long) id);
    }

}
