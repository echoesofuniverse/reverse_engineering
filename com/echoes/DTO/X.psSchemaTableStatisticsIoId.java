package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final


import java.math.BigDecimal;

/**
 * X.psSchemaTableStatisticsIoId generated by hbm2java
 */
public class X.psSchemaTableStatisticsIoId  implements java.io.Serializable {


     private String tableSchema;
     private String tableName;
     private BigDecimal countRead;
     private BigDecimal sumNumberOfBytesRead;
     private BigDecimal sumTimerRead;
     private BigDecimal countWrite;
     private BigDecimal sumNumberOfBytesWrite;
     private BigDecimal sumTimerWrite;
     private BigDecimal countMisc;
     private BigDecimal sumTimerMisc;

    public X.psSchemaTableStatisticsIoId() {
    }

    public X.psSchemaTableStatisticsIoId(String tableSchema, String tableName, BigDecimal countRead, BigDecimal sumNumberOfBytesRead, BigDecimal sumTimerRead, BigDecimal countWrite, BigDecimal sumNumberOfBytesWrite, BigDecimal sumTimerWrite, BigDecimal countMisc, BigDecimal sumTimerMisc) {
       this.tableSchema = tableSchema;
       this.tableName = tableName;
       this.countRead = countRead;
       this.sumNumberOfBytesRead = sumNumberOfBytesRead;
       this.sumTimerRead = sumTimerRead;
       this.countWrite = countWrite;
       this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
       this.sumTimerWrite = sumTimerWrite;
       this.countMisc = countMisc;
       this.sumTimerMisc = sumTimerMisc;
    }
   
    public String getTableSchema() {
        return this.tableSchema;
    }
    
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public BigDecimal getCountRead() {
        return this.countRead;
    }
    
    public void setCountRead(BigDecimal countRead) {
        this.countRead = countRead;
    }
    public BigDecimal getSumNumberOfBytesRead() {
        return this.sumNumberOfBytesRead;
    }
    
    public void setSumNumberOfBytesRead(BigDecimal sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }
    public BigDecimal getSumTimerRead() {
        return this.sumTimerRead;
    }
    
    public void setSumTimerRead(BigDecimal sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }
    public BigDecimal getCountWrite() {
        return this.countWrite;
    }
    
    public void setCountWrite(BigDecimal countWrite) {
        this.countWrite = countWrite;
    }
    public BigDecimal getSumNumberOfBytesWrite() {
        return this.sumNumberOfBytesWrite;
    }
    
    public void setSumNumberOfBytesWrite(BigDecimal sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }
    public BigDecimal getSumTimerWrite() {
        return this.sumTimerWrite;
    }
    
    public void setSumTimerWrite(BigDecimal sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }
    public BigDecimal getCountMisc() {
        return this.countMisc;
    }
    
    public void setCountMisc(BigDecimal countMisc) {
        this.countMisc = countMisc;
    }
    public BigDecimal getSumTimerMisc() {
        return this.sumTimerMisc;
    }
    
    public void setSumTimerMisc(BigDecimal sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.psSchemaTableStatisticsIoId) ) return false;
		 X.psSchemaTableStatisticsIoId castOther = ( X.psSchemaTableStatisticsIoId ) other; 
         
		 return ( (this.getTableSchema()==castOther.getTableSchema()) || ( this.getTableSchema()!=null && castOther.getTableSchema()!=null && this.getTableSchema().equals(castOther.getTableSchema()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getCountRead()==castOther.getCountRead()) || ( this.getCountRead()!=null && castOther.getCountRead()!=null && this.getCountRead().equals(castOther.getCountRead()) ) )
 && ( (this.getSumNumberOfBytesRead()==castOther.getSumNumberOfBytesRead()) || ( this.getSumNumberOfBytesRead()!=null && castOther.getSumNumberOfBytesRead()!=null && this.getSumNumberOfBytesRead().equals(castOther.getSumNumberOfBytesRead()) ) )
 && ( (this.getSumTimerRead()==castOther.getSumTimerRead()) || ( this.getSumTimerRead()!=null && castOther.getSumTimerRead()!=null && this.getSumTimerRead().equals(castOther.getSumTimerRead()) ) )
 && ( (this.getCountWrite()==castOther.getCountWrite()) || ( this.getCountWrite()!=null && castOther.getCountWrite()!=null && this.getCountWrite().equals(castOther.getCountWrite()) ) )
 && ( (this.getSumNumberOfBytesWrite()==castOther.getSumNumberOfBytesWrite()) || ( this.getSumNumberOfBytesWrite()!=null && castOther.getSumNumberOfBytesWrite()!=null && this.getSumNumberOfBytesWrite().equals(castOther.getSumNumberOfBytesWrite()) ) )
 && ( (this.getSumTimerWrite()==castOther.getSumTimerWrite()) || ( this.getSumTimerWrite()!=null && castOther.getSumTimerWrite()!=null && this.getSumTimerWrite().equals(castOther.getSumTimerWrite()) ) )
 && ( (this.getCountMisc()==castOther.getCountMisc()) || ( this.getCountMisc()!=null && castOther.getCountMisc()!=null && this.getCountMisc().equals(castOther.getCountMisc()) ) )
 && ( (this.getSumTimerMisc()==castOther.getSumTimerMisc()) || ( this.getSumTimerMisc()!=null && castOther.getSumTimerMisc()!=null && this.getSumTimerMisc().equals(castOther.getSumTimerMisc()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTableSchema() == null ? 0 : this.getTableSchema().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getCountRead() == null ? 0 : this.getCountRead().hashCode() );
         result = 37 * result + ( getSumNumberOfBytesRead() == null ? 0 : this.getSumNumberOfBytesRead().hashCode() );
         result = 37 * result + ( getSumTimerRead() == null ? 0 : this.getSumTimerRead().hashCode() );
         result = 37 * result + ( getCountWrite() == null ? 0 : this.getCountWrite().hashCode() );
         result = 37 * result + ( getSumNumberOfBytesWrite() == null ? 0 : this.getSumNumberOfBytesWrite().hashCode() );
         result = 37 * result + ( getSumTimerWrite() == null ? 0 : this.getSumTimerWrite().hashCode() );
         result = 37 * result + ( getCountMisc() == null ? 0 : this.getCountMisc().hashCode() );
         result = 37 * result + ( getSumTimerMisc() == null ? 0 : this.getSumTimerMisc().hashCode() );
         return result;
   }   


}

