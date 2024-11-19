package umc.study.controller;

import umc.study.dto.AddStoreRequest;
import umc.study.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/regions/{regionId}/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<String> addStore(
            @PathVariable Long regionId,
            @Valid @RequestBody AddStoreRequest request) {

        storeService.addStore(regionId, request);

        return ResponseEntity.ok("가게가 추가되었습니다.");
    }
}