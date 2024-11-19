package umc.study.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddStoreRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String address;

    @NotNull
    private Long regionId;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }
}
