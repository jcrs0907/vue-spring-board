package com.board.vuespringboard.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
   // PK 지정
   @Id
   // 데이터베이스에 따라 자동으로 ID가 지정 - 기본 세팅
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   private String name;

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }
}
