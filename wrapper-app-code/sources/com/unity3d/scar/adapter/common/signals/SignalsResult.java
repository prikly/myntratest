package com.unity3d.scar.adapter.common.signals;

import java.util.HashMap;
import java.util.Map;

public class SignalsResult {
    private String _errorMessage = null;
    private Map<String, String> _signalsMap = new HashMap();

    public void addToSignalsMap(String str, String str2) {
        this._signalsMap.put(str, str2);
    }

    public Map<String, String> getSignalsMap() {
        return this._signalsMap;
    }

    public void setErrorMessage(String str) {
        this._errorMessage = str;
    }

    public String getErrorMessage() {
        return this._errorMessage;
    }
}
