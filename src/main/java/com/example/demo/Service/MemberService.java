package com.example.demo.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void save(Member member) throws Exception{

        Member db_member = memberRepository.getByEmail(member.getEmail());
        if(db_member != null)
            throw new Exception("이메일이 존재해..");

       memberRepository.save(member);
    }

}
