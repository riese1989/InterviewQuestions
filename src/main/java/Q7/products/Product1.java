package Q7.products;

import Q7.interfaces.Category;
import Q7.interfaces.Product;

import java.util.*;

public class Product1 implements Product, Comparable<Product1> {
    private Long id;
    private String name;
    private List<Category> categories = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<Category> getCategories() {
        return null;
    }

    @Override
    public int compareTo(Product1 o) {
        return id.compareTo(o.getId());
    }
}
