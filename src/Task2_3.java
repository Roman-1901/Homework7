public class Task2_3 {
    public static void main(String[] args) {
        double sum = 15000;
        int year = 9;
        double rate = 1.07;
        for (int month = 1; month <= year*12; month++) {
            sum *= rate;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накопления " + String.format("%.2f", sum));
            }
        }
    }
}
