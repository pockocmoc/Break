public class Main {
    public static void main(String[] args) {

        boolean t = true;
        first: {
            second: {
            third: {
                System.out.println("Предшевствует оператору break.");
                if (t) break second; // выход из блока second
                System.out.println("Этот оператор не будет выполнятся");

            }
            System.out.println("Этот оператор не будет выполнятся ");
            }
             System.out.println("Этот оператор следует за блоком second");
        }
    }
}