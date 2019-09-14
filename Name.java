import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
@Target({METHOD})
@Retention(RUNTIME)
public @interface Name {
	String name() default "";
}
