/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= GrafeasClient =======================
 *
 * <p>Service Description: [Grafeas](https://grafeas.io) API.
 *
 * <p>Retrieves analysis results of Cloud components such as Docker container images.
 *
 * <p>Analysis results are stored as a series of occurrences. An `Occurrence` contains information
 * about a specific analysis instance on a resource. An occurrence refers to a `Note`. A note
 * contains details describing the analysis and is generally stored in a separate project, called a
 * `Provider`. Multiple occurrences can refer to the same note.
 *
 * <p>For example, an SSL vulnerability could affect multiple images. In this case, there would be
 * one note for the vulnerability and an occurrence for each image with the vulnerability referring
 * to that note.
 *
 * <p>Sample for GrafeasClient:
 *
 * <pre>{@code
 * try (GrafeasClient grafeasClient = GrafeasClient.create()) {
 *   OccurrenceName name = OccurrenceName.of("[PROJECT]", "[OCCURRENCE]");
 *   Occurrence response = grafeasClient.getOccurrence(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package io.grafeas.v1;

import javax.annotation.Generated;
