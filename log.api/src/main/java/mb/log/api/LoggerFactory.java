package mb.log.api;

public interface LoggerFactory {
    Logger create(String name);

    Logger create(Class<?> clazz);
}
