public class Main {

    public static void main(String[] args) {
	customerManager customerManager = new customerManager();
	customerManager.dataBaseManager = new MysqlDataBaseManager();
	customerManager.getcustomers();
    }
}
