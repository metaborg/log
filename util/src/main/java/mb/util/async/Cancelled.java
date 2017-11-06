package mb.util.async;

/**
 * Interface for checking if an operation has been cancelled.
 */
public interface Cancelled {
    /**
     * @return If cancellation has been requested.
     */
    boolean cancelled();

    /**
     * @throws InterruptedException When cancellation has been requested.
     */
    void throwIfCancelled() throws InterruptedException;
}
