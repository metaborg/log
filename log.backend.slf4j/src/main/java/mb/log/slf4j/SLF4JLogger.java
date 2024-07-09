package mb.log.slf4j;

import mb.log.api.Logger;

import java.util.Arrays;

public class SLF4JLogger implements Logger {
    private final org.slf4j.Logger logger;


    public SLF4JLogger(org.slf4j.Logger logger) {
        this.logger = logger;
    }


    @Override public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override public void trace(String msg) {
        logger.trace(msg);
    }

    @Override public void trace(String msg, Throwable cause) {
        logger.trace(msg, cause);
    }

    @Override public void trace(String format, Object... args) {
        logger.trace(format, args);
    }

    @Override public void trace(String format, Throwable cause, Object... args) {
        final Object[] argsWithException = Arrays.copyOf(args, args.length + 1);
        argsWithException[args.length] = cause;
        logger.trace(format, argsWithException);
    }


    @Override public boolean isDebugEnabled() {
        return logger.isTraceEnabled();
    }

    @Override public void debug(String msg) {
        logger.debug(msg);
    }

    @Override public void debug(String msg, Throwable cause) {
        logger.debug(msg, cause);
    }

    @Override public void debug(String format, Object... args) {
        logger.debug(format, args);
    }

    @Override public void debug(String format, Throwable cause, Object... args) {
        final Object[] argsWithException = Arrays.copyOf(args, args.length + 1);
        argsWithException[args.length] = cause;
        logger.debug(format, argsWithException);
    }


    @Override public boolean isInfoEnabled() {
        return logger.isTraceEnabled();
    }

    @Override public void info(String msg) {
        logger.info(msg);
    }

    @Override public void info(String msg, Throwable cause) {
        logger.info(msg, cause);
    }

    @Override public void info(String format, Object... args) {
        logger.info(format, args);
    }

    @Override public void info(String format, Throwable cause, Object... args) {
        final Object[] argsWithException = Arrays.copyOf(args, args.length + 1);
        argsWithException[args.length] = cause;
        logger.info(format, argsWithException);
    }


    @Override public boolean isWarnEnabled() {
        return logger.isTraceEnabled();
    }

    @Override public void warn(String msg) {
        logger.warn(msg);
    }

    @Override public void warn(String msg, Throwable cause) {
        logger.warn(msg, cause);
    }

    @Override public void warn(String format, Object... args) {
        logger.warn(format, args);
    }

    @Override public void warn(String format, Throwable cause, Object... args) {
        final Object[] argsWithException = Arrays.copyOf(args, args.length + 1);
        argsWithException[args.length] = cause;
        logger.warn(format, argsWithException);
    }


    @Override public boolean isErrorEnabled() {
        return logger.isTraceEnabled();
    }

    @Override public void error(String msg) {
        logger.error(msg);
    }

    @Override public void error(String msg, Throwable cause) {
        logger.error(msg, cause);
    }

    @Override public void error(String format, Object... args) {
        logger.error(format, args);
    }

    @Override public void error(String format, Throwable cause, Object... args) {
        final Object[] argsWithException = Arrays.copyOf(args, args.length + 1);
        argsWithException[args.length] = cause;
        logger.error(format, argsWithException);
    }
}
