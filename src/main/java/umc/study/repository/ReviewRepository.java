package umc.study.repository;

import umc.study.entity.Review;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // 추가 메서드가 필요하면 선언
}