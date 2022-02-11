package powerpackage;

public class powerfinder {
    public static int OF(int base, int power) {
        int result = 1;
        for (int iter = 0; iter<power; iter++) {
            result *= base;
        }
        return result;
    }
}
