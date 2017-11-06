package mb.util.async;

/**
 * Cancellation token implementation that never cancels.
 */
public class NullCancelToken implements Cancelled, Cancel {
    @Override public boolean cancelled() {
        return false;
    }

    @Override public void throwIfCancelled() {
    }

    @Override public void cancel() {
    }
}
