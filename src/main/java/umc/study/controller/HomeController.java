package umc.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> getHome() {
        // JWT 토큰 인증이 필요하다고 가정
        // 실제 데이터는 생략하고 문자열로 대체
        return ResponseEntity.ok("홈 화면 데이터");
    }
}