package TaskProgr.T5;

public class Main {
    public static void main(String[] args) {
        String string = "[]{g}([])";
        Check check = new Check(string);
        System.out.println(check.verifyString());
    }
}
