-- MySQL Script
-- 2022 2 26

-- -----------------------------------------------------
-- Table `vue_board`.`member`
-- -----------------------------------------------------
create table member(
	member_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	member_name VARCHAR(20) NOT NULL,
	member_password VARCHAR(100) NOT NULL,
	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL
);

-- -----------------------------------------------------
-- Table `vue_board`.`board`
-- -----------------------------------------------------
create table board(
	board_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	member_id VARCHAR(20) NOT NULL,
	board_title VARCHAR(50) NOT NULL,
	board_content TEXT NOT NULL,
 	board_count DECIMAL(11,0) NOT NULL DEFAULT 0,
 	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL
);

-- -----------------------------------------------------
-- Table `vue_board`.`comment`
-- -----------------------------------------------------
create table comment(
	comment_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	board_id INT(11) NOT NULL,
	member_id INT(11) NOT NULL,
	comment_content VARCHAR(50) NOT NULL,
	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL
);