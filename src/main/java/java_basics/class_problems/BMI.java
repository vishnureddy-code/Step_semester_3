package src.main.java.java_basics.class_problems;

public class BMI {

    static String getBmiStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        double[] height = {1.75, 1.60};
        double[] weight = {70, 90};

        for (int i = 0; i < height.length; i++) {

            double bmi = weight[i] / (height[i] * height[i]);

            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi);
            System.out.println("Status: " + getBmiStatus(bmi));
            System.out.println();
        }
    }
}
