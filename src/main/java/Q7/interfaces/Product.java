package Q7.interfaces;

import java.util.List;

public interface Product {
    Long getId();
    String getName();
    List<Category> getCategories();
}
