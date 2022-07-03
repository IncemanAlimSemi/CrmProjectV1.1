/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.RestApi;

import com.alsein.crmProject.Business.IJobService;
import com.alsein.crmProject.Entities.Job;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alims
 */
@RestController
@RequestMapping("/api")
public class JobController {
    	private IJobService jobService;

	public JobController(IJobService jobService) {
		this.jobService = jobService;
	}
	
	@GetMapping("/jobs")
	public List<Job> get(){
		return jobService.getAll();
	}
}
