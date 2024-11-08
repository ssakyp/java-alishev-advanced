import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //for library/framework
public @interface MethodInfo {
    String author() default "Sultan";
    int dateOfCreation() default 2024;
    String purpose() default "Prints Hello World!";

}
