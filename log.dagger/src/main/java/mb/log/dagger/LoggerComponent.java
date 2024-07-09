package mb.log.dagger;

import dagger.Component;
import mb.log.api.LoggerFactory;

@LoggerScope
@Component(
    modules = {
        LoggerModule.class
    },
    dependencies = {

    }
)
public interface LoggerComponent {
    LoggerFactory getLoggerFactory();
}
