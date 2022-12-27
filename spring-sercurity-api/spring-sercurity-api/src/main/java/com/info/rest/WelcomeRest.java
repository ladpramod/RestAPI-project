package com.info.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.entity.StudentData;
import com.info.services.StudentSevice;

@RestController
@RequestMapping("/v1/")
public class WelcomeRest {

	private StudentSevice studentSevice;

	public WelcomeRest(StudentSevice studentSevice) {
		super();
		this.studentSevice = studentSevice;
	}

	@PostMapping("/data")
	public ResponseEntity<StudentData> saveStudent(@RequestBody StudentData data){
		
		return new ResponseEntity<StudentData>(studentSevice.saveStudent(data),HttpStatus.CREATED);
	}
	
	@GetMapping("/home")
	public String getMsg() {

		String msg = "welcome to Bank";

		return msg;
	}

	@GetMapping("/balance")
	public String getBalance() {

		String balance = "Your availabel balance is Rs.12000";

		return balance;
	}

	@GetMapping("/statement")
	public String getstatement() {

		String stat = "Your statement generated and sent to your email id";

		return stat;
	}

	@GetMapping("/contact")
	public String getcontact() {

		String cont = "Thanks for connecting with us";

		return cont;
	}
}
