package com.info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="student_details")
	public class StudentData {

		@Column
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name="name",nullable = false)
		private String name;
		@Column
		private String address;
		@Column
		private String contact;
		@Column
		private String dob;
		@Column
		private String standards;
	
}
