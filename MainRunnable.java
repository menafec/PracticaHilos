public class MainRunnable {
    public static void main(String[] args) {
        ParRunnable parRunnable = new ParRunnable();
        ImparRunnable imparRunnable = new ImparRunnable();

        Thread hiloPar1 = new Thread(parRunnable);
        Thread hiloPar2 = new Thread(parRunnable);
        Thread hiloImpar1 = new Thread(imparRunnable);
        Thread hiloImpar2 = new Thread(imparRunnable);

        hiloPar1.start();
        hiloPar2.start();
        hiloImpar1.start();
        hiloImpar2.start();
    }
}
