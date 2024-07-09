package mb.log.stream;

import mb.log.api.Logger;
import mb.log.api.LoggerFactory;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.OutputStream;
import java.io.PrintWriter;

public class StreamLoggerFactory implements LoggerFactory {
    private final @Nullable PrintWriter errorWriter;
    private final @Nullable PrintWriter warnWriter;
    private final @Nullable PrintWriter infoWriter;
    private final @Nullable PrintWriter debugWriter;
    private final @Nullable PrintWriter traceWriter;

    public StreamLoggerFactory(
        @Nullable PrintWriter errorWriter,
        @Nullable PrintWriter warnWriter,
        @Nullable PrintWriter infoWriter,
        @Nullable PrintWriter debugWriter,
        @Nullable PrintWriter traceWriter
    ) {
        this.errorWriter = errorWriter;
        this.warnWriter = warnWriter;
        this.infoWriter = infoWriter;
        this.debugWriter = debugWriter;
        this.traceWriter = traceWriter;
    }


    public static StreamLoggerFactory stdOutErrors() {
        return errors(System.out);
    }

    public static StreamLoggerFactory stdOutErrorsAndWarnings() {
        return errorsAndWarnings(System.out);
    }

    public static StreamLoggerFactory stdOutNonVerbose() {
        return nonVerbose(System.out);
    }

    public static StreamLoggerFactory stdOutVerbose() {
        return verbose(System.out);
    }

    public static StreamLoggerFactory stdOutVeryVerbose() {
        return veryVerbose(System.out);
    }


    public static StreamLoggerFactory stdErrErrors() {
        return errors(System.err);
    }

    public static StreamLoggerFactory stdErrErrorsAndWarnings() {
        return errorsAndWarnings(System.err);
    }

    public static StreamLoggerFactory stdErrNonVerbose() {
        return nonVerbose(System.err);
    }

    public static StreamLoggerFactory stdErrVerbose() {
        return verbose(System.err);
    }

    public static StreamLoggerFactory stdErrVeryVerbose() {
        return veryVerbose(System.err);
    }


    public static StreamLoggerFactory errors(OutputStream out) {
        return new StreamLoggerFactory(newPrintWriter(out), null, null, null, null);
    }

    public static StreamLoggerFactory errorsAndWarnings(OutputStream out) {
        return new StreamLoggerFactory(newPrintWriter(out), newPrintWriter(out), null, null, null);
    }

    public static StreamLoggerFactory nonVerbose(OutputStream out) {
        return new StreamLoggerFactory(newPrintWriter(out), newPrintWriter(out), newPrintWriter(out), null, null);
    }

    public static StreamLoggerFactory verbose(OutputStream out) {
        return new StreamLoggerFactory(newPrintWriter(out), newPrintWriter(out), newPrintWriter(out), newPrintWriter(out), null);
    }

    public static StreamLoggerFactory veryVerbose(OutputStream out) {
        return new StreamLoggerFactory(newPrintWriter(out), newPrintWriter(out), newPrintWriter(out), newPrintWriter(out), newPrintWriter(out));
    }


    private static PrintWriter newPrintWriter(OutputStream out) {
        return new PrintWriter(out, true);
    }


    @Override public StreamLogger create(String name) {
        return new StreamLogger();
    }

    @Override public StreamLogger create(Class<?> clazz) {
        return new StreamLogger();
    }


    public class StreamLogger implements Logger {
        @Override public boolean isTraceEnabled() {
            return traceWriter != null;
        }

        @Override public void trace(String format, Object... args) {
            if(traceWriter == null) return;
            traceWriter.println(StringFormatter.format(format, args));
        }

        @Override public void trace(String format, Throwable cause, Object... args) {
            if(traceWriter == null) return;
            traceWriter.println(StringFormatter.format(format, args));
            traceWriter.println(cause);
        }


        @Override public boolean isDebugEnabled() {
            return debugWriter != null;
        }

        @Override public void debug(String format, Object... args) {
            if(debugWriter == null) return;
            debugWriter.println(StringFormatter.format(format, args));
        }

        @Override public void debug(String format, Throwable cause, Object... args) {
            if(debugWriter == null) return;
            debugWriter.println(StringFormatter.format(format, args));
            debugWriter.println(cause);
        }


        @Override public boolean isInfoEnabled() {
            return infoWriter != null;
        }

        @Override public void info(String format, Object... args) {
            if(infoWriter == null) return;
            infoWriter.println(StringFormatter.format(format, args));
        }

        @Override public void info(String format, Throwable cause, Object... args) {
            if(infoWriter == null) return;
            infoWriter.println(StringFormatter.format(format, args));
            infoWriter.println(cause);
        }


        @Override public boolean isWarnEnabled() {
            return warnWriter != null;
        }

        @Override public void warn(String format, Object... args) {
            if(warnWriter == null) return;
            warnWriter.println(StringFormatter.format(format, args));
        }

        @Override public void warn(String format, Throwable cause, Object... args) {
            if(warnWriter == null) return;
            warnWriter.println(StringFormatter.format(format, args));
            warnWriter.println(cause);
        }


        @Override public boolean isErrorEnabled() {
            return errorWriter != null;
        }

        @Override public void error(String format, Object... args) {
            if(errorWriter == null) return;
            errorWriter.println(StringFormatter.format(format, args));
        }

        @Override public void error(String format, Throwable cause, Object... args) {
            if(errorWriter == null) return;
            errorWriter.println(StringFormatter.format(format, args));
            errorWriter.println(cause);
        }
    }
}
