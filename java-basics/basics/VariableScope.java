public class VariableScope {

    static int x = 1; // class scope

    public static void main(String[] args) {
        // variable scope - where a variable can be accessed
        // local is preferred first

        int x = 2; // local scope
        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        // int x = 3;
        System.out.println(x);
    }
}
