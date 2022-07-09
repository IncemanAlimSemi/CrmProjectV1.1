package com.alsein.crmProject;

import com.alsein.crmProject.GUI.GuiLoginPage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrmProjectApplication {  
    
	public static void main(String[] args) {
            SpringApplication.run(CrmProjectApplication.class, args); 
            GuiLoginPage guiLoginPage = new GuiLoginPage();
            guiLoginPage.setVisible(true);
	}      
}
