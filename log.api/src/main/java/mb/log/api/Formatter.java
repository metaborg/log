package mb.log.api;

import javax.annotation.Nullable;

public interface Formatter {
    String format(String msg, @Nullable Throwable throwable, Object... args);

    default String format(String msg, Object... args) {
        return format(msg, null, args);
    }

    default String format(String msg) {
        return format(msg, (Throwable) null);
    }
}
