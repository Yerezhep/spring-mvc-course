package kz.sultan.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endsWith;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endsWith = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endsWith);
    }
}