package umc.study.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
public class MemberPrefer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private FoodCategory foodCategory;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
