package eye.lol;

public class Eye {

    private static float eyesize;
    private static String eyeside;
    private static String eyecolor;
    public Eye(String eyeside, String eyecolor, float eyesize) {
        this.eyeside = eyeside;
        this.eyecolor = eyecolor;
        this.eyesize = eyesize;
    }

    public static Eye createEye() {
        return new Eye(eyeside, eyecolor, eyesize);
    }

}
