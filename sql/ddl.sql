-- MySQL Script
-- 2022 2 26

-- -----------------------------------------------------
-- Table `vue_board`.`user`
-- -----------------------------------------------------
create table user(
	user_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	user_name VARCHAR(20) NOT NULL,
	user_password  VARCHAR(100) NOT NULL,
	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL,
	USE_YN CHAR(1) NOT NULL DEFAULT 'Y'
);

-- -----------------------------------------------------
-- Table `vue_board`.`board`
-- -----------------------------------------------------
create table board(
	board_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	user_id VARCHAR(20) NOT NULL,
	board_title VARCHAR(50) NOT NULL,
	board_content TEXT NOT NULL,
 	board_count DECIMAL(11,0) NOT NULL DEFAULT 0,
 	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL,
	USE_YN CHAR(1) NOT NULL DEFAULT 'Y'
);

-- -----------------------------------------------------
-- Table `vue_board`.`comment`
-- -----------------------------------------------------
create table comment(
	comment_id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	board_id INT(11) NOT NULL,
	user_id INT(11) NOT NULL,
	comment_content VARCHAR(50) NOT NULL,
	CRE_DTTM DATETIME NOT NULL,
	UPT_DTTM DATETIME NULL,
	USE_YN CHAR(1) NOT NULL DEFAULT 'Y'
);