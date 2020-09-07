import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class func {

    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insert array 1 size:");
        int array1Size = scnr.nextInt();

        System.out.println("Insert array 2 size:");
        int array2Size = scnr.nextInt();

        if(array1Size != array2Size){
            System.err.println("Arrays not even!");
            System.exit(0);
        }

        double[] numbers1 = new double[array1Size];
        double[] numbers2 = new double[array2Size];

        fillArray(numbers1, array1Size, 40);
        fillArray(numbers2, array2Size, 25);

        System.out.println("ARRAY 1:");
        arrayPrint(numbers1);
        System.out.println("\nARRAY 2:");
        arrayPrint(numbers2);

        System.out.println("\nADD " + Arrays.toString(func.arrayAdd(numbers1, numbers2)));
        System.out.println("SUBTRACT " + Arrays.toString(func.arraySubtract(numbers1, numbers2)));
        System.out.println("MULTIPLY " + Arrays.toString(func.arrayMultiply(numbers1, numbers2)));
        System.out.println("DIVIDE " + Arrays.toString(func.arrayDivide(numbers1, numbers2)));
    }

    private static void fillArray(double[] array, int size, int bound) {
        Random rng = new Random();
        for(int i = 0; i < size; i++){
            int rnd = rng.nextInt(bound);
            array[i] = rnd;
        }
    }

    private static void arrayPrint(double[] array){
        for(double i: array){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private static double[] arrayAdd(double[] arr1, double[] arr2) {
        double[] sum = new double[arr1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = arr1[i] + arr2[i];
            }
        return sum;
    }

    private static double[] arraySubtract(double[] arr1, double[] arr2){
        double[] sum = new double[arr1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = arr1[i] - arr2[i];
            }
        return sum;
    }

    private static double[] arrayMultiply(double[] arr1, double[] arr2){
        double[] sum = new double[arr1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = arr1[i] * arr2[i];
            }
        return sum;
    }

    private static double[] arrayDivide(double[] arr1, double[] arr2){
        double[] sum = new double[arr1.length];
            for(int i = 0; i < sum.length; i++){
                sum[i] = arr1[i] / arr2[i];
            }
        return sum;
    }


}
