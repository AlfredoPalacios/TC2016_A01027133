package Actividades.A3_2_Latencia;
import java.util.Random;

/**
 * Latency
 */

public class Latency {
    public static void simulateLatency(int initialValue, int finalValue) {
        Random r = new Random();
        int time = r.nextInt(finalValue-initialValue)+initialValue;
        long start = System.currentTimeMillis();
        while (true) {
            long current = System.currentTimeMillis();
            if(current-start >= time*1000)
                break;
        }
    }
    public static void main(String[] args) {
        Latency.simulateLatency(2, 15);
    }
}