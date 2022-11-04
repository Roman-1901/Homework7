public class Task1_3 {
    public static void main(String[] args) {
        int count = 12_000_000;
        int birth = 17;
        int death = 8;
        int countYear = 10;
        for (int year = 1; year <= countYear; year++) {
            count += count / 1000 * (birth - death);
            System.out.println("Год " + year + ", численность населения составляет " + count);
        }
    }
}
