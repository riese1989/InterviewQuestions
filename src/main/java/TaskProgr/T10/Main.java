package TaskProgr.T10;

public class Main {
    public static void main(String[] args) {
        SimplyList simplyList = new SimplyList();
        for (int i = 0; i < 3; i++)    {
            simplyList.add(new Elem(Integer.valueOf(i)));
        }
        simplyList.reverse();
        System.out.println();
    }
}
