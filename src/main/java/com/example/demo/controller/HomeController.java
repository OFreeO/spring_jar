package com.example.demo.controller;

import com.example.demo.dto.MemberFormDto;
import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("main")
    public String index(Model model){

//        memberRepository.save(new Member().createMember(new MemberFormDto("aa@naver.com", "1234")));
//        memberRepository.save(new Member().createMember(new MemberFormDto("bb@naver.com", "3456")));

        List<Member> list = memberRepository.findAll();
        System.out.println(list);
        model.addAttribute("myname","hongglidong");
        return "main";
    }

}
