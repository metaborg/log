package mb.log.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.DefaultJoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import mb.log.api.Logger;
import mb.log.api.LoggerFactory;

import java.net.URL;

public class LogbackLoggerFactory implements LoggerFactory {
    private final LoggerContext context;


    public static LogbackLoggerFactory createWithAutoConfig() throws JoranException {
        final LoggerContext context = new LoggerContext();
        final ContextInitializer initializer = new ContextInitializer(context);
        initializer.autoConfig();
        return new LogbackLoggerFactory(context);
    }

    public static LogbackLoggerFactory createWithConfigurationUrl(URL url) throws JoranException {
        final LoggerContext context = new LoggerContext();

        DefaultJoranConfigurator joranConfigurator = new DefaultJoranConfigurator();
        joranConfigurator.setContext(context);
        joranConfigurator.configureByResource(url);

        return new LogbackLoggerFactory(context);
    }

    private LogbackLoggerFactory(LoggerContext context) {
        this.context = context;
    }


    @Override public Logger create(String name) {
        return new LogbackLogger(context.getLogger(name));
    }

    @Override public Logger create(Class<?> clazz) {
        return new LogbackLogger(context.getLogger(clazz));
    }
}
