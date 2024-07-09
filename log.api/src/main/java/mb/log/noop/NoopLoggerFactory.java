package mb.log.noop;

import mb.log.api.LoggerFactory;

public class NoopLoggerFactory implements LoggerFactory {
    public static final NoopLoggerFactory instance = new NoopLoggerFactory();

    private NoopLoggerFactory() {}

    @Override public NoopLogger create(String name) {
        return NoopLogger.instance;
    }

    @Override public NoopLogger create(Class<?> clazz) {
        return NoopLogger.instance;
    }
}
