public class Q3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage : java Q3 N");
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

        for (int i = n; i >= 1; i--) {
            if (i > 1) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }
}
