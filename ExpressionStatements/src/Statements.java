public class Statements {

    public static void main(String[] args) {
        // what parts are expressions?

        int variable = 50;
        // statements: int variable = 50;

        variable++;
        variable--;
        // statements: variable++;
        // statements: variable--;

        System.out.println(variable);
        // statements: System.out.println(variable);

        if (variable == 0) {
            System.out.println("variable is 0");
        }
        /* if statement: if (variable == 0)
           if statement code block: if (variable == 0) {
            System.out.println("variable is 0");
        }
        */
    }
}