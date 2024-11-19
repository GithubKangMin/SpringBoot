package umc.study.repository;

import umc.study.entity.Region;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
    // 추가 메서드가 필요하면 선언
}