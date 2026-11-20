public class Q4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage : java Q4 N");
            System.exit(1);
        }

        final int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("N doit etre un entier.");
            System.exit(1);
            return;
        }

        if (n < 1) {
            System.err.println("N doit etre superieur ou egal a 1.");
            System.exit(1);
        }

        for (int ligne = n; ligne >= 1; ligne--) {
            for (int valeur = ligne; valeur >= 1; valeur--) {
                if (valeur < ligne) System.out.print(" ");
                System.out.print(valeur);
            }
            System.out.println();
        }
    }
}
