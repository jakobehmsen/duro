package duro.runtime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExpressionCompatible {
	int popCount() default 0;
	Class<?>[] operandTypes() default {};
}
