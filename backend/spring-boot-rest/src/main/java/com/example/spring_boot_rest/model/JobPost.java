package com.example.spring_boot_rest.model;


import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

	public JobPost(int postId, String postProfile, String postDesc, int reqExperience, List<String> postTechStack) {
		// TODO Auto-generated constructor stub
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.reqExperience = reqExperience;
		this.postTechStack = postTechStack;
	}
	private int postId;
	private String postProfile; 
	private String postDesc;
	private int reqExperience;
	private List<String> postTechStack;
	

}