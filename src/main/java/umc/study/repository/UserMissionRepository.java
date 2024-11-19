package umc.study.repository;

import umc.study.entity.UserMission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMissionRepository extends JpaRepository<UserMission, Long> {
    boolean existsByUserIdAndMissionIdAndStatus(Long userId, Long missionId, String status);
}