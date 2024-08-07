package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

/**
 * HostSummaryByFileIoTypeId generated by hbm2java
 */
public class HostSummaryByFileIoTypeId implements java.io.Serializable {

	private String host;
	private String eventName;
	private long total;
	private String totalLatency;
	private String maxLatency;

	public HostSummaryByFileIoTypeId() {
	}

	public HostSummaryByFileIoTypeId(String eventName, long total) {
		this.eventName = eventName;
		this.total = total;
	}

	public HostSummaryByFileIoTypeId(String host, String eventName, long total, String totalLatency,
			String maxLatency) {
		this.host = host;
		this.eventName = eventName;
		this.total = total;
		this.totalLatency = totalLatency;
		this.maxLatency = maxLatency;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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
		if (!(other instanceof HostSummaryByFileIoTypeId))
			return false;
		HostSummaryByFileIoTypeId castOther = (HostSummaryByFileIoTypeId) other;

		return ((this.getHost() == castOther.getHost()) || (this.getHost() != null && castOther.getHost() != null
				&& this.getHost().equals(castOther.getHost())))
				&& ((this.getEventName() == castOther.getEventName()) || (this.getEventName() != null
						&& castOther.getEventName() != null && this.getEventName().equals(castOther.getEventName())))
				&& (this.getTotal() == castOther.getTotal())
				&& ((this.getTotalLatency() == castOther.getTotalLatency())
						|| (this.getTotalLatency() != null && castOther.getTotalLatency() != null
								&& this.getTotalLatency().equals(castOther.getTotalLatency())))
				&& ((this.getMaxLatency() == castOther.getMaxLatency())
						|| (this.getMaxLatency() != null && castOther.getMaxLatency() != null
								&& this.getMaxLatency().equals(castOther.getMaxLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHost() == null ? 0 : this.getHost().hashCode());
		result = 37 * result + (getEventName() == null ? 0 : this.getEventName().hashCode());
		result = 37 * result + (int) this.getTotal();
		result = 37 * result + (getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode());
		result = 37 * result + (getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode());
		return result;
	}

}
