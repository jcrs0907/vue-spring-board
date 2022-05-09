package com.board.vuespringboard.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;

@Entity
@Getter
@Table(name = "board")
public class board {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "board_id")
  private Long id;

  @Column(name = "title")
  private String title;

  @Lob
  @Column(name = "content")
  private String content;

  @Column(name = "count")
  private int count;

  @CreationTimestamp
  @Column(name = "cre_dttm", nullable = false)
  private LocalDateTime credttm;

  @UpdateTimestamp
  @Column(name = "upt_dttm", nullable = false)
  private LocalDateTime  uptdttm;

  //Member와 board 연관관계
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

}
