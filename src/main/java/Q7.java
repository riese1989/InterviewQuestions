import java.util.Collection;
import java.util.List;

//Какая коллекция лучше? TreeSet с сортировкой Comparator https://metanit.com/java/tutorial/5.6.php
public class Q7 {
    public interface Category {
        Long getId();
        String getName();
    }

    public interface Product {
        Long getId();
        String getName();
        List<Category> getCategories();
    }

    /**
     * Метод вызывается 1 раз
     */
    public void init(List<Product> products, List<Category> categories) {
        // TODO: реализовать
    }

    /**
     * Проверяет принадлежность товара к категории
     * @param productId идентификатор товара
     * @param categoryId идентификатор категории
     * @return {@code true} если товар принадлежит к категории, в остальных случаях {@code false}
     */
    public boolean isProductInCategory(Long productId, Long categoryId) {
        // TODO: реализовать
    }

    /**
     * Возвращает список товаров по категории. Товары должны быть отсортированы по идентификатору от меньшему к большему
     * @param categoryId идентификатор категории
     * @return список товаров, принадлежащих к категории или пустой список, если к категории не принадлежит ни один товар
     */
    public Collection<Product> getProductsByCategory(Long categoryId) {
        // TODO: реализовать
    }

}
