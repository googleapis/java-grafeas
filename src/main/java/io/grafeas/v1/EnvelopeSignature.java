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

/** Protobuf type {@code grafeas.v1.EnvelopeSignature} */
public final class EnvelopeSignature extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.EnvelopeSignature)
    EnvelopeSignatureOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EnvelopeSignature.newBuilder() to construct.
  private EnvelopeSignature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EnvelopeSignature() {
    sig_ = com.google.protobuf.ByteString.EMPTY;
    keyid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EnvelopeSignature();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_EnvelopeSignature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_EnvelopeSignature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.EnvelopeSignature.class, io.grafeas.v1.EnvelopeSignature.Builder.class);
  }

  public static final int SIG_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sig_;
  /**
   * <code>bytes sig = 1;</code>
   *
   * @return The sig.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSig() {
    return sig_;
  }

  public static final int KEYID_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyid_;
  /**
   * <code>string keyid = 2;</code>
   *
   * @return The keyid.
   */
  @java.lang.Override
  public java.lang.String getKeyid() {
    java.lang.Object ref = keyid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyid_ = s;
      return s;
    }
  }
  /**
   * <code>string keyid = 2;</code>
   *
   * @return The bytes for keyid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyidBytes() {
    java.lang.Object ref = keyid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!sig_.isEmpty()) {
      output.writeBytes(1, sig_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!sig_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, sig_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyid_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.EnvelopeSignature)) {
      return super.equals(obj);
    }
    io.grafeas.v1.EnvelopeSignature other = (io.grafeas.v1.EnvelopeSignature) obj;

    if (!getSig().equals(other.getSig())) return false;
    if (!getKeyid().equals(other.getKeyid())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SIG_FIELD_NUMBER;
    hash = (53 * hash) + getSig().hashCode();
    hash = (37 * hash) + KEYID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.EnvelopeSignature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.EnvelopeSignature parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.EnvelopeSignature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1.EnvelopeSignature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code grafeas.v1.EnvelopeSignature} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.EnvelopeSignature)
      io.grafeas.v1.EnvelopeSignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_EnvelopeSignature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_EnvelopeSignature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.EnvelopeSignature.class, io.grafeas.v1.EnvelopeSignature.Builder.class);
    }

    // Construct using io.grafeas.v1.EnvelopeSignature.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      sig_ = com.google.protobuf.ByteString.EMPTY;

      keyid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_EnvelopeSignature_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.EnvelopeSignature getDefaultInstanceForType() {
      return io.grafeas.v1.EnvelopeSignature.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.EnvelopeSignature build() {
      io.grafeas.v1.EnvelopeSignature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.EnvelopeSignature buildPartial() {
      io.grafeas.v1.EnvelopeSignature result = new io.grafeas.v1.EnvelopeSignature(this);
      result.sig_ = sig_;
      result.keyid_ = keyid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1.EnvelopeSignature) {
        return mergeFrom((io.grafeas.v1.EnvelopeSignature) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.EnvelopeSignature other) {
      if (other == io.grafeas.v1.EnvelopeSignature.getDefaultInstance()) return this;
      if (other.getSig() != com.google.protobuf.ByteString.EMPTY) {
        setSig(other.getSig());
      }
      if (!other.getKeyid().isEmpty()) {
        keyid_ = other.keyid_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                sig_ = input.readBytes();

                break;
              } // case 10
            case 18:
              {
                keyid_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.ByteString sig_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sig = 1;</code>
     *
     * @return The sig.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSig() {
      return sig_;
    }
    /**
     * <code>bytes sig = 1;</code>
     *
     * @param value The sig to set.
     * @return This builder for chaining.
     */
    public Builder setSig(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      sig_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes sig = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSig() {

      sig_ = getDefaultInstance().getSig();
      onChanged();
      return this;
    }

    private java.lang.Object keyid_ = "";
    /**
     * <code>string keyid = 2;</code>
     *
     * @return The keyid.
     */
    public java.lang.String getKeyid() {
      java.lang.Object ref = keyid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string keyid = 2;</code>
     *
     * @return The bytes for keyid.
     */
    public com.google.protobuf.ByteString getKeyidBytes() {
      java.lang.Object ref = keyid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string keyid = 2;</code>
     *
     * @param value The keyid to set.
     * @return This builder for chaining.
     */
    public Builder setKeyid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string keyid = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyid() {

      keyid_ = getDefaultInstance().getKeyid();
      onChanged();
      return this;
    }
    /**
     * <code>string keyid = 2;</code>
     *
     * @param value The bytes for keyid to set.
     * @return This builder for chaining.
     */
    public Builder setKeyidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      keyid_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1.EnvelopeSignature)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.EnvelopeSignature)
  private static final io.grafeas.v1.EnvelopeSignature DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.EnvelopeSignature();
  }

  public static io.grafeas.v1.EnvelopeSignature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnvelopeSignature> PARSER =
      new com.google.protobuf.AbstractParser<EnvelopeSignature>() {
        @java.lang.Override
        public EnvelopeSignature parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<EnvelopeSignature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnvelopeSignature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.EnvelopeSignature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
