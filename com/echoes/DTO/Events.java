package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

/**
 * Events generated by hbm2java
 */
public class Events implements java.io.Serializable {

	private long id;
	private Integer availability;
	private String dateOfEvent;
	private String description;
	private String endTime;
	private Double price;
	private Boolean published;
	private String startTime;
	private String title;
	private String venueAddress;
	private String venueName;

	public Events() {
	}

	public Events(long id) {
		this.id = id;
	}

	public Events(long id, Integer availability, String dateOfEvent, String description, String endTime, Double price,
			Boolean published, String startTime, String title, String venueAddress, String venueName) {
		this.id = id;
		this.availability = availability;
		this.dateOfEvent = dateOfEvent;
		this.description = description;
		this.endTime = endTime;
		this.price = price;
		this.published = published;
		this.startTime = startTime;
		this.title = title;
		this.venueAddress = venueAddress;
		this.venueName = venueName;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getAvailability() {
		return this.availability;
	}

	public void setAvailability(Integer availability) {
		this.availability = availability;
	}

	public String getDateOfEvent() {
		return this.dateOfEvent;
	}

	public void setDateOfEvent(String dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVenueAddress() {
		return this.venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public String getVenueName() {
		return this.venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

}
