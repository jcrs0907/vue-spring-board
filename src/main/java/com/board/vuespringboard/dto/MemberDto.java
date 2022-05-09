package com.board.vuespringboard.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {
  private Long id;
	private String name;
	private Long password;
	private LocalDateTime credttm;
  private LocalDateTime uptdttm;
}
