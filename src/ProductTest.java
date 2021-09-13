public class ProductTest {
    public static double findAveragePrice(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPriceInCents();
            total /= products.length;
        }
        return total;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Item1", 23.44),
                new Product("Item2", 50.00),
                new Product("Item3", 3.99),
                new Product("Item4", 45.70),
                new Product("Item5", 40.99)
        };
        System.out.printf("%.2f", findAveragePrice(products));
    }
}
