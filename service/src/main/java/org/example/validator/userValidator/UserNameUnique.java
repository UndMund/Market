package org.example.validator.userValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UserNameUniqueValidator.class)
public @interface UserNameUnique {
    String message() default "{name.notUnique}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
