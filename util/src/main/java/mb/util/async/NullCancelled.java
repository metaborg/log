package mb.util.async;

/**
 * Cancelled implementation that never cancels.
 */
public class NullCancelled implements Cancelled {
    @Override public boolean cancelled() {
        return false;
    }

    @Override public void throwIfCancelled() throws InterruptedException {

    }
}
