package ex_01_java_Basic_Practice;

public class Lab001_HelloWorldProgram {
    public static void main(String[] args) {
        System.out.println("This is My First program on git!!");
    }

    public static class Ex001_in_de_operater {
        public static void main(String[] args) {
            String age_string = args[0];
            int age = Integer.parseInt(age_string);
            System.out.println(age);
        }
    }
}
