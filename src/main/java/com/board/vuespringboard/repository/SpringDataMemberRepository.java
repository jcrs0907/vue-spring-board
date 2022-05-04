package com.board.vuespringboard.repository;

import java.util.Optional;
import com.board.vuespringboard.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

  @Override
  Optional<Member> findByName(String name);
}