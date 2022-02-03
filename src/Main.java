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

    public static void out(Student std) {
        String className = std.getClass().getName();
        String hashCodeHex = Integer.toHexString(std.hashCode());
        out(className + "@" + hashCodeHex);
    }

    public static void main(String[] args) {
        Student std = new Student();
        out(std);
        System.out.println(std);

    }
}
