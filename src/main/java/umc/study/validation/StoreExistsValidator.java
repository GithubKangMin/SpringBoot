package umc.study.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import umc.study.repository.StoreRepository;

public class StoreExistsValidator implements ConstraintValidator<StoreExists, Long> {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public boolean isValid(Long storeId, ConstraintValidatorContext context) {
        if (storeId == null) {
            return false;
        }
        return storeRepository.existsById(storeId);
    }
}