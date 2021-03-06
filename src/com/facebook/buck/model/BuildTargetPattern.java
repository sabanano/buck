/*
 * Copyright 2012-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.model;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;

import javax.annotation.Nullable;

/**
 * A pattern that matches one or more build targets.
 */
public interface BuildTargetPattern extends Predicate<BuildTarget> {

  public static final BuildTargetPattern MATCH_ALL = new BuildTargetPattern() {

    @Override
    public boolean apply(@Nullable BuildTarget target) {
      return true;
    }
  };

  /**
   * Value that can be used for the {@code visibility} argument for a rule that should be public.
   */
  public static final ImmutableSet<BuildTargetPattern> PUBLIC =
      ImmutableSet.of(BuildTargetPattern.MATCH_ALL);
}
