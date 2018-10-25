package mb.log.slf4j;

import mb.log.api.Logger;
import mb.log.api.LoggerFactory;

public class SLF4JStaticLoggerFactory implements LoggerFactory {
    @Override public Logger create(String name) {
        return new SLF4JLogger(org.slf4j.LoggerFactory.getLogger(name));
    }

    @Override public Logger create(Class<?> clazz) {
        return new SLF4JLogger(org.slf4j.LoggerFactory.getLogger(clazz));
    }
}
