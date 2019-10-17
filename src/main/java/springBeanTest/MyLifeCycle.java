package springBeanTest;

import ch.qos.logback.core.spi.LifeCycle;
import org.springframework.context.LifecycleProcessor;

public class MyLifeCycle implements LifecycleProcessor {
    @Override
    public void start() {
        System.out.println("MyLifeCycle start()");
    }

    @Override
    public void stop() {
        System.out.println("MyLifeCycle stop()");

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void onRefresh() {
        System.out.println("MyLifeCycle onRefresh()");

    }

    @Override
    public void onClose() {

    }
}
