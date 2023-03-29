// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/vex.proto

package io.grafeas.v1;

public final class Vex {
  private Vex() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Publisher_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Publisher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Justification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Justification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Remediation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Remediation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024grafeas/v1/vex.proto\022\ngrafeas.v1\032\027graf" +
      "eas/v1/common.proto\"\252\r\n\033VulnerabilityAss" +
      "essmentNote\022\r\n\005title\030\001 \001(\t\022\031\n\021short_desc" +
      "ription\030\002 \001(\t\022\030\n\020long_description\030\003 \001(\t\022" +
      "\025\n\rlanguage_code\030\004 \001(\t\022D\n\tpublisher\030\005 \001(" +
      "\01321.grafeas.v1.VulnerabilityAssessmentNo" +
      "te.Publisher\022@\n\007product\030\006 \001(\0132/.grafeas." +
      "v1.VulnerabilityAssessmentNote.Product\022F" +
      "\n\nassessment\030\007 \001(\01322.grafeas.v1.Vulnerab" +
      "ilityAssessmentNote.Assessment\032Q\n\tPublis" +
      "her\022\014\n\004name\030\001 \001(\t\022\031\n\021issuing_authority\030\002" +
      " \001(\t\022\033\n\023publisher_namespace\030\003 \001(\t\032H\n\007Pro" +
      "duct\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022\025\n\013generi" +
      "c_uri\030\003 \001(\tH\000B\014\n\nidentifier\032\302\t\n\nAssessme" +
      "nt\022\013\n\003cve\030\001 \001(\t\022\031\n\021short_description\030\002 \001" +
      "(\t\022\030\n\020long_description\030\003 \001(\t\022,\n\014related_" +
      "uris\030\004 \003(\0132\026.grafeas.v1.RelatedUrl\022G\n\005st" +
      "ate\030\005 \001(\01628.grafeas.v1.VulnerabilityAsse" +
      "ssmentNote.Assessment.State\022\017\n\007impacts\030\006" +
      " \003(\t\022W\n\rjustification\030\007 \001(\0132@.grafeas.v1" +
      ".VulnerabilityAssessmentNote.Assessment." +
      "Justification\022T\n\014remediations\030\010 \003(\0132>.gr" +
      "afeas.v1.VulnerabilityAssessmentNote.Ass" +
      "essment.Remediation\032\214\003\n\rJustification\022n\n" +
      "\022justification_type\030\001 \001(\0162R.grafeas.v1.V" +
      "ulnerabilityAssessmentNote.Assessment.Ju" +
      "stification.JustificationType\022\017\n\007details" +
      "\030\002 \001(\t\"\371\001\n\021JustificationType\022\"\n\036JUSTIFIC" +
      "ATION_TYPE_UNSPECIFIED\020\000\022\031\n\025COMPONENT_NO" +
      "T_PRESENT\020\001\022\037\n\033VULNERABLE_CODE_NOT_PRESE" +
      "NT\020\002\022\'\n#VULNERABLE_CODE_NOT_IN_EXECUTE_P" +
      "ATH\020\003\0225\n1VULNERABLE_CODE_CANNOT_BE_CONTR" +
      "OLLED_BY_ADVERSARY\020\004\022$\n INLINE_MITIGATIO" +
      "NS_ALREADY_EXIST\020\005\032\307\002\n\013Remediation\022h\n\020re" +
      "mediation_type\030\001 \001(\0162N.grafeas.v1.Vulner" +
      "abilityAssessmentNote.Assessment.Remedia" +
      "tion.RemediationType\022\017\n\007details\030\002 \001(\t\022/\n" +
      "\017remediation_uri\030\003 \001(\0132\026.grafeas.v1.Rela" +
      "tedUrl\"\213\001\n\017RemediationType\022 \n\034REMEDIATIO" +
      "N_TYPE_UNSPECIFIED\020\000\022\016\n\nMITIGATION\020\001\022\022\n\016" +
      "NO_FIX_PLANNED\020\002\022\022\n\016NONE_AVAILABLE\020\003\022\016\n\n" +
      "VENDOR_FIX\020\004\022\016\n\nWORKAROUND\020\005\"b\n\005State\022\025\n" +
      "\021STATE_UNSPECIFIED\020\000\022\014\n\010AFFECTED\020\001\022\020\n\014NO" +
      "T_AFFECTED\020\002\022\t\n\005FIXED\020\003\022\027\n\023UNDER_INVESTI" +
      "GATION\020\004BQ\n\rio.grafeas.v1P\001Z8google.gola" +
      "ng.org/genproto/googleapis/grafeas/v1;gr" +
      "afeas\242\002\003GRAb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grafeas.v1.Common.getDescriptor(),
        });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor,
        new java.lang.String[] { "Title", "ShortDescription", "LongDescription", "LanguageCode", "Publisher", "Product", "Assessment", });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Publisher_descriptor =
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Publisher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_Publisher_descriptor,
        new java.lang.String[] { "Name", "IssuingAuthority", "PublisherNamespace", });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Product_descriptor =
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor.getNestedTypes().get(1);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_Product_descriptor,
        new java.lang.String[] { "Name", "Id", "GenericUri", "Identifier", });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_descriptor =
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_descriptor.getNestedTypes().get(2);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_descriptor,
        new java.lang.String[] { "Cve", "ShortDescription", "LongDescription", "RelatedUris", "State", "Impacts", "Justification", "Remediations", });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Justification_descriptor =
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Justification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Justification_descriptor,
        new java.lang.String[] { "JustificationType", "Details", });
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Remediation_descriptor =
      internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_descriptor.getNestedTypes().get(1);
    internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Remediation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_VulnerabilityAssessmentNote_Assessment_Remediation_descriptor,
        new java.lang.String[] { "RemediationType", "Details", "RemediationUri", });
    io.grafeas.v1.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
