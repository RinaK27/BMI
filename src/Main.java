public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 170;
        float weight = 55F;
        float BMI = service.calculate(height, weight);
        System.out.println(BMI);
    }
}