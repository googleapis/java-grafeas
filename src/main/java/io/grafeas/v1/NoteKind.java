/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/common.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Kind represents the kinds of notes supported.
 * </pre>
 *
 * Protobuf enum {@code grafeas.v1.NoteKind}
 */
public enum NoteKind implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>NOTE_KIND_UNSPECIFIED = 0;</code>
   */
  NOTE_KIND_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The note and occurrence represent a package vulnerability.
   * </pre>
   *
   * <code>VULNERABILITY = 1;</code>
   */
  VULNERABILITY(1),
  /**
   *
   *
   * <pre>
   * The note and occurrence assert build provenance.
   * </pre>
   *
   * <code>BUILD = 2;</code>
   */
  BUILD(2),
  /**
   *
   *
   * <pre>
   * This represents an image basis relationship.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  IMAGE(3),
  /**
   *
   *
   * <pre>
   * This represents a package installed via a package manager.
   * </pre>
   *
   * <code>PACKAGE = 4;</code>
   */
  PACKAGE(4),
  /**
   *
   *
   * <pre>
   * The note and occurrence track deployment events.
   * </pre>
   *
   * <code>DEPLOYMENT = 5;</code>
   */
  DEPLOYMENT(5),
  /**
   *
   *
   * <pre>
   * The note and occurrence track the initial discovery status of a resource.
   * </pre>
   *
   * <code>DISCOVERY = 6;</code>
   */
  DISCOVERY(6),
  /**
   *
   *
   * <pre>
   * This represents a logical "role" that can attest to artifacts.
   * </pre>
   *
   * <code>ATTESTATION = 7;</code>
   */
  ATTESTATION(7),
  /**
   *
   *
   * <pre>
   * This represents an available package upgrade.
   * </pre>
   *
   * <code>UPGRADE = 8;</code>
   */
  UPGRADE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown.
   * </pre>
   *
   * <code>NOTE_KIND_UNSPECIFIED = 0;</code>
   */
  public static final int NOTE_KIND_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The note and occurrence represent a package vulnerability.
   * </pre>
   *
   * <code>VULNERABILITY = 1;</code>
   */
  public static final int VULNERABILITY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The note and occurrence assert build provenance.
   * </pre>
   *
   * <code>BUILD = 2;</code>
   */
  public static final int BUILD_VALUE = 2;
  /**
   *
   *
   * <pre>
   * This represents an image basis relationship.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  public static final int IMAGE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * This represents a package installed via a package manager.
   * </pre>
   *
   * <code>PACKAGE = 4;</code>
   */
  public static final int PACKAGE_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The note and occurrence track deployment events.
   * </pre>
   *
   * <code>DEPLOYMENT = 5;</code>
   */
  public static final int DEPLOYMENT_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The note and occurrence track the initial discovery status of a resource.
   * </pre>
   *
   * <code>DISCOVERY = 6;</code>
   */
  public static final int DISCOVERY_VALUE = 6;
  /**
   *
   *
   * <pre>
   * This represents a logical "role" that can attest to artifacts.
   * </pre>
   *
   * <code>ATTESTATION = 7;</code>
   */
  public static final int ATTESTATION_VALUE = 7;
  /**
   *
   *
   * <pre>
   * This represents an available package upgrade.
   * </pre>
   *
   * <code>UPGRADE = 8;</code>
   */
  public static final int UPGRADE_VALUE = 8;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static NoteKind valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NoteKind forNumber(int value) {
    switch (value) {
      case 0:
        return NOTE_KIND_UNSPECIFIED;
      case 1:
        return VULNERABILITY;
      case 2:
        return BUILD;
      case 3:
        return IMAGE;
      case 4:
        return PACKAGE;
      case 5:
        return DEPLOYMENT;
      case 6:
        return DISCOVERY;
      case 7:
        return ATTESTATION;
      case 8:
        return UPGRADE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NoteKind> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NoteKind> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<NoteKind>() {
        public NoteKind findValueByNumber(int number) {
          return NoteKind.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return io.grafeas.v1.Common.getDescriptor().getEnumTypes().get(0);
  }

  private static final NoteKind[] VALUES = values();

  public static NoteKind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NoteKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grafeas.v1.NoteKind)
}
