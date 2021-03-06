/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaExperimentalFeature {
  WEB_FLEX_BASIS(0),
  MIN_FLEX_FIX(1);

  private int mIntValue;

  YogaExperimentalFeature(int intValue) {
    mIntValue = intValue;
  }

  public int intValue() {
    return mIntValue;
  }

  public static YogaExperimentalFeature fromInt(int value) {
    switch (value) {
      case 0: return WEB_FLEX_BASIS;
      case 1: return MIN_FLEX_FIX;
      default: throw new IllegalArgumentException("Unknown enum value: " + value);
    }
  }
}
