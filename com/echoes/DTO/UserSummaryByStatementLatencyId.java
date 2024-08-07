package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

/**
 * UserSummaryByStatementLatencyId generated by hbm2java
 */
public class UserSummaryByStatementLatencyId implements java.io.Serializable {

	private String user;
	private BigDecimal total;
	private String totalLatency;
	private String maxLatency;
	private String lockLatency;
	private String cpuLatency;
	private BigDecimal rowsSent;
	private BigDecimal rowsExamined;
	private BigDecimal rowsAffected;
	private BigDecimal fullScans;

	public UserSummaryByStatementLatencyId() {
	}

	public UserSummaryByStatementLatencyId(String user, BigDecimal total, String totalLatency, String maxLatency,
			String lockLatency, String cpuLatency, BigDecimal rowsSent, BigDecimal rowsExamined,
			BigDecimal rowsAffected, BigDecimal fullScans) {
		this.user = user;
		this.total = total;
		this.totalLatency = totalLatency;
		this.maxLatency = maxLatency;
		this.lockLatency = lockLatency;
		this.cpuLatency = cpuLatency;
		this.rowsSent = rowsSent;
		this.rowsExamined = rowsExamined;
		this.rowsAffected = rowsAffected;
		this.fullScans = fullScans;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	public String getLockLatency() {
		return this.lockLatency;
	}

	public void setLockLatency(String lockLatency) {
		this.lockLatency = lockLatency;
	}

	public String getCpuLatency() {
		return this.cpuLatency;
	}

	public void setCpuLatency(String cpuLatency) {
		this.cpuLatency = cpuLatency;
	}

	public BigDecimal getRowsSent() {
		return this.rowsSent;
	}

	public void setRowsSent(BigDecimal rowsSent) {
		this.rowsSent = rowsSent;
	}

	public BigDecimal getRowsExamined() {
		return this.rowsExamined;
	}

	public void setRowsExamined(BigDecimal rowsExamined) {
		this.rowsExamined = rowsExamined;
	}

	public BigDecimal getRowsAffected() {
		return this.rowsAffected;
	}

	public void setRowsAffected(BigDecimal rowsAffected) {
		this.rowsAffected = rowsAffected;
	}

	public BigDecimal getFullScans() {
		return this.fullScans;
	}

	public void setFullScans(BigDecimal fullScans) {
		this.fullScans = fullScans;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserSummaryByStatementLatencyId))
			return false;
		UserSummaryByStatementLatencyId castOther = (UserSummaryByStatementLatencyId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency()) || (this.getMaxLatency() != null
						&& castOther.getMaxLatency() != null && this.getMaxLatency().equals(castOther.getMaxLatency())))
				&& ((this.getLockLatency() == castOther.getLockLatency())
						|| (this.getLockLatency() != null && castOther.getLockLatency() != null
								&& this.getLockLatency().equals(castOther.getLockLatency())))
				&& ((this.getCpuLatency() == castOther.getCpuLatency()) || (this.getCpuLatency() != null
						&& castOther.getCpuLatency() != null && this.getCpuLatency().equals(castOther.getCpuLatency())))
				&& ((this.getRowsSent() == castOther.getRowsSent()) || (this.getRowsSent() != null
						&& castOther.getRowsSent() != null && this.getRowsSent().equals(castOther.getRowsSent())))
				&& ((this.getRowsExamined() == castOther.getRowsExamined())
						|| (this.getRowsExamined() != null && castOther.getRowsExamined() != null
								&& this.getRowsExamined().equals(castOther.getRowsExamined())))
				&& ((this.getRowsAffected() == castOther.getRowsAffected())
						|| (this.getRowsAffected() != null && castOther.getRowsAffected() != null
								&& this.getRowsAffected().equals(castOther.getRowsAffected())))
				&& ((this.getFullScans() == castOther.getFullScans()) || (this.getFullScans() != null
						&& castOther.getFullScans() != null && this.getFullScans().equals(castOther.getFullScans())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		result = 37 * result + (getLockLatency() == null ? 0 : this.getLockLatency().hashCode());
		result = 37 * result + (getCpuLatency() == null ? 0 : this.getCpuLatency().hashCode());
		result = 37 * result + (getRowsSent() == null ? 0 : this.getRowsSent().hashCode());
		result = 37 * result + (getRowsExamined() == null ? 0 : this.getRowsExamined().hashCode());
		result = 37 * result + (getRowsAffected() == null ? 0 : this.getRowsAffected().hashCode());
		result = 37 * result + (getFullScans() == null ? 0 : this.getFullScans().hashCode());
		return result;
	}

}
