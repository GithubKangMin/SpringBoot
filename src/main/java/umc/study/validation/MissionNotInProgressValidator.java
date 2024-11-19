package umc.study.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import umc.study.repository.UserMissionRepository;

public class MissionNotInProgressValidator implements ConstraintValidator<MissionNotInProgress, Long> {

    @Autowired
    private UserMissionRepository userMissionRepository;

    @Override
    public boolean isValid(Long missionId, ConstraintValidatorContext context) {
        // 하드코딩된 사용자 ID 사용
        Long userId = 1L;

        // 사용자와 미션 ID로 진행 중인 미션이 있는지 확인
        boolean exists = userMissionRepository.existsByUserIdAndMissionIdAndStatus(userId, missionId, "IN_PROGRESS");

        return !exists;
    }
}