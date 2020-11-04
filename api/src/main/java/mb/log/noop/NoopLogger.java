package mb.log.noop;

import mb.log.api.Level;
import mb.log.api.Logger;

public class NoopLogger implements Logger {
    public static final NoopLogger instance = new NoopLogger();

    private NoopLogger() {}

    @Override public boolean isTraceEnabled() { return false; }

    @Override public void trace(String msg) {}

    @Override public void trace(String msg, Throwable cause) {}

    @Override public void trace(String format, Object... args) {}

    @Override public void trace(String format, Throwable cause, Object... args) {}

    @Override public boolean isDebugEnabled() { return false; }

    @Override public void debug(String msg) {}

    @Override public void debug(String msg, Throwable cause) {}

    @Override public void debug(String format, Object... args) {}

    @Override public void debug(String format, Throwable cause, Object... args) {}

    @Override public boolean isInfoEnabled() { return false; }

    @Override public void info(String msg) {}

    @Override public void info(String msg, Throwable cause) {}

    @Override public void info(String format, Object... args) {}

    @Override public void info(String format, Throwable cause, Object... args) {}

    @Override public boolean isWarnEnabled() { return false; }

    @Override public void warn(String msg) {}

    @Override public void warn(String msg, Throwable cause) {}

    @Override public void warn(String format, Object... args) {}

    @Override public void warn(String format, Throwable cause, Object... args) {}

    @Override public boolean isErrorEnabled() { return false; }

    @Override public void error(String msg) {}

    @Override public void error(String msg, Throwable cause) {}

    @Override public void error(String format, Object... args) {}

    @Override public void error(String format, Throwable cause, Object... args) {}

    @Override public boolean enabled(Level level) { return false; }

    @Override public void log(Level level, String msg) {}

    @Override public void log(Level level, String msg, Throwable cause) {}

    @Override public void log(Level level, String format, Object... args) {}

    @Override public void log(Level level, String format, Throwable cause, Object... args) {}
}
