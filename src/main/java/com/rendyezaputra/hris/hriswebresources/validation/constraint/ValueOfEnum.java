package com.rendyezaputra.hris.hriswebresources.validation.constraint;

import com.rendyezaputra.hris.hriswebresources.validation.ValueOfEnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValueOfEnumValidator.class)
public @interface ValueOfEnum {
    Class<? extends Enum<?>> enumClass();
    String message() default "{com.rendyezaputra.hris.validation.constraint.ValueOfEnum.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
