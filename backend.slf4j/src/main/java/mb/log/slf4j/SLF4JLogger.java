package mb.log.slf4j;

import mb.log.api.Formatter;
import mb.log.api.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class SLF4JLogger implements Logger {
    private final org.slf4j.Logger logger;


    SLF4JLogger(org.slf4j.Logger logger) {
        this.logger = logger;
    }


    @Override public void trace(String msg, @Nullable Throwable t) {
        logger.trace(msg, t);
    }

    @Override public boolean traceEnabled() {
        return logger.isTraceEnabled();
    }


    @Override public void debug(String msg, @Nullable Throwable t) {
        logger.debug(msg, t);
    }

    @Override public boolean debugEnabled() {
        return logger.isDebugEnabled();
    }


    @Override public void info(String msg, @Nullable Throwable t) {
        logger.info(msg, t);
    }

    @Override public boolean infoEnabled() {
        return logger.isInfoEnabled();
    }


    @Override public void warn(String msg, @Nullable Throwable t) {
        logger.warn(msg, t);
    }

    @Override public boolean warnEnabled() {
        return logger.isWarnEnabled();
    }


    @Override public void error(String msg, @Nullable Throwable t) {
        logger.error(msg, t);
    }

    @Override public boolean errorEnabled() {
        return logger.isErrorEnabled();
    }


    @Override public Formatter formatter() {
        return SLF4JFormatter.instance;
    }
}
