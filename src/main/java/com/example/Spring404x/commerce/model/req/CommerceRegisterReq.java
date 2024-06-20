package com.example.Spring404x.commerce.model.req;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CommerceRegisterReq {
	String title;
	String description;
	LocalDate liveDate;
	LocalDateTime startTime;
	LocalDateTime endTime;
	String keyword;
	String item;
	String company;

	int managerId;
	int companyId;

	public CommerceRegisterReq() {}

	public CommerceRegisterReq(String title, String description, LocalDate liveDate, LocalDateTime startTime,
		LocalDateTime endTime, String keyword, String item, String company, int managerId, int companyId) {
		this.title = title;
		this.description = description;
		this.liveDate = liveDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.keyword = keyword;
		this.item = item;
		this.company = company;
		this.managerId = managerId;
		this.companyId = companyId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getLiveDate() {
		return liveDate;
	}

	public void setLiveDate(LocalDate liveDate) {
		this.liveDate = liveDate;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
}
