public class Product {
public Product (int id,String name, String description,double price, int amount) {
System.out.println("yapıcı blok çalıştı");
}
        String name;
        private int id;
        String description;
        double price;
        int amount;
        private String kod;

        public int getId () {
            return id;
        }

        public void setId ( int id){

            this.id = id;
        }


        public String getKod () {
            return this.name.substring(0, 1) + id;
        }
    }














