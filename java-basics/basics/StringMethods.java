public class StringMethods {
    public static void main(String[] args) {
        String name = "dheeraj kumar";

        int length = name.length();

        char letter = name.charAt(0);

        int index = name.indexOf("h");

        int lastIndexOf = name.lastIndexOf("e");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim(); // removes blank spaces from start and end
        // name = name.replace("e","o");

        System.out.println(lastIndexOf);
        System.out.println(index);
        System.out.println(name);
        System.out.println(letter);
        System.out.println(length);

        /*
         * if(name.isEmpty()){
         * System.out.println("Your name is empy");
         * }else{
         * System.out.println("hello " + name);
         * }
         * 
         * 
         * if(name.contains(" ")){
         * System.out.println("name contains empty space");
         * }else{
         * System.out.println("your name DOSET contain blank");
         * }
         */

        if (name.equals("dheeraj")) {
            System.out.println("name cannot be password");
        } else {
            System.out.println("your name is  " + name);
        }

    }
}
