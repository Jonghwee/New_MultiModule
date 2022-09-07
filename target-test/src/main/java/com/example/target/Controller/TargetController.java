package com.example.target.Controller;

import com.example.target.DTO.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Project : MultiModule
 * Created by OKESTRO
 * Developer : jonghwee
 * Date Time : 2022/09/05 20:26
 * Summary :
 **/
@RestController
public class TargetController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @PostMapping("/member")
    public ResponseEntity<Map> team(){
        List<Member> memberList = new ArrayList<>();
        Map<String, List<Member>> map = new HashMap<>();

        Arrays.asList(
                new Member("최두영", "개발자", "0501"),
                new Member("신정연", "개발자", "0401"),
                new Member("신채연", "개발자", "1223"),
                new Member("엄태혁", "개발자", "0510"),
                new Member("박종휘", "개발자", "1103"),
                new Member("전민수", "개발자", "0718"),
                new Member("민경욱", "개발자", "1001"),
                new Member("한정원", "개발자", "0817")
        ).stream().forEach(Member -> memberList.add(Member));
//        ).stream().forEach(memberList::add);

        map.put("member", memberList);

        return ResponseEntity.ok().body(map);
    }
}
