package umc.study.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MemberMission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;  // Member 타입으로 설정

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id", nullable = false)
    private Mission mission;

    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private Status status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}