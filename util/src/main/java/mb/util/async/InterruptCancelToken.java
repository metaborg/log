package mb.util.async;

/**
 * Thread interrupt cancellation token implementation.
 */
public class InterruptCancelToken implements Cancelled, Cancel {
    private final Thread thread;


    public InterruptCancelToken(Thread thread) {
        this.thread = thread;
    }

    public InterruptCancelToken() {
        this(Thread.currentThread());
    }


    @Override public boolean cancelled() {
        return thread.isInterrupted();
    }

    @Override public void throwIfCancelled() throws InterruptedException {
        if(cancelled()) {
            throw new InterruptedException();
        }
    }

    @Override public void cancel() {
        thread.interrupt();
    }
}
