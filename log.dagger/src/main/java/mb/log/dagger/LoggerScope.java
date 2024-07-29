package mb.log.dagger;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A dependency-injection {@link Scope scope annotation} for instances of {@link LoggerComponent logger components}.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggerScope {}
