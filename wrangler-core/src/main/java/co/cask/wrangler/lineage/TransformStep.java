/*
 * Copyright © 2017 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package co.cask.wrangler.lineage;

import javax.annotation.Nullable;

// TODO: [CDAP-12369] Move to cdap-etl-api
/**
 * <p>
 *   A TransformStep represents a modification done by a transform stage.
 * </p>
 */
public interface TransformStep {

  /**
   * @return the name of this modification
   */
  String getName();

  /**
   * @return additional information about this modification
   */
  @Nullable
  String getInformation();
}