package leetcode.array;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ShortestSubArray {
    public int shortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        LocalDate localDate = LocalDate.now();
        localDate.lengthOfMonth();
        localDate.getDayOfMonth();
        localDate.withDayOfMonth(localDate.lengthOfMonth());
        localDate.minus(new TemporalAmount() {
            @Override
            public long get(TemporalUnit unit) {
                return 0;
            }

            @Override
            public List<TemporalUnit> getUnits() {
                return null;
            }

            @Override
            public Temporal addTo(Temporal temporal) {
                return null;
            }

            @Override
            public Temporal subtractFrom(Temporal temporal) {
                return null;
            }
        });
        CountDownLatch countDownLatch = new CountDownLatch(5);
        countDownLatch.countDown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
