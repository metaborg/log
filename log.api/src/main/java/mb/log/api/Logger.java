package mb.log.api;

public interface Logger {
    boolean isTraceEnabled();

    default void trace(String msg) {
        trace(msg, new Object[0]);
    }

    default void trace(String msg, Throwable cause) {
        trace(msg, cause, new Object[0]);
    }

    void trace(String format, Object... args);

    void trace(String format, Throwable cause, Object... args);


    boolean isDebugEnabled();

    default void debug(String msg) {
        debug(msg, new Object[0]);
    }

    default void debug(String msg, Throwable cause) {
        debug(msg, cause, new Object[0]);
    }

    void debug(String format, Object... args);

    void debug(String format, Throwable cause, Object... args);


    boolean isInfoEnabled();

    default void info(String msg) {
        info(msg, new Object[0]);
    }

    default void info(String msg, Throwable cause) {
        info(msg, cause, new Object[0]);
    }

    void info(String format, Object... args);

    void info(String format, Throwable cause, Object... args);


    boolean isWarnEnabled();

    default void warn(String msg) {
        warn(msg, new Object[0]);
    }

    default void warn(String msg, Throwable cause) {
        warn(msg, cause, new Object[0]);
    }

    void warn(String format, Object... args);

    void warn(String format, Throwable cause, Object... args);


    boolean isErrorEnabled();

    default void error(String msg) {
        error(msg, new Object[0]);
    }

    default void error(String msg, Throwable cause) {
        error(msg, cause, new Object[0]);
    }

    void error(String format, Object... args);

    void error(String format, Throwable cause, Object... args);


    default boolean isEnabled(Level level) {
        switch(level) {
            case None:
                return false;
            case Trace:
                return isTraceEnabled();
            case Debug:
                return isDebugEnabled();
            case Info:
                return isInfoEnabled();
            case Warn:
                return isWarnEnabled();
            case Error:
                return isErrorEnabled();
            default:
                throw new IllegalStateException("Level " + level + " is not recognized");
        }
    }

    default void log(Level level, String msg) {
        switch(level) {
            case None:
                break;
            case Trace:
                trace(msg);
                break;
            case Debug:
                debug(msg);
                break;
            case Info:
                info(msg);
                break;
            case Warn:
                warn(msg);
                break;
            case Error:
                error(msg);
                break;
            default:
                throw new IllegalStateException("Level " + level + " is not recognized");
        }
    }

    default void log(Level level, String msg, Throwable cause) {
        switch(level) {
            case None:
                break;
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
                throw new IllegalStateException("Level " + level + " is not recognized");
        }
    }

    default void log(Level level, String format, Object... args) {
        switch(level) {
            case None:
                break;
            case Trace:
                trace(format, args);
                break;
            case Debug:
                debug(format, args);
                break;
            case Info:
                info(format, args);
                break;
            case Warn:
                warn(format, args);
                break;
            case Error:
                error(format, args);
                break;
            default:
                throw new IllegalStateException("Level " + level + " is not recognized");
        }
    }

    default void log(Level level, String format, Throwable cause, Object... args) {
        switch(level) {
            case None:
                break;
            case Trace:
                trace(format, cause, args);
                break;
            case Debug:
                debug(format, cause, args);
                break;
            case Info:
                info(format, cause, args);
                break;
            case Warn:
                warn(format, cause, args);
                break;
            case Error:
                error(format, cause, args);
                break;
            default:
                throw new IllegalStateException("Level " + level + " is not recognized");
        }
    }
}
