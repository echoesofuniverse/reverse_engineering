package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

/**
 * MemoryByThreadByCurrentBytesId generated by hbm2java
 */
public class MemoryByThreadByCurrentBytesId implements java.io.Serializable {

	private long threadId;
	private String user;
	private BigDecimal currentCountUsed;
	private String currentAllocated;
	private String currentAvgAlloc;
	private String currentMaxAlloc;
	private String totalAllocated;

	public MemoryByThreadByCurrentBytesId() {
	}

	public MemoryByThreadByCurrentBytesId(long threadId) {
		this.threadId = threadId;
	}

	public MemoryByThreadByCurrentBytesId(long threadId, String user, BigDecimal currentCountUsed,
			String currentAllocated, String currentAvgAlloc, String currentMaxAlloc, String totalAllocated) {
		this.threadId = threadId;
		this.user = user;
		this.currentCountUsed = currentCountUsed;
		this.currentAllocated = currentAllocated;
		this.currentAvgAlloc = currentAvgAlloc;
		this.currentMaxAlloc = currentMaxAlloc;
		this.totalAllocated = totalAllocated;
	}

	public long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public BigDecimal getCurrentCountUsed() {
		return this.currentCountUsed;
	}

	public void setCurrentCountUsed(BigDecimal currentCountUsed) {
		this.currentCountUsed = currentCountUsed;
	}

	public String getCurrentAllocated() {
		return this.currentAllocated;
	}

	public void setCurrentAllocated(String currentAllocated) {
		this.currentAllocated = currentAllocated;
	}

	public String getCurrentAvgAlloc() {
		return this.currentAvgAlloc;
	}

	public void setCurrentAvgAlloc(String currentAvgAlloc) {
		this.currentAvgAlloc = currentAvgAlloc;
	}

	public String getCurrentMaxAlloc() {
		return this.currentMaxAlloc;
	}

	public void setCurrentMaxAlloc(String currentMaxAlloc) {
		this.currentMaxAlloc = currentMaxAlloc;
	}

	public String getTotalAllocated() {
		return this.totalAllocated;
	}

	public void setTotalAllocated(String totalAllocated) {
		this.totalAllocated = totalAllocated;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MemoryByThreadByCurrentBytesId))
			return false;
		MemoryByThreadByCurrentBytesId castOther = (MemoryByThreadByCurrentBytesId) other;

		return (this.getThreadId() == castOther.getThreadId())
				&& ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
						&& this.getUser().equals(castOther.getUser())))
				&& ((this.getCurrentCountUsed() == castOther.getCurrentCountUsed())
						|| (this.getCurrentCountUsed() != null && castOther.getCurrentCountUsed() != null
								&& this.getCurrentCountUsed().equals(castOther.getCurrentCountUsed())))
				&& ((this.getCurrentAllocated() == castOther.getCurrentAllocated())
						|| (this.getCurrentAllocated() != null && castOther.getCurrentAllocated() != null
								&& this.getCurrentAllocated().equals(castOther.getCurrentAllocated())))
				&& ((this.getCurrentAvgAlloc() == castOther.getCurrentAvgAlloc())
						|| (this.getCurrentAvgAlloc() != null && castOther.getCurrentAvgAlloc() != null
								&& this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc())))
				&& ((this.getCurrentMaxAlloc() == castOther.getCurrentMaxAlloc())
						|| (this.getCurrentMaxAlloc() != null && castOther.getCurrentMaxAlloc() != null
								&& this.getCurrentMaxAlloc().equals(castOther.getCurrentMaxAlloc())))
				&& ((this.getTotalAllocated() == castOther.getTotalAllocated())
						|| (this.getTotalAllocated() != null && castOther.getTotalAllocated() != null
								&& this.getTotalAllocated().equals(castOther.getTotalAllocated())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getThreadId();
		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getCurrentCountUsed() == null ? 0 : this.getCurrentCountUsed().hashCode());
		result = 37 * result + (getCurrentAllocated() == null ? 0 : this.getCurrentAllocated().hashCode());
		result = 37 * result + (getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode());
		result = 37 * result + (getCurrentMaxAlloc() == null ? 0 : this.getCurrentMaxAlloc().hashCode());
		result = 37 * result + (getTotalAllocated() == null ? 0 : this.getTotalAllocated().hashCode());
		return result;
	}

}
