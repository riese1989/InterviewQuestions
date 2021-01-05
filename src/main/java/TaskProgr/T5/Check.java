package TaskProgr.T5;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class Check {
    private final String string;

    /**
     * Функция проверки строк
     * @return результат проверки
     */
    public boolean verifyString()   {
        return isEmpty() || (checkPosClosedBracket() && checkCrossingRange());
    }

    /**
     * Проверяем пустая ли строка
     * @return если пустая, то true
     */
    private boolean isEmpty() {
        if (string.equals("")) {
            return true;
        }
        return false;
    }

    /**
     * Проверяем, что закрывающие скобки справа от открывающей
     * @return true если ок
     */

    private boolean checkPosClosedBracket() {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentSymb = chars[i];
            char chClosed = getClosedBracket(currentSymb);
            if (chClosed != (char) 0) {
                if (countSymb(currentSymb) != countSymb(chClosed) || string.indexOf(chClosed, i) == 0) {
                    return false;
                }
            } else {
                char chOpened = getOpenedBracket(currentSymb);
                if (chOpened != (char) 0) {
                    if (countSymb(currentSymb) != countSymb(chOpened) || string.indexOf(chOpened) > i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Ищем число символов в строке
     * @param ch нужный символ
     * @return число
     */

    private int countSymb(char ch) {
        int count = 0;
        for (char symb : string.toCharArray()) {
            if (symb == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * Проверяем непересечение диапозонов
     * @return true, если ок
     */

    private boolean checkCrossingRange() {
        HashMap<Integer, Integer> crosses = findCrosses();
        for(Map.Entry<Integer, Integer> map : crosses.entrySet()) {
            for(Map.Entry<Integer, Integer> map2 : crosses.entrySet())    {
                if (map == map2)    {
                    continue;
                }
                if (map.getKey() <= map2.getKey() &&
                        map2.getKey() <= map.getValue() &&
                        map2.getValue() >= map.getValue())  {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Ищем диапозоны между закрывающей и открывающей скобками
     * @return HashMap из диапозонов
     */
    private HashMap<Integer, Integer> findCrosses() {
        HashMap<Integer, Integer> crosses = new HashMap<>();
        char[] chars = string.toCharArray();
        for (int startCrossing = 0; startCrossing < chars.length; startCrossing++) {
            int endCrossing, nextThisSymbol;
            endCrossing = string.indexOf(getClosedBracket(chars[startCrossing]), startCrossing);
            nextThisSymbol = string.indexOf(chars[startCrossing], startCrossing + 1);
            while (nextThisSymbol > startCrossing && nextThisSymbol < endCrossing)  {
                nextThisSymbol = string.indexOf(chars[startCrossing], nextThisSymbol + 1);
            }
            crosses.put(startCrossing, endCrossing);
        }
        return crosses;
    }

    /**
     * Получаем закрывающую скобку
     * @param ch открывающая скобка
     * @return закрывающая
     */

    private char getClosedBracket(char ch) {
        switch (ch) {
            case '[': {
                return ']';
            }
            case '(': {
                return ')';
            }
            case '{': {
                return '}';
            }
            default: {
                return (char) 0;
            }
        }
    }

    /**
     * Получаем открывающую скобку
     * @param ch закрывающую скобка
     * @return открывающая
     */

    private char getOpenedBracket (char ch) {
        switch (ch) {
            case ']': {
                return '[';
            }
            case ')': {
                return '(';
            }
            case '}': {
                return '{';
            }
            default: {
                return (char) 0;
            }
        }
    }
}
