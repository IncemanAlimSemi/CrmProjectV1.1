/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alsein.crmProject.RestApi;

import com.alsein.crmProject.Business.IJobService;
import com.alsein.crmProject.Entities.Job;
import java.util.List;

/**
 *
 * @author alims
 */
public class JobController {
    	private IJobService jobService;

	public JobController(IJobService jobService) {
		this.jobService = jobService;
	}
	
	
	public List<Job> get(){
		return jobService.getAll();
	}
}
