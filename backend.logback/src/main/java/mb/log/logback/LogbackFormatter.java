package mb.log.logback;

import mb.log.api.Formatter;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.slf4j.helpers.MessageFormatter;

public class LogbackFormatter implements Formatter {
    static final LogbackFormatter instance = new LogbackFormatter();


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
