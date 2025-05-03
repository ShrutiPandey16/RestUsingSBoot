package com.example.spring_boot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_rest.Repository.JobRepo;
import com.example.spring_boot_rest.model.JobPost;

@Service
public class JobService {

	@Autowired
	public JobRepo repo;

	public void addJob(JobPost job) {
		repo.addJobPost(job);
	}

	public List<JobPost> getAllJobs() {
		return repo.returnAllJobPosts();
	}

	public JobPost getJob(int postId) {
		return repo.returnJobPost(postId);
	}

}
