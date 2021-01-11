package TaskProgr.T10;

public class SimplyList {
    private Elem[] array = new Elem[0];

    public void add (Elem elem)    {
        array = arrayAddNullElement();
        array[array.length - 1] = elem;
        if (array.length != 1) {
            array[array.length - 2].setNext(elem);
        }
    }

    private Elem[] arrayAddNullElement()   {
        Elem[] newArray = new Elem[array.length + 1];
        for (int i = 0; i < array.length; i++)  {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void reverse()   {
        int arrayLength = array.length;
        Elem[] newArray = new Elem[arrayLength];
        for (int i = 0, j = arrayLength-1;
             i < arrayLength && j >=0 ; i++, j--)   {
            newArray[i] = array[j];
            if (j != 0) {
                newArray[i].setNext(array[j-1]);
            }
        }
        array = newArray;

    }
}
