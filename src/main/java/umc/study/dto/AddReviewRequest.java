package umc.study.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import umc.study.validation.StoreExists;

public class AddReviewRequest {

    @NotNull
    @StoreExists
    private Long storeId;

    @NotBlank
    private String reviewContent;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }
}