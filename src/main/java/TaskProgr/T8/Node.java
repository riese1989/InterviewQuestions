package TaskProgr.T8;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
public class Node {
    private static int currentKey = 0;
    private Integer value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }
}
