package com.integralblue.availability.controller;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringEncryptorController {
	@Autowired StringEncryptor stringEncryptor;
	
	@RequestMapping(value="encrypt",method=RequestMethod.GET)
	public String encrypt(@RequestParam String message){
		return stringEncryptor.encrypt(message);
	}
}
