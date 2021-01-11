package TaskProgr.T11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest(19, "safadf"));
        guests.add(new Guest(20, "Adsbfksfkbsfk"));
        guests.add(new Guest(8, "wertwht"));
        guests.add(new Guest(7, "Aasdddff"));
        guests.add(new Guest(99, "afasfaf"));
        guests.add(new Guest(43, "Aksdnfjksnf"));
        guests.add(new Guest(15, "Aaaaaaa"));
        for (Guest guest : bar(guests))    {
            System.out.println(guest.getName() + " " + guest.getAge());
        }
    }

    private static List<Guest> bar(List<Guest> guests)    {
        return guests.stream().filter(g -> g.getAge() > 18 && g.getName().startsWith("A")).collect(Collectors.toList());
    }
}
