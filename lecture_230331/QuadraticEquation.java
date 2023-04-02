package lecture_230331;

public class QuadraticEquation {

    // 3개의 계수를 나타냄
    private double a;
    private double b;
    private double c;

    private double discriminant;
    private double root1;
    private double root2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        discriminant = b * b - 4 * a * c;
        return discriminant;
    }

    double getRoot1() {
        root1 = (1/(2*a)) * (-b + Math.sqrt(discriminant));
        return root1;
    }

    double getRoot2() {
        root2 = (1/(2*a)) * (-b - Math.sqrt(discriminant));
        return root2;
    }

    // 3 getter methods for a, b and c
    double getterOfA() {
        return this.a;
    }

    double getterOfB() {
        return this.b;
    }

    double getterOfC() {
        return this.c;
    }
}
