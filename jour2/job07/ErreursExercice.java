public class ErreursExercice {

    public static void main(String[] args) {
        try {
            diviser(args);
        } catch (NullPointerException e) {
            System.out.println("Erreur: NullPointerException.");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur: ArrayIndexOutOfBoundsException.");
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println("Erreur: ArithmeticException.");
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Arguments invalides.");
            System.exit(1);
        }
    }

    public static void diviser(String[] args) throws NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
        if (args == null || args.length == 0) { throw new NullPointerException(); }
        if (args.length < 2) { throw new ArrayIndexOutOfBoundsException(); }

        if (args.length > 2) {
            System.out.println("Trops d'arguments entrés.");
            System.exit(1);
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        if (num2 == 0) { throw new ArithmeticException(); }
        System.out.println("Résultat de la division: "+(num1/num2)+".");
    }

}
