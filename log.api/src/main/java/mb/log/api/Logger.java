package mb.log.api;

import javax.annotation.Nullable;

public interface Logger {
    void trace(String msg, @Nullable Throwable t);

    boolean traceEnabled();

    default void trace(String msg) {
        trace(msg, (Throwable) null);
    }

    default void trace(String format, Object... args) {
        if(traceEnabled()) {
            final String msg = formatter().format(format, args);
            trace(msg);
        }
    }

    default void trace(String format, Throwable cause, Object... args) {
        if(traceEnabled()) {
            final String msg = formatter().format(format, cause, args);
            trace(msg, cause);
        }
    }


    void debug(String msg, @Nullable Throwable t);

    boolean debugEnabled();

    default void debug(String msg) {
        debug(msg, (Throwable) null);
    }

    default void debug(String format, Object... args) {
        if(debugEnabled()) {
            final String msg = formatter().format(format, args);
            debug(msg);
        }
    }

    default void debug(String format, Throwable cause, Object... args) {
        if(debugEnabled()) {
            final String msg = formatter().format(format, cause, args);
            debug(msg, cause);
        }
    }


    void info(String msg, @Nullable Throwable t);

    boolean infoEnabled();

    default void info(String msg) {
        info(msg, (Throwable) null);
    }

    default void info(String format, Object... args) {
        if(infoEnabled()) {
            final String msg = formatter().format(format, args);
            info(msg);
        }
    }

    default void info(String format, Throwable cause, Object... args) {
        if(infoEnabled()) {
            final String msg = formatter().format(format, args);
            info(msg, cause);
        }
    }


    void warn(String msg, @Nullable Throwable t);

    boolean warnEnabled();

    default void warn(String msg) {
        warn(msg, (Throwable) null);
    }

    default void warn(String format, Object... args) {
        if(warnEnabled()) {
            final String msg = formatter().format(format, args);
            warn(msg);
        }
    }

    default void warn(String format, Throwable cause, Object... args) {
        if(warnEnabled()) {
            final String msg = formatter().format(format, args);
            warn(msg, cause);
        }
    }


    void error(String msg, @Nullable Throwable t);

    boolean errorEnabled();

    default void error(String msg) {
        error(msg, (Throwable) null);
    }

    default void error(String format, Object... args) {
        if(errorEnabled()) {
            final String msg = formatter().format(format, args);
            error(msg);
        }
    }

    default void error(String format, Throwable cause, Object... args) {
        if(errorEnabled()) {
            final String msg = formatter().format(format, args);
            error(msg, cause);
        }
    }


    default void log(Level level, String msg) {
        log(level, msg, (Throwable) null);
    }

    default void log(Level level, String msg, @Nullable Throwable cause) {
        switch(level) {
            case Trace:
                trace(msg, cause);
                break;
            case Debug:
                debug(msg, cause);
                break;
            case Info:
                info(msg, cause);
                break;
            case Warn:
                warn(msg, cause);
                break;
            case Error:
                error(msg, cause);
                break;
            default:
                throw new IllegalStateException("Level " + level + " is not recognized.");
        }
    }

    default void log(Level level, String format, Object... args) {
        if(enabled(level)) {
            final String msg = formatter().format(format, args);
            log(level, msg);
        }
    }

    default void log(Level level, String format, Throwable cause, Object... args) {
        if(enabled(level)) {
            final String msg = formatter().format(format, args);
            log(level, msg, cause);
        }
    }

    default boolean enabled(Level level) {
        switch(level) {
            case Trace:
                return traceEnabled();
            case Debug:
                return debugEnabled();
            case Info:
                return infoEnabled();
            case Warn:
                return warnEnabled();
            case Error:
                return errorEnabled();
            default:
                throw new IllegalStateException("Level " + level + " is not recognized.");
        }
    }


    Formatter formatter();
}
