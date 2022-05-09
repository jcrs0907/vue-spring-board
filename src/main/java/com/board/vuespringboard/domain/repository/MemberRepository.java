package com.board.vuespringboard.domain.repository;

import java.util.List;
import java.util.Optional;

import com.board.vuespringboard.domain.entity.Member;

public interface MemberRepository {
  Member save(Member member);
  Optional<Member> findById(Long id);
  Optional<Member> findByName(String name);
  List<Member> findAll();  
}

