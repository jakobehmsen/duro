package duro.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PopCount {
	public static class Source {
		public static final int VALUE = 0;
		public static final int OPERAND = 1;
		public static final int OPERAND_ARRAY_LENGTH = 2;
	}
	int source() default Source.VALUE;
	int value();
}
