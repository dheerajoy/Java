public class LogicalOperators {
    public static void main(String[] args) {

        // && - and
        // || - or
        // ! - not

        double temp = -20;
        boolean isSunny = false;

        if (temp >= 36 && temp >= 0 && isSunny) {
            System.out.println("it is HOT outside!!");
            System.out.println("Sunny today!");
        } else if (temp <= 36 && temp >= 0 && !isSunny) {
            System.out.println("it is HOT outside!!");
            System.out.println("cloudy today!");
        } else if (temp > 30 || temp < 0) {
            System.out.println("Bad Weather outside");
        }
    }
}
