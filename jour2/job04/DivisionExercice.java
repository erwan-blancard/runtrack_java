public class DivisionExercice {

    public static void main(String[] args) throws DivisionParZeroException {
        double num1 = 0;
        double num2 = 0;
        if (args != null && args.length == 2) {
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Arguments invalides.");
                System.exit(1);
            }
        } else {
            System.out.println("Arguments invalides.");
            System.exit(1);
        }

        if (num2 == 0) { throw new DivisionParZeroException(); }

        System.out.println("Résultat: "+(num1/num2));
    }

}