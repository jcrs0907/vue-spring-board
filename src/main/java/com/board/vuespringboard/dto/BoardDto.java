package com.board.vuespringboard.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
  private Long id;
	private String title;
	private String content;
 	private int count;
 	private LocalDateTime credttm;
	private LocalDateTime uptdttm;
}
