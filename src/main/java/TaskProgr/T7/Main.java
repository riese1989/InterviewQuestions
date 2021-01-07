package TaskProgr.T7;

public class Main {
    public static void main(String[] args) {
        for (int i = 78; i >=2; i--)    {
            System.out.println(i);
            if (i % 15 == 0)    {
                System.out.println("X5 Retail Group");
            }
            else {
                if (i % 3 == 0) {
                    System.out.println("X5");
                }
                if (i % 5 == 0) {
                    System.out.println("Retail Group");
                }
            }
        }
    }
}
