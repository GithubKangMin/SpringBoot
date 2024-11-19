package umc.study.service;

import umc.study.dto.AddStoreRequest;
import umc.study.entity.Region;
import umc.study.entity.Store;
import umc.study.repository.RegionRepository;
import umc.study.repository.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Autowired
    private RegionRepository regionRepository;

    public void addStore(Long regionId, AddStoreRequest request) {
        Region region = regionRepository.findById(regionId)
                .orElseThrow(() -> new RuntimeException("지역을 찾을 수 없습니다."));

        Store store = new Store();
        store.setName(request.getName());
        store.setAddress(request.getAddress());
        store.setRegion(region);

        storeRepository.save(store);
    }
}