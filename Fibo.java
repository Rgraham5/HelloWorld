public class Fibo {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}

    int firstArg;if(args.length>0)
    {
        try {
            firstArg = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Argument" + args[0] + " must be an integer.");
            System.exit(1);
        }
    }
