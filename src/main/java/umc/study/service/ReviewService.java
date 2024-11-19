package umc.study.service;

import umc.study.dto.AddReviewRequest;
import umc.study.entity.Review;
import umc.study.entity.Store;
import umc.study.entity.User;
import umc.study.repository.ReviewRepository;
import umc.study.repository.StoreRepository;
import umc.study.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    public void addReview(Long storeId, Long userId, AddReviewRequest request) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("가게를 찾을 수 없습니다."));

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));

        Review review = new Review();
        review.setStore(store);
        review.setUser(user);
        review.setContent(request.getReviewContent());

        reviewRepository.save(review);
    }
}