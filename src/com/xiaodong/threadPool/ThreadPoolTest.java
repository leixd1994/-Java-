package com.xiaodong.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    static public void main(String []args)
    {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Runnable r = ()->{
            for (int i = 0;i<100;i++)
            {
                System.out.println(Thread.currentThread().getName()+"i="+i);
            }
        };
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.submit(r);
        pool.shutdown();
    }
}
