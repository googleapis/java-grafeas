// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface BatchCreateOccurrencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.BatchCreateOccurrencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<io.grafeas.v1.Occurrence> 
      getOccurrencesList();
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.Occurrence getOccurrences(int index);
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  int getOccurrencesCount();
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder> 
      getOccurrencesOrBuilderList();
  /**
   * <pre>
   * The occurrences that were created.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(
      int index);
}
