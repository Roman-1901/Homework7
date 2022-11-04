public class Task2_2 {
    public static void main(String[] args) {
        double sum = 15000;
        double finishSum = 12_000_000;
        double rate = 1.07;
        int month = 0;
        while (sum < finishSum) {
            sum *= rate;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопления " + String.format("%.2f", sum));
            }
        }
    }
}
