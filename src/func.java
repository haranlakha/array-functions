import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class func {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Array 1 Size:");
        int numArray1Size = scnr.nextInt();

        System.out.println("Array 2 Size:");
        int numArray2Size = scnr.nextInt();

        if(numArray1Size == 0 || numArray2Size == 0){
            System.err.println("Array size must be at least 1!");
            System.exit(0);
        }
        if(numArray1Size != numArray2Size){
            System.err.println("Array sizes not even!");
            System.exit(0);
        }

        System.out.println("Enter max boundary for Array:");
        int boundary = scnr.nextInt();

        if(boundary < 1){
            System.err.println("Boundary must be at least 1!");
            System.exit(0);
        }

        double[] numArray1 = new double[numArray1Size];
        double[] numArray2 = new double[numArray2Size];

        fillArray(numArray1, numArray1Size, boundary);
        fillArray(numArray2, numArray2Size, boundary);

        System.out.println("ARRAY 1:");
        System.out.println(Arrays.toString(numArray1));
        System.out.println("\nARRAY 2:");
        System.out.println(Arrays.toString(numArray2));

        System.out.println(Arrays.toString(func.arrayAdd(numArray1, numArray2)));
        System.out.println(Arrays.toString(func.arraySubtract(numArray1, numArray2)));
        System.out.println( Arrays.toString(func.arrayMultiply(numArray1, numArray2)));
        System.out.println(Arrays.toString(func.arrayDivide(numArray1, numArray2)));
    }

    private static void fillArray(double[] array, int size, int bound) {
        Random generator = new Random();
        for(int i = 0; i < size; i++){
            int random = generator.nextInt(bound);
            array[i] = random;
        }
    }

    private static double[] arrayAdd(double[] array1, double[] array2) {
        System.out.print("\nADDITION: ");
        double[] sum = new double[array1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = array1[i] + array2[i];
            }
        return sum;
    }

    private static double[] arraySubtract(double[] array1, double[] array2){
        System.out.print("SUBTRACTION: ");
        double[] sum = new double[array1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = array1[i] - array2[i];
            }
        return sum;
    }

    private static double[] arrayMultiply(double[] array1, double[] array2){
        System.out.print("MULTIPLICATION: ");
        double[] sum = new double[array1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = array1[i] * array2[i];
            }
        return sum;
    }

    private static double[] arrayDivide(double[] array1, double[] array2){
        System.out.print("DIVISION: ");
        double[] sum = new double[array1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = array1[i] / array2[i];
            }
        return sum;
    }


}
