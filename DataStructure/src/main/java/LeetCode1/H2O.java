package LeetCode1;

import java.util.concurrent.Semaphore;

/**
 * @author 吃西瓜的通酱
 * @createTime 2022-04-12 19:30
 */
class H2O {

    public H2O() {

    }
    private Semaphore o = new Semaphore(2);
    private Semaphore h = new Semaphore(0);
    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h.release(1);
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        o.acquire(1);
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        h.release(1);
    }
}
