package com.example.source.Controller;

import com.example.source.DTO.Member;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


/**
 * Project : MultiModule
 * Created by OKESTRO
 * Developer : jonghwee
 * Date Time : 2022/09/05 20:05
 * Summary :
 **/
@RestController
//@RequiredArgsConstructor
public class SourceController {
    private final WebClient webclient = WebClient.create();

    @GetMapping("/hello")
    public Mono<String> get(){
        return webclient.get()
                .uri("/hello")
                .retrieve()
                .bodyToMono(String.class);
    }

    @PostMapping("/member")
    public Mono<ResponseEntity<Member>> post(){
        return webclient.post()
                .uri("/member")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<Member>() {
                });
    }
}
