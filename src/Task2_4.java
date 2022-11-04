public class Task2_4 {
    public static void main(String[] args) {
        int firstFriday = 3;
        if (firstFriday >= 1 && firstFriday <= 7) {
            for (int friday = firstFriday; friday <= 31; friday += 7) {
                System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
            }
        } else {
            System.out.println("Первая пятница должна быть от 1 до 7");
        }
    }
}

