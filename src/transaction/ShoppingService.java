package transaction;

public class ShoppingService {

    public Product shipping(SelectItem selectItem){
        Product product = new Product();
        product.colour = selectItem.colour;
        product.size = selectItem.size;
        product.type = selectItem.type;
        product.price = 20000;

        return product;

    }

}
