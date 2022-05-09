package com.board.vuespringboard;

import com.board.vuespringboard.domain.entity.Member;
import com.board.vuespringboard.domain.repository.MemberRepository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VueSpringBoardApplicationTests {

  private final MemberRepository memberRepository;

  @Autowired
  public VueSpringBoardApplicationTests(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
}

}
