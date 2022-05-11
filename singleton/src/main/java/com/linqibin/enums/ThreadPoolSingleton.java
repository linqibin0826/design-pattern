package com.linqibin.enums;

import java.util.concurrent.*;

/**
 * 单例模式 实现线程池单例
 * @author lqb
 * @date 2022/5/11
 */
public enum ThreadPoolSingleton {

    /**
     * 单例
     */
    INSTANCE;

    private final ExecutorService es;

    ThreadPoolSingleton() {
        int processors = Runtime.getRuntime().availableProcessors();
        es = new ThreadPoolExecutor(processors / 2, processors + 1, 60,
                TimeUnit.SECONDS, new LinkedBlockingDeque<>(100), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public ExecutorService getInstance() {
        return es;
    }

    public void execute(Runnable runnable) {
        getInstance().execute(runnable);
    }

}
