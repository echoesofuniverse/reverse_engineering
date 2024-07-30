package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

/**
 * HostSummaryId generated by hbm2java
 */
public class HostSummaryId implements java.io.Serializable {

	private String host;
	private BigDecimal statements;
	private String statementLatency;
	private String statementAvgLatency;
	private BigDecimal tableScans;
	private BigDecimal fileIos;
	private String fileIoLatency;
	private BigDecimal currentConnections;
	private BigDecimal totalConnections;
	private long uniqueUsers;
	private String currentMemory;
	private String totalMemoryAllocated;

	public HostSummaryId() {
	}

	public HostSummaryId(long uniqueUsers) {
		this.uniqueUsers = uniqueUsers;
	}

	public HostSummaryId(String host, BigDecimal statements, String statementLatency, String statementAvgLatency,
			BigDecimal tableScans, BigDecimal fileIos, String fileIoLatency, BigDecimal currentConnections,
			BigDecimal totalConnections, long uniqueUsers, String currentMemory, String totalMemoryAllocated) {
		this.host = host;
		this.statements = statements;
		this.statementLatency = statementLatency;
		this.statementAvgLatency = statementAvgLatency;
		this.tableScans = tableScans;
		this.fileIos = fileIos;
		this.fileIoLatency = fileIoLatency;
		this.currentConnections = currentConnections;
		this.totalConnections = totalConnections;
		this.uniqueUsers = uniqueUsers;
		this.currentMemory = currentMemory;
		this.totalMemoryAllocated = totalMemoryAllocated;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public BigDecimal getStatements() {
		return this.statements;
	}

	public void setStatements(BigDecimal statements) {
		this.statements = statements;
	}

	public String getStatementLatency() {
		return this.statementLatency;
	}

	public void setStatementLatency(String statementLatency) {
		this.statementLatency = statementLatency;
	}

	public String getStatementAvgLatency() {
		return this.statementAvgLatency;
	}

	public void setStatementAvgLatency(String statementAvgLatency) {
		this.statementAvgLatency = statementAvgLatency;
	}

	public BigDecimal getTableScans() {
		return this.tableScans;
	}

	public void setTableScans(BigDecimal tableScans) {
		this.tableScans = tableScans;
	}

	public BigDecimal getFileIos() {
		return this.fileIos;
	}

	public void setFileIos(BigDecimal fileIos) {
		this.fileIos = fileIos;
	}

	public String getFileIoLatency() {
		return this.fileIoLatency;
	}

	public void setFileIoLatency(String fileIoLatency) {
		this.fileIoLatency = fileIoLatency;
	}

	public BigDecimal getCurrentConnections() {
		return this.currentConnections;
	}

	public void setCurrentConnections(BigDecimal currentConnections) {
		this.currentConnections = currentConnections;
	}

	public BigDecimal getTotalConnections() {
		return this.totalConnections;
	}

	public void setTotalConnections(BigDecimal totalConnections) {
		this.totalConnections = totalConnections;
	}

	public long getUniqueUsers() {
		return this.uniqueUsers;
	}

	public void setUniqueUsers(long uniqueUsers) {
		this.uniqueUsers = uniqueUsers;
	}

	public String getCurrentMemory() {
		return this.currentMemory;
	}

	public void setCurrentMemory(String currentMemory) {
		this.currentMemory = currentMemory;
	}

	public String getTotalMemoryAllocated() {
		return this.totalMemoryAllocated;
	}

	public void setTotalMemoryAllocated(String totalMemoryAllocated) {
		this.totalMemoryAllocated = totalMemoryAllocated;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HostSummaryId))
			return false;
		HostSummaryId castOther = (HostSummaryId) other;

		return ((this.getHost() == castOther.getHost()) || (this.getHost() != null && castOther.getHost() != null
				&& this.getHost().equals(castOther.getHost())))
				&& ((this.getStatements() == castOther.getStatements()) || (this.getStatements() != null
						&& castOther.getStatements() != null && this.getStatements().equals(castOther.getStatements())))
				&& ((this.getStatementLatency() == castOther.getStatementLatency())
						|| (this.getStatementLatency() != null && castOther.getStatementLatency() != null
								&& this.getStatementLatency().equals(castOther.getStatementLatency())))
				&& ((this.getStatementAvgLatency() == castOther.getStatementAvgLatency())
						|| (this.getStatementAvgLatency() != null && castOther.getStatementAvgLatency() != null
								&& this.getStatementAvgLatency().equals(castOther.getStatementAvgLatency())))
				&& ((this.getTableScans() == castOther.getTableScans()) || (this.getTableScans() != null
						&& castOther.getTableScans() != null && this.getTableScans().equals(castOther.getTableScans())))
				&& ((this.getFileIos() == castOther.getFileIos()) || (this.getFileIos() != null
						&& castOther.getFileIos() != null && this.getFileIos().equals(castOther.getFileIos())))
				&& ((this.getFileIoLatency() == castOther.getFileIoLatency())
						|| (this.getFileIoLatency() != null && castOther.getFileIoLatency() != null
								&& this.getFileIoLatency().equals(castOther.getFileIoLatency())))
				&& ((this.getCurrentConnections() == castOther.getCurrentConnections())
						|| (this.getCurrentConnections() != null && castOther.getCurrentConnections() != null
								&& this.getCurrentConnections().equals(castOther.getCurrentConnections())))
				&& ((this.getTotalConnections() == castOther.getTotalConnections())
						|| (this.getTotalConnections() != null && castOther.getTotalConnections() != null
								&& this.getTotalConnections().equals(castOther.getTotalConnections())))
				&& (this.getUniqueUsers() == castOther.getUniqueUsers())
				&& ((this.getCurrentMemory() == castOther.getCurrentMemory())
						|| (this.getCurrentMemory() != null && castOther.getCurrentMemory() != null
								&& this.getCurrentMemory().equals(castOther.getCurrentMemory())))
				&& ((this.getTotalMemoryAllocated() == castOther.getTotalMemoryAllocated())
						|| (this.getTotalMemoryAllocated() != null && castOther.getTotalMemoryAllocated() != null
								&& this.getTotalMemoryAllocated().equals(castOther.getTotalMemoryAllocated())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result + (getStatements() == null ? 0 : this.getStatements().hashCode());
		result = 37 * result + (getStatementLatency() == null ? 0 : this.getStatementLatency().hashCode());
		result = 37 * result + (getStatementAvgLatency() == null ? 0 : this.getStatementAvgLatency().hashCode());
		result = 37 * result + (getTableScans() == null ? 0 : this.getTableScans().hashCode());
		result = 37 * result + (getFileIos() == null ? 0 : this.getFileIos().hashCode());
		result = 37 * result + (getFileIoLatency() == null ? 0 : this.getFileIoLatency().hashCode());
		result = 37 * result + (getCurrentConnections() == null ? 0 : this.getCurrentConnections().hashCode());
		result = 37 * result + (getTotalConnections() == null ? 0 : this.getTotalConnections().hashCode());
		result = 37 * result + (int) this.getUniqueUsers();
		result = 37 * result + (getCurrentMemory() == null ? 0 : this.getCurrentMemory().hashCode());
		result = 37 * result + (getTotalMemoryAllocated() == null ? 0 : this.getTotalMemoryAllocated().hashCode());
		return result;
	}

}
