package org.study.sample.model;

import java.sql.Timestamp;

import lombok.Data;

/*
CREATE table memberTBL(
   m_no int primary key auto_increment,
   m_id varchar(15) not null unique,
   m_pw char(60) not null,
   m_address varchar(50) not null,
   m_regDate datetime default (current_time)
);
*/

@Data
public class MemberDTO {

	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_address;
	private Timestamp m_regDate;
	
	
}
