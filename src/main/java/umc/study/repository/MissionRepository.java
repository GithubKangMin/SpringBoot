package umc.study.repository;

import umc.study.entity.Mission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
    // 추가 메서드가 필요하면 선언
}