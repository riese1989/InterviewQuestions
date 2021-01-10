package TaskProgr.T9;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        System.out.println(add(a, b));
    }

    public static int add(int a, int b)	{
        if (b == 0) return a;
        int sum = a ^ b;			// добавляем без переноса
        int carry = (a & b) << 1;	// перенос без суммирования
        return add(sum, carry);		// рекурсия
    }
}
