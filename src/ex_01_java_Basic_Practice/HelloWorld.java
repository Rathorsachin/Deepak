package ex_01_java_Basic_Practice;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
    }

    public static class In_De_Operator {
        public static void main(String[] args) {

            String age_string = args[0];
            String a1 = args[1];
            String a2 = args[2];
            String a3 = args[3];
            int age = Integer.parseInt(a3);
            System.out.println(age);
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
        }
    }
}
