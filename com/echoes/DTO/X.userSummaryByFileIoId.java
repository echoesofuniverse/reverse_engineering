package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final


import java.math.BigDecimal;

/**
 * X.userSummaryByFileIoId generated by hbm2java
 */
public class X.userSummaryByFileIoId  implements java.io.Serializable {


     private String user;
     private BigDecimal ios;
     private BigDecimal ioLatency;

    public X.userSummaryByFileIoId() {
    }

    public X.userSummaryByFileIoId(String user, BigDecimal ios, BigDecimal ioLatency) {
       this.user = user;
       this.ios = ios;
       this.ioLatency = ioLatency;
    }
   
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public BigDecimal getIos() {
        return this.ios;
    }
    
    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }
    public BigDecimal getIoLatency() {
        return this.ioLatency;
    }
    
    public void setIoLatency(BigDecimal ioLatency) {
        this.ioLatency = ioLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.userSummaryByFileIoId) ) return false;
		 X.userSummaryByFileIoId castOther = ( X.userSummaryByFileIoId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getIos()==castOther.getIos()) || ( this.getIos()!=null && castOther.getIos()!=null && this.getIos().equals(castOther.getIos()) ) )
 && ( (this.getIoLatency()==castOther.getIoLatency()) || ( this.getIoLatency()!=null && castOther.getIoLatency()!=null && this.getIoLatency().equals(castOther.getIoLatency()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getIos() == null ? 0 : this.getIos().hashCode() );
         result = 37 * result + ( getIoLatency() == null ? 0 : this.getIoLatency().hashCode() );
         return result;
   }   


}


