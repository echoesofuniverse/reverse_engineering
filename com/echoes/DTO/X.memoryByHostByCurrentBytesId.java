package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final


import java.math.BigDecimal;

/**
 * X.memoryByHostByCurrentBytesId generated by hbm2java
 */
public class X.memoryByHostByCurrentBytesId  implements java.io.Serializable {


     private String host;
     private BigDecimal currentCountUsed;
     private BigDecimal currentAllocated;
     private BigDecimal currentAvgAlloc;
     private Long currentMaxAlloc;
     private BigDecimal totalAllocated;

    public X.memoryByHostByCurrentBytesId() {
    }

	
    public X.memoryByHostByCurrentBytesId(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }
    public X.memoryByHostByCurrentBytesId(String host, BigDecimal currentCountUsed, BigDecimal currentAllocated, BigDecimal currentAvgAlloc, Long currentMaxAlloc, BigDecimal totalAllocated) {
       this.host = host;
       this.currentCountUsed = currentCountUsed;
       this.currentAllocated = currentAllocated;
       this.currentAvgAlloc = currentAvgAlloc;
       this.currentMaxAlloc = currentMaxAlloc;
       this.totalAllocated = totalAllocated;
    }
   
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    public BigDecimal getCurrentCountUsed() {
        return this.currentCountUsed;
    }
    
    public void setCurrentCountUsed(BigDecimal currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }
    public BigDecimal getCurrentAllocated() {
        return this.currentAllocated;
    }
    
    public void setCurrentAllocated(BigDecimal currentAllocated) {
        this.currentAllocated = currentAllocated;
    }
    public BigDecimal getCurrentAvgAlloc() {
        return this.currentAvgAlloc;
    }
    
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }
    public Long getCurrentMaxAlloc() {
        return this.currentMaxAlloc;
    }
    
    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }
    public BigDecimal getTotalAllocated() {
        return this.totalAllocated;
    }
    
    public void setTotalAllocated(BigDecimal totalAllocated) {
        this.totalAllocated = totalAllocated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.memoryByHostByCurrentBytesId) ) return false;
		 X.memoryByHostByCurrentBytesId castOther = ( X.memoryByHostByCurrentBytesId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getCurrentCountUsed()==castOther.getCurrentCountUsed()) || ( this.getCurrentCountUsed()!=null && castOther.getCurrentCountUsed()!=null && this.getCurrentCountUsed().equals(castOther.getCurrentCountUsed()) ) )
 && ( (this.getCurrentAllocated()==castOther.getCurrentAllocated()) || ( this.getCurrentAllocated()!=null && castOther.getCurrentAllocated()!=null && this.getCurrentAllocated().equals(castOther.getCurrentAllocated()) ) )
 && ( (this.getCurrentAvgAlloc()==castOther.getCurrentAvgAlloc()) || ( this.getCurrentAvgAlloc()!=null && castOther.getCurrentAvgAlloc()!=null && this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc()) ) )
 && ( (this.getCurrentMaxAlloc()==castOther.getCurrentMaxAlloc()) || ( this.getCurrentMaxAlloc()!=null && castOther.getCurrentMaxAlloc()!=null && this.getCurrentMaxAlloc().equals(castOther.getCurrentMaxAlloc()) ) )
 && ( (this.getTotalAllocated()==castOther.getTotalAllocated()) || ( this.getTotalAllocated()!=null && castOther.getTotalAllocated()!=null && this.getTotalAllocated().equals(castOther.getTotalAllocated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getCurrentCountUsed() == null ? 0 : this.getCurrentCountUsed().hashCode() );
         result = 37 * result + ( getCurrentAllocated() == null ? 0 : this.getCurrentAllocated().hashCode() );
         result = 37 * result + ( getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode() );
         result = 37 * result + ( getCurrentMaxAlloc() == null ? 0 : this.getCurrentMaxAlloc().hashCode() );
         result = 37 * result + ( getTotalAllocated() == null ? 0 : this.getTotalAllocated().hashCode() );
         return result;
   }   


}


