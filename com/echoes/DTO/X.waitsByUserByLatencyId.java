package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final



/**
 * X.waitsByUserByLatencyId generated by hbm2java
 */
public class X.waitsByUserByLatencyId  implements java.io.Serializable {


     private String user;
     private String event;
     private long total;
     private long totalLatency;
     private long avgLatency;
     private long maxLatency;

    public X.waitsByUserByLatencyId() {
    }

	
    public X.waitsByUserByLatencyId(String event, long total, long totalLatency, long avgLatency, long maxLatency) {
        this.event = event;
        this.total = total;
        this.totalLatency = totalLatency;
        this.avgLatency = avgLatency;
        this.maxLatency = maxLatency;
    }
    public X.waitsByUserByLatencyId(String user, String event, long total, long totalLatency, long avgLatency, long maxLatency) {
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
    public long getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }
    public long getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }
    public long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.waitsByUserByLatencyId) ) return false;
		 X.waitsByUserByLatencyId castOther = ( X.waitsByUserByLatencyId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getEvent()==castOther.getEvent()) || ( this.getEvent()!=null && castOther.getEvent()!=null && this.getEvent().equals(castOther.getEvent()) ) )
 && (this.getTotal()==castOther.getTotal())
 && (this.getTotalLatency()==castOther.getTotalLatency())
 && (this.getAvgLatency()==castOther.getAvgLatency())
 && (this.getMaxLatency()==castOther.getMaxLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getEvent() == null ? 0 : this.getEvent().hashCode() );
         result = 37 * result + (int) this.getTotal();
         result = 37 * result + (int) this.getTotalLatency();
         result = 37 * result + (int) this.getAvgLatency();
         result = 37 * result + (int) this.getMaxLatency();
         return result;
   }   


}


