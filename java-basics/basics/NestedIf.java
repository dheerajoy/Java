public class NestedIf {
    public static void main(String[] args) {

        boolean isStudent = false;
        boolean hasCoupan = false;
        double price = 349.99;

        if (isStudent) {
            if (hasCoupan) {
                System.out.println("you get a student discount of 10% and coupan discount of 20%");
                price *= 0.7;
            }else{
                System.out.println("You get a Student Discount of 10%");
                price = price * 0.9;
            }
        }else{
            if (hasCoupan) {
                System.out.println("you get a coupan discount of 20%");
                price *= 0.8;
            }else{
                price = price * 1;
            }
        }

        System.out.printf("The price of the ticket is $%.2f",price);

    }    
}
