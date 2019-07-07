package javaSample.lock;

import java.util.ArrayList;
import java.util.List;

public class WaitAndNotify {
    private List<Object> cls = new ArrayList<>();

    synchronized void apply(Object from, Object to) {
        while (!cls.contains(from) || !cls.contains(to)) {
            try {
                this.wait();
            } catch (Exception e) {

            }
        }
        cls.add(from);
        cls.add(to);
    }

    synchronized void free(Object from, Object to) {
        cls.remove(from);
        cls.remove(to);
        notify();
    }
}
