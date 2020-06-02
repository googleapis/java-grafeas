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
// source: grafeas/v1/image.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Layer holds metadata specific to a layer of a Docker image.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.Layer}
 */
public final class Layer extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Layer)
    LayerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Layer.newBuilder() to construct.
  private Layer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Layer() {
    directive_ = "";
    arguments_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Layer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Layer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

              directive_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              arguments_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_Layer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Image.internal_static_grafeas_v1_Layer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Layer.class, io.grafeas.v1.Layer.Builder.class);
  }

  public static final int DIRECTIVE_FIELD_NUMBER = 1;
  private volatile java.lang.Object directive_;
  /**
   *
   *
   * <pre>
   * Required. The recovered Dockerfile directive used to construct this layer.
   * See https://docs.docker.com/engine/reference/builder/ for more information.
   * </pre>
   *
   * <code>string directive = 1;</code>
   *
   * @return The directive.
   */
  @java.lang.Override
  public java.lang.String getDirective() {
    java.lang.Object ref = directive_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      directive_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The recovered Dockerfile directive used to construct this layer.
   * See https://docs.docker.com/engine/reference/builder/ for more information.
   * </pre>
   *
   * <code>string directive = 1;</code>
   *
   * @return The bytes for directive.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDirectiveBytes() {
    java.lang.Object ref = directive_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      directive_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGUMENTS_FIELD_NUMBER = 2;
  private volatile java.lang.Object arguments_;
  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   *
   * @return The arguments.
   */
  @java.lang.Override
  public java.lang.String getArguments() {
    java.lang.Object ref = arguments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arguments_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The recovered arguments to the Dockerfile directive.
   * </pre>
   *
   * <code>string arguments = 2;</code>
   *
   * @return The bytes for arguments.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getArgumentsBytes() {
    java.lang.Object ref = arguments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      arguments_ = b;
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
    if (!getDirectiveBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, directive_);
    }
    if (!getArgumentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, arguments_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDirectiveBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, directive_);
    }
    if (!getArgumentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, arguments_);
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
    if (!(obj instanceof io.grafeas.v1.Layer)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Layer other = (io.grafeas.v1.Layer) obj;

    if (!getDirective().equals(other.getDirective())) return false;
    if (!getArguments().equals(other.getArguments())) return false;
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
    hash = (37 * hash) + DIRECTIVE_FIELD_NUMBER;
    hash = (53 * hash) + getDirective().hashCode();
    hash = (37 * hash) + ARGUMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getArguments().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Layer parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Layer parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Layer parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Layer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Layer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.Layer parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.Layer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Layer parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Layer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Layer parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.Layer parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.Layer parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.Layer prototype) {
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
   * Layer holds metadata specific to a layer of a Docker image.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.Layer}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Layer)
      io.grafeas.v1.LayerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Layer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Layer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Layer.class, io.grafeas.v1.Layer.Builder.class);
    }

    // Construct using io.grafeas.v1.Layer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      directive_ = "";

      arguments_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Image.internal_static_grafeas_v1_Layer_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Layer getDefaultInstanceForType() {
      return io.grafeas.v1.Layer.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Layer build() {
      io.grafeas.v1.Layer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Layer buildPartial() {
      io.grafeas.v1.Layer result = new io.grafeas.v1.Layer(this);
      result.directive_ = directive_;
      result.arguments_ = arguments_;
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
      if (other instanceof io.grafeas.v1.Layer) {
        return mergeFrom((io.grafeas.v1.Layer) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Layer other) {
      if (other == io.grafeas.v1.Layer.getDefaultInstance()) return this;
      if (!other.getDirective().isEmpty()) {
        directive_ = other.directive_;
        onChanged();
      }
      if (!other.getArguments().isEmpty()) {
        arguments_ = other.arguments_;
        onChanged();
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
      io.grafeas.v1.Layer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.Layer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object directive_ = "";
    /**
     *
     *
     * <pre>
     * Required. The recovered Dockerfile directive used to construct this layer.
     * See https://docs.docker.com/engine/reference/builder/ for more information.
     * </pre>
     *
     * <code>string directive = 1;</code>
     *
     * @return The directive.
     */
    public java.lang.String getDirective() {
      java.lang.Object ref = directive_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        directive_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The recovered Dockerfile directive used to construct this layer.
     * See https://docs.docker.com/engine/reference/builder/ for more information.
     * </pre>
     *
     * <code>string directive = 1;</code>
     *
     * @return The bytes for directive.
     */
    public com.google.protobuf.ByteString getDirectiveBytes() {
      java.lang.Object ref = directive_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        directive_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The recovered Dockerfile directive used to construct this layer.
     * See https://docs.docker.com/engine/reference/builder/ for more information.
     * </pre>
     *
     * <code>string directive = 1;</code>
     *
     * @param value The directive to set.
     * @return This builder for chaining.
     */
    public Builder setDirective(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      directive_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The recovered Dockerfile directive used to construct this layer.
     * See https://docs.docker.com/engine/reference/builder/ for more information.
     * </pre>
     *
     * <code>string directive = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDirective() {

      directive_ = getDefaultInstance().getDirective();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The recovered Dockerfile directive used to construct this layer.
     * See https://docs.docker.com/engine/reference/builder/ for more information.
     * </pre>
     *
     * <code>string directive = 1;</code>
     *
     * @param value The bytes for directive to set.
     * @return This builder for chaining.
     */
    public Builder setDirectiveBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      directive_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object arguments_ = "";
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     *
     * @return The arguments.
     */
    public java.lang.String getArguments() {
      java.lang.Object ref = arguments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arguments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     *
     * @return The bytes for arguments.
     */
    public com.google.protobuf.ByteString getArgumentsBytes() {
      java.lang.Object ref = arguments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        arguments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     *
     * @param value The arguments to set.
     * @return This builder for chaining.
     */
    public Builder setArguments(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      arguments_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearArguments() {

      arguments_ = getDefaultInstance().getArguments();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The recovered arguments to the Dockerfile directive.
     * </pre>
     *
     * <code>string arguments = 2;</code>
     *
     * @param value The bytes for arguments to set.
     * @return This builder for chaining.
     */
    public Builder setArgumentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      arguments_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.Layer)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Layer)
  private static final io.grafeas.v1.Layer DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Layer();
  }

  public static io.grafeas.v1.Layer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Layer> PARSER =
      new com.google.protobuf.AbstractParser<Layer>() {
        @java.lang.Override
        public Layer parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Layer(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Layer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Layer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Layer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
