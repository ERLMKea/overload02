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

    public static void out(Class cls) {
        System.out.println(cls);
        System.out.println(cls.getClass());
        //var obj = cls.getClass();
        Class class1 = cls.getClass();
        //System.out.println(obj);
        //var obj = class1.getClass()
    }

    public static void out(Student std) {
        String className = std.getClass().getName();
        String hashCodeHex = Integer.toHexString(std.hashCode());
        out(className + "@" + hashCodeHex);
    }

    public static void out(String ...str) {
        var obj = str;

        System.out.println(str);
    }

    public static void out(Object ...obj) {
        Object[] objarr = obj;
        for (Object o: objarr) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Student std = new Student();
        //out(std);
        System.out.println(std);

        //out(std.getClass());
        //ystem.out.println("hej", "kurt");

        out("hej", "kurt");

        out(std, "hej", 3.3, std.getClass());
    }
}
