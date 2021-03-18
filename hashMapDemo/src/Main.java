import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap <String,String> sozluk = new HashMap<String, String>();
        sozluk.put("book","kitap");
        sozluk.put("pencil","kalem");
        sozluk.put("table","masa");

        System.out.println(sozluk.size());
        for (String item : sozluk.keySet()){
            System.out.println(item);
        }



        sozluk.clear();
        sozluk.remove("table");
        System.out.println(sozluk.get("table"));

    }
}
