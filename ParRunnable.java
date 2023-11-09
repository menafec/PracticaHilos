class ParRunnable implements Runnable {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Hilo Par: " + i);
        }
    }
}

class ImparRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Hilo Impar: " + i);
        }
    }
}
