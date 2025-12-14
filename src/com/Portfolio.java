package com;

import java.util.List;

public class Portfolio 
{
    private String name;
    private String email;
    private String phone;
    private List<String> skills;
    private List<String> achievements;
    
	public Portfolio(String name, String email, String phone, 
			List<String> skills, List<String> achievements) 
	{
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.skills = skills;
		this.achievements = achievements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getAchievements() {
		return achievements;
	}

	public void setAchievements(List<String> achievements) {
		this.achievements = achievements;
	}
	
   
}

