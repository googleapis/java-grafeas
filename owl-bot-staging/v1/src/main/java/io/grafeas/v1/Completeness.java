// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/intoto_provenance.proto

package io.grafeas.v1;

/**
 * <pre>
 * Indicates that the builder claims certain fields in this message to be
 * complete.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.Completeness}
 */
public final class Completeness extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.Completeness)
    CompletenessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Completeness.newBuilder() to construct.
  private Completeness(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Completeness() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Completeness();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Completeness(
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
          case 8: {

            arguments_ = input.readBool();
            break;
          }
          case 16: {

            environment_ = input.readBool();
            break;
          }
          case 24: {

            materials_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grafeas.v1.InTotoProvenanceProto.internal_static_grafeas_v1_Completeness_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.InTotoProvenanceProto.internal_static_grafeas_v1_Completeness_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.Completeness.class, io.grafeas.v1.Completeness.Builder.class);
  }

  public static final int ARGUMENTS_FIELD_NUMBER = 1;
  private boolean arguments_;
  /**
   * <pre>
   * If true, the builder claims that recipe.arguments is complete, meaning that
   * all external inputs are properly captured in the recipe.
   * </pre>
   *
   * <code>bool arguments = 1;</code>
   * @return The arguments.
   */
  @java.lang.Override
  public boolean getArguments() {
    return arguments_;
  }

  public static final int ENVIRONMENT_FIELD_NUMBER = 2;
  private boolean environment_;
  /**
   * <pre>
   * If true, the builder claims that recipe.environment is claimed to be
   * complete.
   * </pre>
   *
   * <code>bool environment = 2;</code>
   * @return The environment.
   */
  @java.lang.Override
  public boolean getEnvironment() {
    return environment_;
  }

  public static final int MATERIALS_FIELD_NUMBER = 3;
  private boolean materials_;
  /**
   * <pre>
   * If true, the builder claims that materials are complete, usually through
   * some controls to prevent network access. Sometimes called "hermetic".
   * </pre>
   *
   * <code>bool materials = 3;</code>
   * @return The materials.
   */
  @java.lang.Override
  public boolean getMaterials() {
    return materials_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (arguments_ != false) {
      output.writeBool(1, arguments_);
    }
    if (environment_ != false) {
      output.writeBool(2, environment_);
    }
    if (materials_ != false) {
      output.writeBool(3, materials_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (arguments_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, arguments_);
    }
    if (environment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, environment_);
    }
    if (materials_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, materials_);
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
    if (!(obj instanceof io.grafeas.v1.Completeness)) {
      return super.equals(obj);
    }
    io.grafeas.v1.Completeness other = (io.grafeas.v1.Completeness) obj;

    if (getArguments()
        != other.getArguments()) return false;
    if (getEnvironment()
        != other.getEnvironment()) return false;
    if (getMaterials()
        != other.getMaterials()) return false;
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
    hash = (37 * hash) + ARGUMENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArguments());
    hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnvironment());
    hash = (37 * hash) + MATERIALS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMaterials());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.Completeness parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.Completeness parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grafeas.v1.Completeness parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.Completeness parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.Completeness parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grafeas.v1.Completeness parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grafeas.v1.Completeness prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Indicates that the builder claims certain fields in this message to be
   * complete.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.Completeness}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.Completeness)
      io.grafeas.v1.CompletenessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grafeas.v1.InTotoProvenanceProto.internal_static_grafeas_v1_Completeness_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.InTotoProvenanceProto.internal_static_grafeas_v1_Completeness_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.Completeness.class, io.grafeas.v1.Completeness.Builder.class);
    }

    // Construct using io.grafeas.v1.Completeness.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      arguments_ = false;

      environment_ = false;

      materials_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grafeas.v1.InTotoProvenanceProto.internal_static_grafeas_v1_Completeness_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.Completeness getDefaultInstanceForType() {
      return io.grafeas.v1.Completeness.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.Completeness build() {
      io.grafeas.v1.Completeness result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.Completeness buildPartial() {
      io.grafeas.v1.Completeness result = new io.grafeas.v1.Completeness(this);
      result.arguments_ = arguments_;
      result.environment_ = environment_;
      result.materials_ = materials_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1.Completeness) {
        return mergeFrom((io.grafeas.v1.Completeness)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.Completeness other) {
      if (other == io.grafeas.v1.Completeness.getDefaultInstance()) return this;
      if (other.getArguments() != false) {
        setArguments(other.getArguments());
      }
      if (other.getEnvironment() != false) {
        setEnvironment(other.getEnvironment());
      }
      if (other.getMaterials() != false) {
        setMaterials(other.getMaterials());
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
      io.grafeas.v1.Completeness parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.Completeness) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean arguments_ ;
    /**
     * <pre>
     * If true, the builder claims that recipe.arguments is complete, meaning that
     * all external inputs are properly captured in the recipe.
     * </pre>
     *
     * <code>bool arguments = 1;</code>
     * @return The arguments.
     */
    @java.lang.Override
    public boolean getArguments() {
      return arguments_;
    }
    /**
     * <pre>
     * If true, the builder claims that recipe.arguments is complete, meaning that
     * all external inputs are properly captured in the recipe.
     * </pre>
     *
     * <code>bool arguments = 1;</code>
     * @param value The arguments to set.
     * @return This builder for chaining.
     */
    public Builder setArguments(boolean value) {
      
      arguments_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the builder claims that recipe.arguments is complete, meaning that
     * all external inputs are properly captured in the recipe.
     * </pre>
     *
     * <code>bool arguments = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArguments() {
      
      arguments_ = false;
      onChanged();
      return this;
    }

    private boolean environment_ ;
    /**
     * <pre>
     * If true, the builder claims that recipe.environment is claimed to be
     * complete.
     * </pre>
     *
     * <code>bool environment = 2;</code>
     * @return The environment.
     */
    @java.lang.Override
    public boolean getEnvironment() {
      return environment_;
    }
    /**
     * <pre>
     * If true, the builder claims that recipe.environment is claimed to be
     * complete.
     * </pre>
     *
     * <code>bool environment = 2;</code>
     * @param value The environment to set.
     * @return This builder for chaining.
     */
    public Builder setEnvironment(boolean value) {
      
      environment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the builder claims that recipe.environment is claimed to be
     * complete.
     * </pre>
     *
     * <code>bool environment = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnvironment() {
      
      environment_ = false;
      onChanged();
      return this;
    }

    private boolean materials_ ;
    /**
     * <pre>
     * If true, the builder claims that materials are complete, usually through
     * some controls to prevent network access. Sometimes called "hermetic".
     * </pre>
     *
     * <code>bool materials = 3;</code>
     * @return The materials.
     */
    @java.lang.Override
    public boolean getMaterials() {
      return materials_;
    }
    /**
     * <pre>
     * If true, the builder claims that materials are complete, usually through
     * some controls to prevent network access. Sometimes called "hermetic".
     * </pre>
     *
     * <code>bool materials = 3;</code>
     * @param value The materials to set.
     * @return This builder for chaining.
     */
    public Builder setMaterials(boolean value) {
      
      materials_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the builder claims that materials are complete, usually through
     * some controls to prevent network access. Sometimes called "hermetic".
     * </pre>
     *
     * <code>bool materials = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaterials() {
      
      materials_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grafeas.v1.Completeness)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.Completeness)
  private static final io.grafeas.v1.Completeness DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.Completeness();
  }

  public static io.grafeas.v1.Completeness getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Completeness>
      PARSER = new com.google.protobuf.AbstractParser<Completeness>() {
    @java.lang.Override
    public Completeness parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Completeness(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Completeness> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Completeness> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.Completeness getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

