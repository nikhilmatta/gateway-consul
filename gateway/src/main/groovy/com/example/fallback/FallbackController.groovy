package com.example.fallback

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono;

@RestController
class FallbackController {
    @GetMapping("/fallback")
    public Mono<String> getMsg() {
        return Mono.just("No response from Book Service. We will be back shortly!");
    }
}
