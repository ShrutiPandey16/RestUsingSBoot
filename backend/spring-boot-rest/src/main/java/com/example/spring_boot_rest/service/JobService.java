package com.example.spring_boot_rest.service;

import java.util.ArrayList;
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
		repo.save(job);
	}

	public List<JobPost> getAllJobs() {
		return repo.findAll();
	}

	public JobPost getJob(int postId) {
		return repo.findById(postId).orElse(new JobPost());
	}

	public void updateJob(JobPost jobPost) {
		 repo.save(jobPost);
		
	}

	public void deleteJob(int postId) {
		repo.deleteById(postId);
	}

	public void load() {
		// TODO Auto-generated method stub
		List<JobPost> jobs = new ArrayList<>();
		jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React")));
		jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")));
		jobs.add(new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, List.of("Networking", "Cisco", "Routing", "Switching")));
		jobs.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, List.of("iOS Development", "Android Development", "Mobile App")));
		jobs.add(new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines", 4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")));
		
		repo.saveAll(jobs);
	}

	public List<JobPost> search(String keyword) {
		// TODO Auto-generated method stub
		return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
	}

}
