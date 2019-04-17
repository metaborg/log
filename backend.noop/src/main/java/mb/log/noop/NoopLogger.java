package mb.log.noop;

import mb.log.api.Formatter;
import mb.log.api.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

public class NoopLogger implements Logger {
    @Override public void trace(String msg, @Nullable Throwable t) {}

    @Override public boolean traceEnabled() { return false; }

    @Override public void debug(String msg, @Nullable Throwable t) {}

    @Override public boolean debugEnabled() { return false; }

    @Override public void info(String msg, @Nullable Throwable t) {}

    @Override public boolean infoEnabled() {
        return false;
    }

    @Override public void warn(String msg, @Nullable Throwable t) {}

    @Override public boolean warnEnabled() {
        return false;
    }

    @Override public void error(String msg, @Nullable Throwable t) {}

    @Override public boolean errorEnabled() {
        return false;
    }

    @Override public Formatter formatter() {
        return NoopFormatter.instance;
    }
}
