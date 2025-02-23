package org.khnure.lect06bcollectionextended.ex7customthreadsafe;

class SharedResource {
    private volatile boolean active = true;

    public void deactivate() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }
}

public class Main6 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new Thread(() -> {
            while (resource.isActive()) {
                // perform operations
            }
            System.out.println("Thread finished execution as resource was deactivated.");
        }).start();

        // Simulated time delay for demonstration.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        resource.deactivate();
    }
}
// Використання volatile для безпечного обміну даними між потоками.