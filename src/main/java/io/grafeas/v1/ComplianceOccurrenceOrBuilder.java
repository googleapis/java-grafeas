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
// source: grafeas/v1/compliance.proto

package io.grafeas.v1;

public interface ComplianceOccurrenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ComplianceOccurrence)
    com.google.protobuf.MessageOrBuilder {

  /** <code>repeated .grafeas.v1.NonCompliantFile non_compliant_files = 2;</code> */
  java.util.List<io.grafeas.v1.NonCompliantFile> getNonCompliantFilesList();
  /** <code>repeated .grafeas.v1.NonCompliantFile non_compliant_files = 2;</code> */
  io.grafeas.v1.NonCompliantFile getNonCompliantFiles(int index);
  /** <code>repeated .grafeas.v1.NonCompliantFile non_compliant_files = 2;</code> */
  int getNonCompliantFilesCount();
  /** <code>repeated .grafeas.v1.NonCompliantFile non_compliant_files = 2;</code> */
  java.util.List<? extends io.grafeas.v1.NonCompliantFileOrBuilder>
      getNonCompliantFilesOrBuilderList();
  /** <code>repeated .grafeas.v1.NonCompliantFile non_compliant_files = 2;</code> */
  io.grafeas.v1.NonCompliantFileOrBuilder getNonCompliantFilesOrBuilder(int index);

  /**
   * <code>string non_compliance_reason = 3;</code>
   *
   * @return The nonComplianceReason.
   */
  java.lang.String getNonComplianceReason();
  /**
   * <code>string non_compliance_reason = 3;</code>
   *
   * @return The bytes for nonComplianceReason.
   */
  com.google.protobuf.ByteString getNonComplianceReasonBytes();
}
