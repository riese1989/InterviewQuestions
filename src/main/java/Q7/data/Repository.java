package Q7.data;

import Q7.interfaces.Category;
import Q7.interfaces.Product;

import java.util.Collection;
import java.util.List;

public class Repository {

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
        return false;
    }

    /**
     * Возвращает список товаров по категории. Товары должны быть отсортированы по идентификатору от меньшему к большему
     * @param categoryId идентификатор категории
     * @return список товаров, принадлежащих к категории или пустой список, если к категории не принадлежит ни один товар
     */
    public Collection<Product> getProductsByCategory(Long categoryId) {
        // TODO: реализовать
        return null;
    }
}
