package com.board.vuespringboard.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;

@Entity
@Getter
@Table(name = "member")
public class Member {
   // PK 지정
   @Id
   // 데이터베이스에 따라 자동으로 ID가 지정 - 기본 세팅
   @GeneratedValue(strategy = GenerationType.AUTO)
   //@Column을 붙여주면 DB 컬럼으로 등록
   @Column(name = "member_id")
   private long id;

   @Column(name = "name")
   private String name;

   @Column(name = "content")
   private String password;

   @CreationTimestamp
   @Column(name = "cre_dttm", nullable = false)
   private LocalDateTime  credttm;

   @UpdateTimestamp
   @Column(name = "upt_dttm", nullable = false)
   private LocalDateTime  uptdttm;
   
}
