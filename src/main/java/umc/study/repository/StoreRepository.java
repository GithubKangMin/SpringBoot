package umc.study.repository;

import umc.study.entity.Store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
    // 추가 메서드가 필요하면 선언
}