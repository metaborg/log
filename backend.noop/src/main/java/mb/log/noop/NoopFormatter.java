package mb.log.noop;

import mb.log.api.Formatter;
import org.checkerframework.checker.nullness.qual.Nullable;

public class NoopFormatter implements Formatter {
    static final NoopFormatter instance = new NoopFormatter();

    @Override public String format(String msg, @Nullable Throwable throwable, Object... args) { return ""; }

    @Override public String format(String msg, Object... args) { return ""; }

    @Override public String format(String msg) {
        return "";
    }
}
