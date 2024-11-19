package umc.study.dto;

import javax.validation.constraints.NotBlank;

public class AddMissionRequest {

    @NotBlank
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}