package mb.util.async;

/**
 * Simple cancellation token implementation.
 */
public class CancelToken implements Cancelled, Cancel {
    private volatile boolean cancelled = false;

    @Override public boolean cancelled() {
        return cancelled;
    }

    @Override public void throwIfCancelled() throws InterruptedException {
        if(cancelled) {
            throw new InterruptedException();
        }
    }

    @Override public void cancel() {
        cancelled = true;
    }
}
