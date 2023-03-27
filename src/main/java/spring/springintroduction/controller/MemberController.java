package spring.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.springintroduction.repository.MemberRepository;
import spring.springintroduction.service.MemberService;

@Controller
public class MemberController {
    private MemberService memberService;
    @Autowired //연결할때 사용
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
