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
// source: grafeas/v1/package.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * This represents a particular package that is distributed over various
 * channels. E.g., glibc (aka libc6) is distributed by many, at various
 * versions.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.PackageNote}
 */
public final class PackageNote extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.PackageNote)
    PackageNoteOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PackageNote.newBuilder() to construct.
  private PackageNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PackageNote() {
    name_ = "";
    distribution_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PackageNote();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PackageNote(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 82:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                distribution_ = new java.util.ArrayList<io.grafeas.v1.Distribution>();
                mutable_bitField0_ |= 0x00000001;
              }
              distribution_.add(
                  input.readMessage(io.grafeas.v1.Distribution.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        distribution_ = java.util.Collections.unmodifiableList(distribution_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageNote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.PackageNote.class, io.grafeas.v1.PackageNote.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISTRIBUTION_FIELD_NUMBER = 10;
  private java.util.List<io.grafeas.v1.Distribution> distribution_;
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1.Distribution> getDistributionList() {
    return distribution_;
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1.DistributionOrBuilder>
      getDistributionOrBuilderList() {
    return distribution_;
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public int getDistributionCount() {
    return distribution_.size();
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.Distribution getDistribution(int index) {
    return distribution_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The various channels by which a package is distributed.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.DistributionOrBuilder getDistributionOrBuilder(int index) {
    return distribution_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < distribution_.size(); i++) {
      output.writeMessage(10, distribution_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < distribution_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, distribution_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.PackageNote)) {
      return super.equals(obj);
    }
    io.grafeas.v1.PackageNote other = (io.grafeas.v1.PackageNote) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDistributionList().equals(other.getDistributionList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getDistributionCount() > 0) {
      hash = (37 * hash) + DISTRIBUTION_FIELD_NUMBER;
      hash = (53 * hash) + getDistributionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.PackageNote parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageNote parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageNote parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.PackageNote parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.PackageNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageNote parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.PackageNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageNote parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.PackageNote parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.PackageNote parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.PackageNote prototype) {
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
  /**
   *
   *
   * <pre>
   * This represents a particular package that is distributed over various
   * channels. E.g., glibc (aka libc6) is distributed by many, at various
   * versions.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.PackageNote}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.PackageNote)
      io.grafeas.v1.PackageNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageNote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.PackageNote.class, io.grafeas.v1.PackageNote.Builder.class);
    }

    // Construct using io.grafeas.v1.PackageNote.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDistributionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (distributionBuilder_ == null) {
        distribution_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        distributionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Package.internal_static_grafeas_v1_PackageNote_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.PackageNote getDefaultInstanceForType() {
      return io.grafeas.v1.PackageNote.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.PackageNote build() {
      io.grafeas.v1.PackageNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.PackageNote buildPartial() {
      io.grafeas.v1.PackageNote result = new io.grafeas.v1.PackageNote(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (distributionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          distribution_ = java.util.Collections.unmodifiableList(distribution_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.distribution_ = distribution_;
      } else {
        result.distribution_ = distributionBuilder_.build();
      }
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
      if (other instanceof io.grafeas.v1.PackageNote) {
        return mergeFrom((io.grafeas.v1.PackageNote) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.PackageNote other) {
      if (other == io.grafeas.v1.PackageNote.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (distributionBuilder_ == null) {
        if (!other.distribution_.isEmpty()) {
          if (distribution_.isEmpty()) {
            distribution_ = other.distribution_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDistributionIsMutable();
            distribution_.addAll(other.distribution_);
          }
          onChanged();
        }
      } else {
        if (!other.distribution_.isEmpty()) {
          if (distributionBuilder_.isEmpty()) {
            distributionBuilder_.dispose();
            distributionBuilder_ = null;
            distribution_ = other.distribution_;
            bitField0_ = (bitField0_ & ~0x00000001);
            distributionBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDistributionFieldBuilder()
                    : null;
          } else {
            distributionBuilder_.addAllMessages(other.distribution_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      io.grafeas.v1.PackageNote parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.PackageNote) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the package.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<io.grafeas.v1.Distribution> distribution_ =
        java.util.Collections.emptyList();

    private void ensureDistributionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        distribution_ = new java.util.ArrayList<io.grafeas.v1.Distribution>(distribution_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Distribution,
            io.grafeas.v1.Distribution.Builder,
            io.grafeas.v1.DistributionOrBuilder>
        distributionBuilder_;

    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public java.util.List<io.grafeas.v1.Distribution> getDistributionList() {
      if (distributionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(distribution_);
      } else {
        return distributionBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public int getDistributionCount() {
      if (distributionBuilder_ == null) {
        return distribution_.size();
      } else {
        return distributionBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1.Distribution getDistribution(int index) {
      if (distributionBuilder_ == null) {
        return distribution_.get(index);
      } else {
        return distributionBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder setDistribution(int index, io.grafeas.v1.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.set(index, value);
        onChanged();
      } else {
        distributionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder setDistribution(int index, io.grafeas.v1.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.set(index, builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(io.grafeas.v1.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.add(value);
        onChanged();
      } else {
        distributionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(int index, io.grafeas.v1.Distribution value) {
      if (distributionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDistributionIsMutable();
        distribution_.add(index, value);
        onChanged();
      } else {
        distributionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(io.grafeas.v1.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.add(builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder addDistribution(int index, io.grafeas.v1.Distribution.Builder builderForValue) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.add(index, builderForValue.build());
        onChanged();
      } else {
        distributionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder addAllDistribution(
        java.lang.Iterable<? extends io.grafeas.v1.Distribution> values) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, distribution_);
        onChanged();
      } else {
        distributionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder clearDistribution() {
      if (distributionBuilder_ == null) {
        distribution_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        distributionBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public Builder removeDistribution(int index) {
      if (distributionBuilder_ == null) {
        ensureDistributionIsMutable();
        distribution_.remove(index);
        onChanged();
      } else {
        distributionBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1.Distribution.Builder getDistributionBuilder(int index) {
      return getDistributionFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1.DistributionOrBuilder getDistributionOrBuilder(int index) {
      if (distributionBuilder_ == null) {
        return distribution_.get(index);
      } else {
        return distributionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public java.util.List<? extends io.grafeas.v1.DistributionOrBuilder>
        getDistributionOrBuilderList() {
      if (distributionBuilder_ != null) {
        return distributionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(distribution_);
      }
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1.Distribution.Builder addDistributionBuilder() {
      return getDistributionFieldBuilder()
          .addBuilder(io.grafeas.v1.Distribution.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public io.grafeas.v1.Distribution.Builder addDistributionBuilder(int index) {
      return getDistributionFieldBuilder()
          .addBuilder(index, io.grafeas.v1.Distribution.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The various channels by which a package is distributed.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Distribution distribution = 10;</code>
     */
    public java.util.List<io.grafeas.v1.Distribution.Builder> getDistributionBuilderList() {
      return getDistributionFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Distribution,
            io.grafeas.v1.Distribution.Builder,
            io.grafeas.v1.DistributionOrBuilder>
        getDistributionFieldBuilder() {
      if (distributionBuilder_ == null) {
        distributionBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1.Distribution,
                io.grafeas.v1.Distribution.Builder,
                io.grafeas.v1.DistributionOrBuilder>(
                distribution_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        distribution_ = null;
      }
      return distributionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.PackageNote)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.PackageNote)
  private static final io.grafeas.v1.PackageNote DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.PackageNote();
  }

  public static io.grafeas.v1.PackageNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PackageNote> PARSER =
      new com.google.protobuf.AbstractParser<PackageNote>() {
        @java.lang.Override
        public PackageNote parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PackageNote(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PackageNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PackageNote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.PackageNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
