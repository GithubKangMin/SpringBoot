package umc.study.controller;

import umc.study.dto.AddReviewRequest;
import umc.study.service.ReviewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/mypage")
public class MyPageController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/review")
    public ResponseEntity<String> addReview(@Valid @RequestBody AddReviewRequest request) {
        // 하드코딩된 사용자 ID 사용
        Long userId = 1L;

        reviewService.addReview(request.getStoreId(), userId, request);

        return ResponseEntity.ok("리뷰가 추가되었습니다.");
    }
}