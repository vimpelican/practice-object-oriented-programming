package lecture_20230303;

public class ComputeArea {
    /* Main methon */
    public static void main(String[] args){
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        // Compute Area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius "
        + radius + " is " + area);
    }
}
