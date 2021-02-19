package mb.log.dagger;

import dagger.Module;
import dagger.Provides;
import mb.log.api.LoggerFactory;
import mb.log.noop.NoopLoggerFactory;
import mb.log.stream.StreamLoggerFactory;

@Module
public class LoggerModule {
    private final LoggerFactory loggerFactory;

    public LoggerModule(LoggerFactory loggerFactory) {
        this.loggerFactory = loggerFactory;
    }


    public static LoggerModule noop() {
        return new LoggerModule(NoopLoggerFactory.instance);
    }


    public static LoggerModule stdOutErrors() {
        return new LoggerModule(StreamLoggerFactory.stdOutErrors());
    }

    public static LoggerModule stdOutErrorsAndWarnings() {
        return new LoggerModule(StreamLoggerFactory.stdOutErrorsAndWarnings());
    }

    public static LoggerModule stdOutNonVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdOutNonVerbose());
    }

    public static LoggerModule stdOutVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdOutVerbose());
    }

    public static LoggerModule stdOutVeryVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdOutVeryVerbose());
    }


    public static LoggerModule stdErrErrors() {
        return new LoggerModule(StreamLoggerFactory.stdErrErrors());
    }

    public static LoggerModule stdErrErrorsAndWarnings() {
        return new LoggerModule(StreamLoggerFactory.stdErrErrorsAndWarnings());
    }

    public static LoggerModule stdErrNonVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdErrNonVerbose());
    }

    public static LoggerModule stdErrVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdErrVerbose());
    }

    public static LoggerModule stdErrVeryVerbose() {
        return new LoggerModule(StreamLoggerFactory.stdErrVeryVerbose());
    }


    @Provides @LoggerScope LoggerFactory provideLoggerFactory() {
        return loggerFactory;
    }
}
