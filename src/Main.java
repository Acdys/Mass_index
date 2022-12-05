public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 52;
        double height = 1.7;
        double bodyIndex = service.calculate(mass, height);

        System.out.println("Ваш иднекс массы тела: " + bodyIndex);
    }
}