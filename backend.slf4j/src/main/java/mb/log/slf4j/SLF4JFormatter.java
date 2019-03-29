package mb.log.slf4j;

import mb.log.api.Formatter;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.slf4j.helpers.MessageFormatter;

public class SLF4JFormatter implements Formatter {
    static final SLF4JFormatter instance = new SLF4JFormatter();


    @Override public String format(String msg, @Nullable Throwable throwable, Object... args) {
        return MessageFormatter.arrayFormat(msg, args).getMessage();
    }

    @Override public String format(String msg, Object... args) {
        return MessageFormatter.arrayFormat(msg, args).getMessage();
    }

    @Override public String format(String msg) {
        return msg;
    }
}
