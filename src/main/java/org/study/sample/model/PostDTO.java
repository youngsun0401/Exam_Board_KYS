package org.study.sample.model;

import java.sql.Timestamp;

import lombok.Data;
/*
CREATE table boardTBL(
	b_no int primary key auto_increment,
	b_title varchar(200) not null,
	b_content longtext not null,
	b_writer varchar(15) not null,
	b_regDate datetime default (current_time),
	foreign key (b_writer) references memberTBL(m_id)
		ON UPDATE CASCADE
		ON DELETE CASCADE
);
*/
@Data
public class PostDTO {
	private int b_no;
	private String b_title;
	private String b_content;
	private String b_writer;
	private Timestamp b_regDate;
	public PostDTO(String b_title, String b_content, String b_writer) {
		super();
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_writer = b_writer;
	}
	
	
}
