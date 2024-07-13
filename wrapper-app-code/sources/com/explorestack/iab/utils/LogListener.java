package com.explorestack.iab.utils;

import com.explorestack.iab.utils.Logger;

public interface LogListener {
    void onLog(Logger.LogLevel logLevel, String str, String str2);
}
