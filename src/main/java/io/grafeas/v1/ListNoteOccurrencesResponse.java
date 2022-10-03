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
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Response for listing occurrences for a note.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.ListNoteOccurrencesResponse}
 */
public final class ListNoteOccurrencesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.ListNoteOccurrencesResponse)
    ListNoteOccurrencesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListNoteOccurrencesResponse.newBuilder() to construct.
  private ListNoteOccurrencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNoteOccurrencesResponse() {
    occurrences_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNoteOccurrencesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_ListNoteOccurrencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.GrafeasOuterClass
        .internal_static_grafeas_v1_ListNoteOccurrencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.ListNoteOccurrencesResponse.class,
            io.grafeas.v1.ListNoteOccurrencesResponse.Builder.class);
  }

  public static final int OCCURRENCES_FIELD_NUMBER = 1;
  private java.util.List<io.grafeas.v1.Occurrence> occurrences_;
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1.Occurrence> getOccurrencesList() {
    return occurrences_;
  }
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder> getOccurrencesOrBuilderList() {
    return occurrences_;
  }
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  @java.lang.Override
  public int getOccurrencesCount() {
    return occurrences_.size();
  }
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.Occurrence getOccurrences(int index) {
    return occurrences_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index) {
    return occurrences_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < occurrences_.size(); i++) {
      output.writeMessage(1, occurrences_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < occurrences_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, occurrences_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof io.grafeas.v1.ListNoteOccurrencesResponse)) {
      return super.equals(obj);
    }
    io.grafeas.v1.ListNoteOccurrencesResponse other =
        (io.grafeas.v1.ListNoteOccurrencesResponse) obj;

    if (!getOccurrencesList().equals(other.getOccurrencesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getOccurrencesCount() > 0) {
      hash = (37 * hash) + OCCURRENCES_FIELD_NUMBER;
      hash = (53 * hash) + getOccurrencesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.ListNoteOccurrencesResponse prototype) {
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
   * Response for listing occurrences for a note.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.ListNoteOccurrencesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.ListNoteOccurrencesResponse)
      io.grafeas.v1.ListNoteOccurrencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNoteOccurrencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNoteOccurrencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.ListNoteOccurrencesResponse.class,
              io.grafeas.v1.ListNoteOccurrencesResponse.Builder.class);
    }

    // Construct using io.grafeas.v1.ListNoteOccurrencesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
      } else {
        occurrences_ = null;
        occurrencesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.GrafeasOuterClass
          .internal_static_grafeas_v1_ListNoteOccurrencesResponse_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.ListNoteOccurrencesResponse getDefaultInstanceForType() {
      return io.grafeas.v1.ListNoteOccurrencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.ListNoteOccurrencesResponse build() {
      io.grafeas.v1.ListNoteOccurrencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.ListNoteOccurrencesResponse buildPartial() {
      io.grafeas.v1.ListNoteOccurrencesResponse result =
          new io.grafeas.v1.ListNoteOccurrencesResponse(this);
      int from_bitField0_ = bitField0_;
      if (occurrencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          occurrences_ = java.util.Collections.unmodifiableList(occurrences_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.occurrences_ = occurrences_;
      } else {
        result.occurrences_ = occurrencesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof io.grafeas.v1.ListNoteOccurrencesResponse) {
        return mergeFrom((io.grafeas.v1.ListNoteOccurrencesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.ListNoteOccurrencesResponse other) {
      if (other == io.grafeas.v1.ListNoteOccurrencesResponse.getDefaultInstance()) return this;
      if (occurrencesBuilder_ == null) {
        if (!other.occurrences_.isEmpty()) {
          if (occurrences_.isEmpty()) {
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOccurrencesIsMutable();
            occurrences_.addAll(other.occurrences_);
          }
          onChanged();
        }
      } else {
        if (!other.occurrences_.isEmpty()) {
          if (occurrencesBuilder_.isEmpty()) {
            occurrencesBuilder_.dispose();
            occurrencesBuilder_ = null;
            occurrences_ = other.occurrences_;
            bitField0_ = (bitField0_ & ~0x00000001);
            occurrencesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOccurrencesFieldBuilder()
                    : null;
          } else {
            occurrencesBuilder_.addAllMessages(other.occurrences_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                io.grafeas.v1.Occurrence m =
                    input.readMessage(io.grafeas.v1.Occurrence.parser(), extensionRegistry);
                if (occurrencesBuilder_ == null) {
                  ensureOccurrencesIsMutable();
                  occurrences_.add(m);
                } else {
                  occurrencesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

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

    private int bitField0_;

    private java.util.List<io.grafeas.v1.Occurrence> occurrences_ =
        java.util.Collections.emptyList();

    private void ensureOccurrencesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        occurrences_ = new java.util.ArrayList<io.grafeas.v1.Occurrence>(occurrences_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Occurrence,
            io.grafeas.v1.Occurrence.Builder,
            io.grafeas.v1.OccurrenceOrBuilder>
        occurrencesBuilder_;

    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Occurrence> getOccurrencesList() {
      if (occurrencesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(occurrences_);
      } else {
        return occurrencesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public int getOccurrencesCount() {
      if (occurrencesBuilder_ == null) {
        return occurrences_.size();
      } else {
        return occurrencesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1.Occurrence getOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);
      } else {
        return occurrencesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder setOccurrences(int index, io.grafeas.v1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.set(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder setOccurrences(int index, io.grafeas.v1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.set(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(io.grafeas.v1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(int index, io.grafeas.v1.Occurrence value) {
      if (occurrencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOccurrencesIsMutable();
        occurrences_.add(index, value);
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(io.grafeas.v1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder addOccurrences(int index, io.grafeas.v1.Occurrence.Builder builderForValue) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.add(index, builderForValue.build());
        onChanged();
      } else {
        occurrencesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder addAllOccurrences(
        java.lang.Iterable<? extends io.grafeas.v1.Occurrence> values) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, occurrences_);
        onChanged();
      } else {
        occurrencesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder clearOccurrences() {
      if (occurrencesBuilder_ == null) {
        occurrences_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        occurrencesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public Builder removeOccurrences(int index) {
      if (occurrencesBuilder_ == null) {
        ensureOccurrencesIsMutable();
        occurrences_.remove(index);
        onChanged();
      } else {
        occurrencesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1.Occurrence.Builder getOccurrencesBuilder(int index) {
      return getOccurrencesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index) {
      if (occurrencesBuilder_ == null) {
        return occurrences_.get(index);
      } else {
        return occurrencesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder>
        getOccurrencesOrBuilderList() {
      if (occurrencesBuilder_ != null) {
        return occurrencesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(occurrences_);
      }
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1.Occurrence.Builder addOccurrencesBuilder() {
      return getOccurrencesFieldBuilder().addBuilder(io.grafeas.v1.Occurrence.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public io.grafeas.v1.Occurrence.Builder addOccurrencesBuilder(int index) {
      return getOccurrencesFieldBuilder()
          .addBuilder(index, io.grafeas.v1.Occurrence.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The occurrences attached to the specified note.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Occurrence.Builder> getOccurrencesBuilderList() {
      return getOccurrencesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Occurrence,
            io.grafeas.v1.Occurrence.Builder,
            io.grafeas.v1.OccurrenceOrBuilder>
        getOccurrencesFieldBuilder() {
      if (occurrencesBuilder_ == null) {
        occurrencesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1.Occurrence,
                io.grafeas.v1.Occurrence.Builder,
                io.grafeas.v1.OccurrenceOrBuilder>(
                occurrences_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        occurrences_ = null;
      }
      return occurrencesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to provide to skip to a particular spot in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to provide to skip to a particular spot in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to provide to skip to a particular spot in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to provide to skip to a particular spot in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to provide to skip to a particular spot in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.ListNoteOccurrencesResponse)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.ListNoteOccurrencesResponse)
  private static final io.grafeas.v1.ListNoteOccurrencesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.ListNoteOccurrencesResponse();
  }

  public static io.grafeas.v1.ListNoteOccurrencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNoteOccurrencesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNoteOccurrencesResponse>() {
        @java.lang.Override
        public ListNoteOccurrencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNoteOccurrencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNoteOccurrencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.ListNoteOccurrencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
