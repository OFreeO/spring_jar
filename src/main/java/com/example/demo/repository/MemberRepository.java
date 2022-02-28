package com.example.demo.repository;

import com.example.demo.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member getByEmail(String email);

    Page<Member> findByEmailContaining(String email, Pageable pageable);
//    Member getByPwd(String pwd);
//    Member getByEmailOrPwd(String email,String pwd);

    @Transactional
    long deleteAllByIdIn(List<Long> id);
}
