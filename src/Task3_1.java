public class Task3_1 {
    public static void main(String[] args) {
        int cometCycle = 79;
        int currentYear = 2022;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (int i = cometCycle; i < afterYear; i += cometCycle) {
            if (i > beforeYear) {
                System.out.println(i);
            }
        }
    }
}
