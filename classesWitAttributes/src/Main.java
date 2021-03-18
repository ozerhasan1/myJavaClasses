public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Lenovo Laptop",1700,500);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
    }
}
