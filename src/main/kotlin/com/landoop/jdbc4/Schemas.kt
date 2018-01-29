package com.landoop.jdbc4

import org.apache.avro.SchemaBuilder
import java.sql.DatabaseMetaData

object Schemas {

  val TypeInfo = SchemaBuilder.builder().record("type_info")
      .fields()
      .requiredString("TYPE_NAME")
      .requiredInt("DATA_TYPE")
      .requiredInt("PRECISION")
      .optionalString("LITERAL_PREFIX")
      .optionalString("LITERAL_SUFFIX")
      .optionalString("CREATE_PARAMS")
      .requiredInt("NULLABLE")
      .requiredInt("CASE_SENSITIVE")
      .requiredInt("SEARCHABLE")
      .requiredBoolean("UNSIGNED_ATTRIBUTE")
      .requiredBoolean("FIXED_PREC_SCALE")
      .requiredBoolean("AUTO_INCREMENT")
      .optionalString("LOCAL_TYPE_NAME")
      .requiredInt("MINIMUM_SCALE")
      .requiredInt("MAXIMUM_SCALE")
      .requiredInt("SQL_DATA_TYPE")
      .requiredInt("SQL_DATETIME_SUB")
      .requiredInt("NUM_PREC_RADIX")
      .endRecord()

  val Schemas = SchemaBuilder.builder().record("schemas")
      .fields()
      .nullableString("TABLE_SCHEM", null)
      .nullableString("TABLE_CATALOG", null)
      .endRecord()

  val VersionColumns = SchemaBuilder.builder().record("version_columns")
      .fields()
      .requiredInt("SCOPE")
      .requiredString("COLUMN_NAME")
      .requiredInt("DATA_TYPE")
      .requiredString("TYPE_NAME")
      .requiredInt("COLUMN_SIZE")
      .requiredInt("BUFFER_LENGTH")
      .optionalInt("DECIMAL_DIGITS")
      .requiredInt("PSEUDO_COLUMN")
      .endRecord()

  val TableTypes = SchemaBuilder.builder().record("table_types")
      .fields()
      .nullableString("TABLE_TYPE", null)
      .endRecord()

  val Tables = SchemaBuilder.builder().record("tables")
      .fields()
      .requiredString("TABLE_CAT")
      .requiredString("TABLE_SCHEM")
      .requiredString("TABLE_NAME")
      .requiredString("TABLE_TYPE")
      .nullableString("REMARKS", null)
      .nullableString("TYPE_NAME", null)
      .nullableString("REF_GENERATION", null)
      .endRecord()

  val Attributes = SchemaBuilder.builder()
      .record("attributes")
      .fields()
      .optionalString("TYPE_CAT")
      .optionalString("TYPE_SCHEM")
      .requiredString("TYPE_NAME")
      .requiredString("ATTR_NAME")
      .requiredInt("DATA_TYPE")
      .requiredString("ATTR_TYPE_NAME")
      .requiredInt("ATTR_SIZE")
      .optionalInt("DECIMAL_DIGITS")
      .requiredInt("NUM_PREC_RADIX")
      .requiredInt("NULLABLE")
      .optionalString("REMARKS")
      .optionalString("ATTR_DEF")
      .requiredInt("SQL_DATA_TYPE")
      .requiredInt("SQL_DATETIME_SUB")
      .requiredInt("CHAR_OCTET_LENGTH")
      .requiredInt("ORDINAL_POSITION")
      .requiredString("IS_NULLABLE")
      .optionalString("SCOPE_CATALOG")
      .optionalString("SCOPE_SCHEMA")
      .optionalString("SCOPE_TABLE")
      .optionalInt("SOURCE_DATA_TYPE")
      .endRecord()


  val CrossReference = SchemaBuilder.builder()
      .record("cross_reference")
      .fields()
      .nullableString("PKTABLE_CAT", null)
      .nullableString("PKTABLE_SCHEM", null)
      .requiredString("PKTABLE_NAME")
      .requiredString("PKCOLUMN_NAME")
      .nullableString("FKTABLE_CAT", null)
      .nullableString("FKTABLE_SCHEM", null)
      .requiredString("FKTABLE_NAME")
      .requiredString("FKCOLUMN_NAME")
      .requiredInt("KEY_SEQ")
      .requiredInt("UPDATE_RULE")
      .requiredInt("DELETE_RULE")
      .nullableString("FK_NAME", null)
      .nullableString("PK_NAME", null)
      .requiredInt("DEFERRABILITY")
      .endRecord()

  val Columns = SchemaBuilder.builder().record("columns")
      .fields()
      .optionalString("TABLE_CAT")
      .optionalString("TABLE_SCHEM")
      .requiredString("TABLE_NAME")
      .requiredString("COLUMN_NAME")
      .requiredString("DATA_TYPE")
      .requiredString("TYPE_NAME")
      .requiredInt("COLUMN_SIZE")
      .requiredInt("BUFFER_LENGTH")
      .nullableInt("DECIMAL_DIGITS", 0)
      .nullableInt("NUM_PREC_RADIX", 10)
      .requiredInt("NULLABLE")
      .nullableString("REMARKS", null)
      .nullableString("COLUMN_DEF", null)
      .nullableString("SQL_DATA_TYPE", null)
      .nullableString("SQL_DATETIME_SUB", null)
      .nullableString("CHAR_OCTET_LENGTH", null)
      .requiredInt("ORDINAL_POSITION")
      .requiredString("IS_NULLABLE")
      .optionalString("SCOPE_CATALOG")
      .optionalString("SCOPE_SCHEMA")
      .optionalString("SCOPE_TABLE")
      .optionalString("SOURCE_DATA_TYPE")
      .requiredString("IS_AUTOINCREMENT")
      .requiredString("IS_GENERATEDCOLUMN")
      .endRecord()

  val Procedures = SchemaBuilder.builder().record("procedures")
      .fields()
      .optionalString("PROCEDURE_CAT")
      .optionalString("PROCEDURE_SCHEM")
      .optionalString("PROCEDURE_NAME")
      .optionalString("REMARKS")
      .nullableInt("PROCEDURE_TYPE", DatabaseMetaData.procedureResultUnknown)
      .optionalString("SPECIFIC_NAME")
      .endRecord()

  val ProcedureColumns = SchemaBuilder.builder().record("procedures")
      .fields()
      .optionalString("PROCEDURE_CAT")
      .optionalString("PROCEDURE_SCHEM")
      .requiredString("PROCEDURE_NAME")
      .requiredString("COLUMN_NAME")
      .requiredInt("COLUMN_TYPE")
      .requiredInt("DATA_TYPE")
      .requiredString("TYPE_NAME")
      .requiredInt("DATA_TYPE")
      .requiredInt("PRECISION")
      .requiredInt("LENGTH")
      .optionalInt("SCALE")
      .requiredInt("RADIX")
      .requiredInt("NULLABLE")
      .optionalString("REMARKS")
      .optionalString("COLUMN_DEF")
      .optionalInt("SQL_DATA_TYPE")
      .optionalInt("SQL_DATETIME_SUB")
      .optionalInt("CHAR_OCTET_LENGTH")
      .requiredInt("ORDINAL_POSITION")
      .optionalString("IS_NULLABLE")
      .requiredString("SPECIFIC_NAME")
      .endRecord()

  val PseudoColumns = SchemaBuilder.builder()
      .record("pseudo_columns")
      .fields()
      .optionalString("TABLE_CAT")
      .optionalString("TABLE_SCHEM")
      .requiredString("TABLE_NAME")
      .requiredString("COLUMN_NAME")
      .requiredInt("DATA_TYPE")
      .requiredInt("COLUMN_SIZE")
      .nullableInt("DECIMAL_DIGITS", 0)
      .requiredInt("NUM_PREC_RADIX")
      .requiredString("COLUMN_USAGE")
      .optionalString("REMARKS")
      .requiredInt("CHAR_OCTET_LENGTH")
      .requiredString("IS_NULLABLE")
      .endRecord()

  val ColumnPrivileges = SchemaBuilder.builder()
      .record("column_privileges")
      .fields()
      .nullableString("TABLE_CAT", null)
      .nullableString("TABLE_SCHEM", null)
      .requiredString("TABLE_NAME")
      .requiredString("COLUMN_NAME")
      .nullableString("GRANTOR", null)
      .requiredString("GRANTEE")
      .requiredString("PRIVILEGE")
      .requiredString("IS_GRANTABLE")
      .endRecord()

  val ImportedKeys = SchemaBuilder.builder()
      .record("imported_keys")
      .fields()
      .nullableString("PKTABLE_CAT", null)
      .nullableString("PKTABLE_SCHEM", null)
      .requiredString("PKTABLE_NAME")
      .requiredString("PKCOLUMN_NAME")
      .nullableString("FKTABLE_CAT", null)
      .nullableString("FKTABLE_SCHEM", null)
      .requiredString("FKTABLE_NAME")
      .requiredString("FKCOLUMN_NAME")
      .requiredInt("KEY_SEQ")
      .requiredInt("UPDATE_RULE")
      .requiredInt("DELETE_RULE")
      .nullableString("FK_NAME", null)
      .nullableString("PK_NAME", null)
      .requiredInt("DEFERRABILITY")
      .endRecord()

  val IndexInfo = SchemaBuilder.builder()
      .record("index_info")
      .fields()
      .nullableString("TABLE_CAT", null)
      .nullableString("TABLE_SCHEM", null)
      .requiredString("TABLE_NAME")
      .requiredBoolean("NON_UNIQUE")
      .nullableString("INDEX_QUALIFIER", null)
      .requiredString("TYPE")
      .requiredInt("ORDINAL_POSITION")
      .nullableString("COLUMN_NAME", null)
      .nullableString("ASC_OR_DESC", null)
      .requiredLong("CARDINALITY")
      .requiredLong("PAGES")
      .nullableString("FILTER_CONDITION", null)
      .endRecord()

  val Supertables = SchemaBuilder.builder().record("supertables")
      .fields()
      .nullableString("TABLE_CAT", null)
      .nullableString("TABLE_SCHEM", null)
      .nullableString("TABLE_NAME", null)
      .nullableString("SUPERTABLE_NAME", null)
      .endRecord()

  val Functions = SchemaBuilder.builder()
      .record("functions")
      .fields()
      .nullableString("FUNCTION_CAT", null)
      .nullableString("FUNCTION_SCHEM", null)
      .nullableString("FUNCTION_NAME", null)
      .nullableString("REMARKS", null)
      .nullableInt("FUNCTION_TYPE", DatabaseMetaData.procedureResultUnknown)
      .nullableString("SPECIFIC_NAME", null)
      .endRecord()

  val Catalogs = SchemaBuilder.builder().record("catalogs")
      .fields()
      .nullableString("TABLE_CAT", null)
      .endRecord()

  val PrimaryKeys = SchemaBuilder.builder().record("primarykeys")
      .fields()
      .nullableString("TABLE_CAT", null)
      .nullableString("TABLE_SCHEM", null)
      .nullableString("TABLE_NAME", null)
      .nullableInt("KEY_SEQ", 0)
      .nullableString("PK_NAME", null)
      .endRecord()

  val FunctionColumns = SchemaBuilder.builder().record("function_columns")
      .fields()
      .nullableString("FUNCTION_CAT", null)
      .nullableString("FUNCTION_SCHEM", null)
      .nullableString("FUNCTION_NAME", null)
      .nullableString("COLUMN_NAME", null)
      .nullableInt("COLUMN_TYPE", DatabaseMetaData.procedureColumnIn)
      .nullableInt("DATA_TYPE", java.sql.Types.OTHER)
      .nullableString("SPECIFIC_NAME", null)
      .endRecord()

}