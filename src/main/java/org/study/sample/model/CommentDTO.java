package org.study.sample.model;

import java.sql.Timestamp;

import lombok.Data;
/*
CREATE table commentTBL(
	c_id int primary key auto_increment,
	c_post int not null,-- 어느 게시글에 달린 댓글인가
	c_content varchar(200) not null,-- 댓글 내용
	c_writer varchar(15) not null,-- 작성자
	c_regDate datetime default (current_time),
	foreign key (c_writer) references memberTBL(m_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE,
	foreign key (c_post) references boardTBL(b_no)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);
*/
@Data
public class CommentDTO {
	private int c_id;
	private int c_post;
	private String c_content;
	private String c_writer;
	private Timestamp c_regDate;

}
