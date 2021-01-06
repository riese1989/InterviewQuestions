package TaskProgr.T6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count = 6;
        String[] strings = new String[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                char symbol;
                if (j % 2 == 0) {
                    symbol = (char) 32;
                }
                else    {
                    symbol = '*';
                }
                if (j == 0) {
                    strings[i] = String.valueOf(symbol);
                }   else {
                    strings[i] += symbol;
                }
            }
            if (i != 0) {
                int lastIndex = strings[i-1].lastIndexOf(' ');
                String newString = strings[i-1].substring(0,lastIndex) + "*" + strings[i-1].substring(lastIndex+1);
                strings[i-1] = newString;
            }
        }
      for (String string : strings) {
          System.out.println(string);
      }
    }
}
