package com.echoes.DTO;
// Generated 23 Jul, 2024 8:38:26 AM by Hibernate Tools 5.0.6.Final

/**
 * SchemaIndexStatisticsId generated by hbm2java
 */
public class SchemaIndexStatisticsId implements java.io.Serializable {

	private String tableSchema;
	private String tableName;
	private String indexName;
	private long rowsSelected;
	private String selectLatency;
	private long rowsInserted;
	private String insertLatency;
	private long rowsUpdated;
	private String updateLatency;
	private long rowsDeleted;
	private String deleteLatency;

	public SchemaIndexStatisticsId() {
	}

	public SchemaIndexStatisticsId(long rowsSelected, long rowsInserted, long rowsUpdated, long rowsDeleted) {
		this.rowsSelected = rowsSelected;
		this.rowsInserted = rowsInserted;
		this.rowsUpdated = rowsUpdated;
		this.rowsDeleted = rowsDeleted;
	}

	public SchemaIndexStatisticsId(String tableSchema, String tableName, String indexName, long rowsSelected,
			String selectLatency, long rowsInserted, String insertLatency, long rowsUpdated, String updateLatency,
			long rowsDeleted, String deleteLatency) {
		this.tableSchema = tableSchema;
		this.tableName = tableName;
		this.indexName = indexName;
		this.rowsSelected = rowsSelected;
		this.selectLatency = selectLatency;
		this.rowsInserted = rowsInserted;
		this.insertLatency = insertLatency;
		this.rowsUpdated = rowsUpdated;
		this.updateLatency = updateLatency;
		this.rowsDeleted = rowsDeleted;
		this.deleteLatency = deleteLatency;
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

	public String getIndexName() {
		return this.indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public long getRowsSelected() {
		return this.rowsSelected;
	}

	public void setRowsSelected(long rowsSelected) {
		this.rowsSelected = rowsSelected;
	}

	public String getSelectLatency() {
		return this.selectLatency;
	}

	public void setSelectLatency(String selectLatency) {
		this.selectLatency = selectLatency;
	}

	public long getRowsInserted() {
		return this.rowsInserted;
	}

	public void setRowsInserted(long rowsInserted) {
		this.rowsInserted = rowsInserted;
	}

	public String getInsertLatency() {
		return this.insertLatency;
	}

	public void setInsertLatency(String insertLatency) {
		this.insertLatency = insertLatency;
	}

	public long getRowsUpdated() {
		return this.rowsUpdated;
	}

	public void setRowsUpdated(long rowsUpdated) {
		this.rowsUpdated = rowsUpdated;
	}

	public String getUpdateLatency() {
		return this.updateLatency;
	}

	public void setUpdateLatency(String updateLatency) {
		this.updateLatency = updateLatency;
	}

	public long getRowsDeleted() {
		return this.rowsDeleted;
	}

	public void setRowsDeleted(long rowsDeleted) {
		this.rowsDeleted = rowsDeleted;
	}

	public String getDeleteLatency() {
		return this.deleteLatency;
	}

	public void setDeleteLatency(String deleteLatency) {
		this.deleteLatency = deleteLatency;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchemaIndexStatisticsId))
			return false;
		SchemaIndexStatisticsId castOther = (SchemaIndexStatisticsId) other;

		return ((this.getTableSchema() == castOther.getTableSchema()) || (this.getTableSchema() != null
				&& castOther.getTableSchema() != null && this.getTableSchema().equals(castOther.getTableSchema())))
				&& ((this.getTableName() == castOther.getTableName()) || (this.getTableName() != null
						&& castOther.getTableName() != null && this.getTableName().equals(castOther.getTableName())))
				&& ((this.getIndexName() == castOther.getIndexName()) || (this.getIndexName() != null
						&& castOther.getIndexName() != null && this.getIndexName().equals(castOther.getIndexName())))
				&& (this.getRowsSelected() == castOther.getRowsSelected())
				&& ((this.getSelectLatency() == castOther.getSelectLatency())
						|| (this.getSelectLatency() != null && castOther.getSelectLatency() != null
								&& this.getSelectLatency().equals(castOther.getSelectLatency())))
				&& (this.getRowsInserted() == castOther.getRowsInserted())
				&& ((this.getInsertLatency() == castOther.getInsertLatency())
						|| (this.getInsertLatency() != null && castOther.getInsertLatency() != null
								&& this.getInsertLatency().equals(castOther.getInsertLatency())))
				&& (this.getRowsUpdated() == castOther.getRowsUpdated())
				&& ((this.getUpdateLatency() == castOther.getUpdateLatency())
						|| (this.getUpdateLatency() != null && castOther.getUpdateLatency() != null
								&& this.getUpdateLatency().equals(castOther.getUpdateLatency())))
				&& (this.getRowsDeleted() == castOther.getRowsDeleted())
				&& ((this.getDeleteLatency() == castOther.getDeleteLatency())
						|| (this.getDeleteLatency() != null && castOther.getDeleteLatency() != null
								&& this.getDeleteLatency().equals(castOther.getDeleteLatency())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTableSchema() == null ? 0 : this.getTableSchema().hashCode());
		result = 37 * result + (getTableName() == null ? 0 : this.getTableName().hashCode());
		result = 37 * result + (getIndexName() == null ? 0 : this.getIndexName().hashCode());
		result = 37 * result + (int) this.getRowsSelected();
		result = 37 * result + (getSelectLatency() == null ? 0 : this.getSelectLatency().hashCode());
		result = 37 * result + (int) this.getRowsInserted();
		result = 37 * result + (getInsertLatency() == null ? 0 : this.getInsertLatency().hashCode());
		result = 37 * result + (int) this.getRowsUpdated();
		result = 37 * result + (getUpdateLatency() == null ? 0 : this.getUpdateLatency().hashCode());
		result = 37 * result + (int) this.getRowsDeleted();
		result = 37 * result + (getDeleteLatency() == null ? 0 : this.getDeleteLatency().hashCode());
		return result;
	}

}
