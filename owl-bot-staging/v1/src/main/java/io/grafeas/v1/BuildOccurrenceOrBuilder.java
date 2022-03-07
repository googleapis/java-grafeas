// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/build.proto

package io.grafeas.v1;

public interface BuildOccurrenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.BuildOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildProvenance provenance = 1;</code>
   * @return Whether the provenance field is set.
   */
  boolean hasProvenance();
  /**
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildProvenance provenance = 1;</code>
   * @return The provenance.
   */
  io.grafeas.v1.BuildProvenance getProvenance();
  /**
   * <pre>
   * The actual provenance for the build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildProvenance provenance = 1;</code>
   */
  io.grafeas.v1.BuildProvenanceOrBuilder getProvenanceOrBuilder();

  /**
   * <pre>
   * Serialized JSON representation of the provenance, used in generating the
   * build signature in the corresponding build note. After verifying the
   * signature, `provenance_bytes` can be unmarshalled and compared to the
   * provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order
   * to interoperate with openssl which expects this format for signature
   * verification.
   * The serialized form is captured both to avoid ambiguity in how the
   * provenance is marshalled to json as well to prevent incompatibilities with
   * future changes.
   * </pre>
   *
   * <code>string provenance_bytes = 2;</code>
   * @return The provenanceBytes.
   */
  java.lang.String getProvenanceBytes();
  /**
   * <pre>
   * Serialized JSON representation of the provenance, used in generating the
   * build signature in the corresponding build note. After verifying the
   * signature, `provenance_bytes` can be unmarshalled and compared to the
   * provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order
   * to interoperate with openssl which expects this format for signature
   * verification.
   * The serialized form is captured both to avoid ambiguity in how the
   * provenance is marshalled to json as well to prevent incompatibilities with
   * future changes.
   * </pre>
   *
   * <code>string provenance_bytes = 2;</code>
   * @return The bytes for provenanceBytes.
   */
  com.google.protobuf.ByteString
      getProvenanceBytesBytes();

  /**
   * <pre>
   * Deprecated. See InTotoStatement for the replacement.
   * In-toto Provenance representation as defined in spec.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoProvenance intoto_provenance = 3;</code>
   * @return Whether the intotoProvenance field is set.
   */
  boolean hasIntotoProvenance();
  /**
   * <pre>
   * Deprecated. See InTotoStatement for the replacement.
   * In-toto Provenance representation as defined in spec.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoProvenance intoto_provenance = 3;</code>
   * @return The intotoProvenance.
   */
  io.grafeas.v1.InTotoProvenance getIntotoProvenance();
  /**
   * <pre>
   * Deprecated. See InTotoStatement for the replacement.
   * In-toto Provenance representation as defined in spec.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoProvenance intoto_provenance = 3;</code>
   */
  io.grafeas.v1.InTotoProvenanceOrBuilder getIntotoProvenanceOrBuilder();

  /**
   * <pre>
   * In-toto Statement representation as defined in spec.
   * The intoto_statement can contain any type of provenance. The serialized
   * payload of the statement can be stored and signed in the Occurrence's
   * envelope.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoStatement intoto_statement = 4;</code>
   * @return Whether the intotoStatement field is set.
   */
  boolean hasIntotoStatement();
  /**
   * <pre>
   * In-toto Statement representation as defined in spec.
   * The intoto_statement can contain any type of provenance. The serialized
   * payload of the statement can be stored and signed in the Occurrence's
   * envelope.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoStatement intoto_statement = 4;</code>
   * @return The intotoStatement.
   */
  io.grafeas.v1.InTotoStatement getIntotoStatement();
  /**
   * <pre>
   * In-toto Statement representation as defined in spec.
   * The intoto_statement can contain any type of provenance. The serialized
   * payload of the statement can be stored and signed in the Occurrence's
   * envelope.
   * </pre>
   *
   * <code>.grafeas.v1.InTotoStatement intoto_statement = 4;</code>
   */
  io.grafeas.v1.InTotoStatementOrBuilder getIntotoStatementOrBuilder();
}
