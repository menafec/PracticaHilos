public class MainThread{
    public static void main(String[] args) {
        ParThread hiloPar1 = new ParThread();
        ParThread hiloPar2 = new ParThread();
        ImparThread hiloImpar1 = new ImparThread();
        ImparThread hiloImpar2 = new ImparThread();

        hiloPar1.start();
        hiloPar2.start();
        hiloImpar1.start();
        hiloImpar2.start();
    }
}
