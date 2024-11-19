package umc.study.domain;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class ReviewImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id", nullable = false)
    private Review review;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String imageUrl;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}