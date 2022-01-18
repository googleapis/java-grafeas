// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/package.proto

package io.grafeas.v1;

public interface VersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used to correct mistakes in the version numbering scheme.
   * </pre>
   *
   * <code>int32 epoch = 1;</code>
   * @return The epoch.
   */
  int getEpoch();

  /**
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString
      getRevisionBytes();

  /**
   * <pre>
   * Whether this version is specifying part of an inclusive range. Grafeas
   * does not have the capability to specify version ranges; instead we have
   * fields that specify start version and end versions. At times this is
   * insufficient - we also need to specify whether the version is included in
   * the range or is excluded from the range. This boolean is expected to be set
   * to true when the version is included in a range.
   * </pre>
   *
   * <code>bool inclusive = 6;</code>
   * @return The inclusive.
   */
  boolean getInclusive();

  /**
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1.Version.VersionKind kind = 4;</code>
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1.Version.VersionKind kind = 4;</code>
   * @return The kind.
   */
  io.grafeas.v1.Version.VersionKind getKind();

  /**
   * <pre>
   * Human readable version string. This string is of the form
   * &lt;epoch&gt;:&lt;name&gt;-&lt;revision&gt; and is only set when kind is NORMAL.
   * </pre>
   *
   * <code>string full_name = 5;</code>
   * @return The fullName.
   */
  java.lang.String getFullName();
  /**
   * <pre>
   * Human readable version string. This string is of the form
   * &lt;epoch&gt;:&lt;name&gt;-&lt;revision&gt; and is only set when kind is NORMAL.
   * </pre>
   *
   * <code>string full_name = 5;</code>
   * @return The bytes for fullName.
   */
  com.google.protobuf.ByteString
      getFullNameBytes();
}
