public class Q1 {
    public static void main(String[] args) {
        final Object obj1 = new Object();
        final Object obj2 = new Object();

        equalsValues(1, obj1.equals(obj2), false);
        equalsValues(2, obj1 == obj2, false);

        final String str1 = new String("string");
        final String str2 = new String("string");

        equalsValues(3, str1.equals(str2), true);
        equalsValues(4, str1 == str2, false);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1 == str2);

        final String str3 = "string";
        final String str4 = "string";
        final String str5 = "str" + "ing";

        equalsValues(5, str3.equals(str4), true);
        equalsValues(6, str3 == str4, true);
        equalsValues(7, str3 == str5, true);

//        System.out.println(str3.equals(str4));
//        System.out.println(str3 == str4);
//        System.out.println(str3 == str5);

        final Integer i1 = new Integer(1);
        final Integer i2 = new Integer(1);

        equalsValues(8, i1 == i2, false);


        final Integer i3 = 128;
        final Integer i4 = 128;

        equalsValues(9, i3.equals(i4), true);
        equalsValues(10, i3 == i4, false);
    }

    private static void equalsValues (int numTask, boolean ask, boolean answer)   {
        boolean result = ask == answer;
        System.out.println(numTask + " " + result);
    }
}
