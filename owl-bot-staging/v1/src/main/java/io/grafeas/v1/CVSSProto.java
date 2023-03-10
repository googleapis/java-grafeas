// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/cvss.proto

package io.grafeas.v1;

public final class CVSSProto {
  private CVSSProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_CVSSv3_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_CVSSv3_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1_CVSS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_CVSS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025grafeas/v1/cvss.proto\022\ngrafeas.v1\"\305\t\n\006" +
      "CVSSv3\022\022\n\nbase_score\030\001 \001(\002\022\034\n\024exploitabi" +
      "lity_score\030\002 \001(\002\022\024\n\014impact_score\030\003 \001(\002\0226" +
      "\n\rattack_vector\030\005 \001(\0162\037.grafeas.v1.CVSSv" +
      "3.AttackVector\022>\n\021attack_complexity\030\006 \001(" +
      "\0162#.grafeas.v1.CVSSv3.AttackComplexity\022B" +
      "\n\023privileges_required\030\007 \001(\0162%.grafeas.v1" +
      ".CVSSv3.PrivilegesRequired\022<\n\020user_inter" +
      "action\030\010 \001(\0162\".grafeas.v1.CVSSv3.UserInt" +
      "eraction\022\'\n\005scope\030\t \001(\0162\030.grafeas.v1.CVS" +
      "Sv3.Scope\0229\n\026confidentiality_impact\030\n \001(" +
      "\0162\031.grafeas.v1.CVSSv3.Impact\0223\n\020integrit" +
      "y_impact\030\013 \001(\0162\031.grafeas.v1.CVSSv3.Impac" +
      "t\0226\n\023availability_impact\030\014 \001(\0162\031.grafeas" +
      ".v1.CVSSv3.Impact\"\231\001\n\014AttackVector\022\035\n\031AT" +
      "TACK_VECTOR_UNSPECIFIED\020\000\022\031\n\025ATTACK_VECT" +
      "OR_NETWORK\020\001\022\032\n\026ATTACK_VECTOR_ADJACENT\020\002" +
      "\022\027\n\023ATTACK_VECTOR_LOCAL\020\003\022\032\n\026ATTACK_VECT" +
      "OR_PHYSICAL\020\004\"l\n\020AttackComplexity\022!\n\035ATT" +
      "ACK_COMPLEXITY_UNSPECIFIED\020\000\022\031\n\025ATTACK_C" +
      "OMPLEXITY_LOW\020\001\022\032\n\026ATTACK_COMPLEXITY_HIG" +
      "H\020\002\"\222\001\n\022PrivilegesRequired\022#\n\037PRIVILEGES" +
      "_REQUIRED_UNSPECIFIED\020\000\022\034\n\030PRIVILEGES_RE" +
      "QUIRED_NONE\020\001\022\033\n\027PRIVILEGES_REQUIRED_LOW" +
      "\020\002\022\034\n\030PRIVILEGES_REQUIRED_HIGH\020\003\"m\n\017User" +
      "Interaction\022 \n\034USER_INTERACTION_UNSPECIF" +
      "IED\020\000\022\031\n\025USER_INTERACTION_NONE\020\001\022\035\n\031USER" +
      "_INTERACTION_REQUIRED\020\002\"F\n\005Scope\022\025\n\021SCOP" +
      "E_UNSPECIFIED\020\000\022\023\n\017SCOPE_UNCHANGED\020\001\022\021\n\r" +
      "SCOPE_CHANGED\020\002\"R\n\006Impact\022\026\n\022IMPACT_UNSP" +
      "ECIFIED\020\000\022\017\n\013IMPACT_HIGH\020\001\022\016\n\nIMPACT_LOW" +
      "\020\002\022\017\n\013IMPACT_NONE\020\003\"\360\n\n\004CVSS\022\022\n\nbase_sco" +
      "re\030\001 \001(\002\022\034\n\024exploitability_score\030\002 \001(\002\022\024" +
      "\n\014impact_score\030\003 \001(\002\0224\n\rattack_vector\030\004 " +
      "\001(\0162\035.grafeas.v1.CVSS.AttackVector\022<\n\021at" +
      "tack_complexity\030\005 \001(\0162!.grafeas.v1.CVSS." +
      "AttackComplexity\0227\n\016authentication\030\006 \001(\016" +
      "2\037.grafeas.v1.CVSS.Authentication\022@\n\023pri" +
      "vileges_required\030\007 \001(\0162#.grafeas.v1.CVSS" +
      ".PrivilegesRequired\022:\n\020user_interaction\030" +
      "\010 \001(\0162 .grafeas.v1.CVSS.UserInteraction\022" +
      "%\n\005scope\030\t \001(\0162\026.grafeas.v1.CVSS.Scope\0227" +
      "\n\026confidentiality_impact\030\n \001(\0162\027.grafeas" +
      ".v1.CVSS.Impact\0221\n\020integrity_impact\030\013 \001(" +
      "\0162\027.grafeas.v1.CVSS.Impact\0224\n\023availabili" +
      "ty_impact\030\014 \001(\0162\027.grafeas.v1.CVSS.Impact" +
      "\"\231\001\n\014AttackVector\022\035\n\031ATTACK_VECTOR_UNSPE" +
      "CIFIED\020\000\022\031\n\025ATTACK_VECTOR_NETWORK\020\001\022\032\n\026A" +
      "TTACK_VECTOR_ADJACENT\020\002\022\027\n\023ATTACK_VECTOR" +
      "_LOCAL\020\003\022\032\n\026ATTACK_VECTOR_PHYSICAL\020\004\"l\n\020" +
      "AttackComplexity\022!\n\035ATTACK_COMPLEXITY_UN" +
      "SPECIFIED\020\000\022\031\n\025ATTACK_COMPLEXITY_LOW\020\001\022\032" +
      "\n\026ATTACK_COMPLEXITY_HIGH\020\002\"\201\001\n\016Authentic" +
      "ation\022\036\n\032AUTHENTICATION_UNSPECIFIED\020\000\022\033\n" +
      "\027AUTHENTICATION_MULTIPLE\020\001\022\031\n\025AUTHENTICA" +
      "TION_SINGLE\020\002\022\027\n\023AUTHENTICATION_NONE\020\003\"\222" +
      "\001\n\022PrivilegesRequired\022#\n\037PRIVILEGES_REQU" +
      "IRED_UNSPECIFIED\020\000\022\034\n\030PRIVILEGES_REQUIRE" +
      "D_NONE\020\001\022\033\n\027PRIVILEGES_REQUIRED_LOW\020\002\022\034\n" +
      "\030PRIVILEGES_REQUIRED_HIGH\020\003\"m\n\017UserInter" +
      "action\022 \n\034USER_INTERACTION_UNSPECIFIED\020\000" +
      "\022\031\n\025USER_INTERACTION_NONE\020\001\022\035\n\031USER_INTE" +
      "RACTION_REQUIRED\020\002\"F\n\005Scope\022\025\n\021SCOPE_UNS" +
      "PECIFIED\020\000\022\023\n\017SCOPE_UNCHANGED\020\001\022\021\n\rSCOPE" +
      "_CHANGED\020\002\"R\n\006Impact\022\026\n\022IMPACT_UNSPECIFI" +
      "ED\020\000\022\017\n\013IMPACT_HIGH\020\001\022\016\n\nIMPACT_LOW\020\002\022\017\n" +
      "\013IMPACT_NONE\020\003*S\n\013CVSSVersion\022\034\n\030CVSS_VE" +
      "RSION_UNSPECIFIED\020\000\022\022\n\016CVSS_VERSION_2\020\001\022" +
      "\022\n\016CVSS_VERSION_3\020\002B\\\n\rio.grafeas.v1B\tCV" +
      "SSProtoP\001Z8google.golang.org/genproto/go" +
      "ogleapis/grafeas/v1;grafeas\242\002\003GRAb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grafeas_v1_CVSSv3_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_CVSSv3_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_CVSSv3_descriptor,
        new java.lang.String[] { "BaseScore", "ExploitabilityScore", "ImpactScore", "AttackVector", "AttackComplexity", "PrivilegesRequired", "UserInteraction", "Scope", "ConfidentialityImpact", "IntegrityImpact", "AvailabilityImpact", });
    internal_static_grafeas_v1_CVSS_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_CVSS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1_CVSS_descriptor,
        new java.lang.String[] { "BaseScore", "ExploitabilityScore", "ImpactScore", "AttackVector", "AttackComplexity", "Authentication", "PrivilegesRequired", "UserInteraction", "Scope", "ConfidentialityImpact", "IntegrityImpact", "AvailabilityImpact", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
