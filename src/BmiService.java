public class BmiService {
    public float calculate(int height, float weight) {
        return weight * 100_00 / (height * height);
    }
}
