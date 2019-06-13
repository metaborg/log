package mb.log.noop;

import mb.log.api.Logger;
import mb.log.api.LoggerFactory;

public class NoopLoggerFactory implements LoggerFactory {
    @Override public Logger create(String name) {
        return NoopLogger.instance;
    }

    @Override public Logger create(Class<?> clazz) {
        return NoopLogger.instance;
    }
}
