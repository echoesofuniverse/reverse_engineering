package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

/**
 * WaitsByUserByLatencyId generated by hbm2java
 */
public class WaitsByUserByLatencyId implements java.io.Serializable {

	private String user;
	private String event;
	private long total;
	private String totalLatency;
	private String avgLatency;
	private String maxLatency;

	public WaitsByUserByLatencyId() {
	}

	public WaitsByUserByLatencyId(String event, long total) {
		this.event = event;
		this.total = total;
	}

	public WaitsByUserByLatencyId(String user, String event, long total, String totalLatency, String avgLatency,
			String maxLatency) {
		this.user = user;
		this.event = event;
		this.total = total;
		this.totalLatency = totalLatency;
		this.avgLatency = avgLatency;
		this.maxLatency = maxLatency;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String getTotalLatency() {
		return this.totalLatency;
	}

	public void setTotalLatency(String totalLatency) {
		this.totalLatency = totalLatency;
	}

	public String getAvgLatency() {
		return this.avgLatency;
	}

	public void setAvgLatency(String avgLatency) {
		this.avgLatency = avgLatency;
	}

	public String getMaxLatency() {
		return this.maxLatency;
	}

	public void setMaxLatency(String maxLatency) {
		this.maxLatency = maxLatency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WaitsByUserByLatencyId))
			return false;
		WaitsByUserByLatencyId castOther = (WaitsByUserByLatencyId) other;

		return ((this.getUser() == castOther.getUser()) || (this.getUser() != null && castOther.getUser() != null
				&& this.getUser().equals(castOther.getUser())))
				&& ((this.getEvent() == castOther.getEvent()) || (this.getEvent() != null
						&& castOther.getEvent() != null && this.getEvent().equals(castOther.getEvent())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getAvgLatency() == castOther.getAvgLatency()) || (this.getAvgLatency() != null
						&& castOther.getAvgLatency() != null && this.getAvgLatency().equals(castOther.getAvgLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency())
						|| (this.getMaxLatency() != null && castOther.getMaxLatency() != null
								&& this.getMaxLatency().equals(castOther.getMaxLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUser() == null ? 0 : this.getUser().hashCode());
		result = 37 * result + (getEvent() == null ? 0 : this.getEvent().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		return result;
	}

}
