package umc.study.controller;

import umc.study.dto.AddMissionRequest;
import umc.study.service.MissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/stores/{storeId}/missions")
public class MissionController {

    @Autowired
    private MissionService missionService;

    @PostMapping
    public ResponseEntity<String> addMission(
            @PathVariable Long storeId,
            @Valid @RequestBody AddMissionRequest request) {

        missionService.addMission(storeId, request);

        return ResponseEntity.ok("미션이 추가되었습니다.");
    }
}