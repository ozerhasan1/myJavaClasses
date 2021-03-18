public class Main {

    public static void main(String[] args) {

        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[4]);
        } catch (StringIndexOutOfBoundsException expection){
            System.out.println(expection);
        }catch (ArrayIndexOutOfBoundsException expection){
            System.out.println(expection);
        }catch (Exception expection) {
            System.out.println("loglandı"+ expection);
        }
        finally {
            System.out.println("Her türlü varım");
        }


    }
}
