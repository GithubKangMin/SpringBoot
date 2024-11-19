package umc.study.service;

import umc.study.dto.AddMissionRequest;
import umc.study.entity.Mission;
import umc.study.entity.Store;
import umc.study.repository.MissionRepository;
import umc.study.repository.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;

    @Autowired
    private StoreRepository storeRepository;

    public void addMission(Long storeId, AddMissionRequest request) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("가게를 찾을 수 없습니다."));

        Mission mission = new Mission();
        mission.setDescription(request.getDescription());
        mission.setStore(store);

        missionRepository.save(mission);
    }
}