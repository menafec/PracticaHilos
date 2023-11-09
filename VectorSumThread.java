import java.util.Random;

public class VectorSumThread extends Thread {
    private int[] vector;
    private int sum;
    private int sumOfSquares;

    public VectorSumThread(int[] vector) {
        this.vector = vector;
        this.sum = 0;
        this.sumOfSquares = 0;
    }

    public void run() {
        for (int num : vector) {
            sum += num;
            sumOfSquares += num * num;
        }

        double media = (double) sum / vector.length;
        System.out.println("Suma de elementos: " + sum);
        System.out.println("Suma de cuadrados: " + sumOfSquares);
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {
        int[] vector1 = generarVectorAleatorio(10); // Tamaño del vector 10
        int[] vector2 = generarVectorAleatorio(15); // Tamaño del vector 15

        VectorSumThread hilo1 = new VectorSumThread(vector1);
        VectorSumThread hilo2 = new VectorSumThread(vector2);

        hilo1.start();
        hilo2.start();
    }


    public static int[] generarVectorAleatorio(int size) {
        int[] vector = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(100) + 1;
        }
        return vector;
    }
}
