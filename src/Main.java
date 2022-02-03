public class Main {

    public static void out(String str) {
        System.out.println(str);
    }

    public static void out(int i) {
        System.out.println(i);
    }

    public static void out(boolean b) {
        System.out.println(b);
    }

    public static void out(Integer ii) {
        out(ii.equals("17"));
        System.out.println(ii);
    }

    public static void main(String[] args) {
	    // write your code here
        //System.out.println("hej");
        out("hejjj");
        out(3);
        Integer i1 = Integer.valueOf(17);
        //out(i1.hashCode());
        i1++;
        //out(i1.hashCode());
        out(i1);
        //out()

        Integer iii = 1;
        int n = 1;
        while (n<0) {
            try {
                iii = iii * 1000;
                int y = iii / 0;
            } catch (Exception e) {
                out("fejl e=" + e.getMessage());
            }
            out(iii);
            n++;
        }
        for (int i = 26350; i < 26450; i++) {
            out("" + (char)i + " har ascii=" + i);
        }

        out("" + (char)65021);
        String jord = "الرض";
        //out('ض');
        out('木');
        //﷽
        //out('a');
    }
}
