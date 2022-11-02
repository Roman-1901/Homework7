public class Task1_1 {
    public static void main(String[] args) {
        int money = 15000;
        double sum = 0;
        int finishSum = 2_459_000;
        int month = 0;
        while (sum < finishSum) {
            sum = (sum + money) * 1.01;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", sum) + " рублей");
        }

    }
}
