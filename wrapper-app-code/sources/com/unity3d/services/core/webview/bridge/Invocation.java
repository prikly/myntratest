package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Invocation {
    private static AtomicInteger _idCount = new AtomicInteger(0);
    private static Map<Integer, Invocation> _invocationSets;
    private IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private ArrayList<ArrayList<Object>> _invocations;
    private ArrayList<ArrayList<Object>> _responses;

    public Invocation() {
        this(SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker());
    }

    public Invocation(IInvocationCallbackInvoker iInvocationCallbackInvoker) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker;
        this._invocationId = _idCount.getAndIncrement();
        if (_invocationSets == null) {
            _invocationSets = new HashMap();
        }
        _invocationSets.put(Integer.valueOf(this._invocationId), this);
    }

    public void addInvocation(String str, String str2, Object[] objArr, WebViewCallback webViewCallback) {
        if (this._invocations == null) {
            this._invocations = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(webViewCallback);
        this._invocations.add(arrayList);
    }

    public boolean nextInvocation() {
        ArrayList<ArrayList<Object>> arrayList = this._invocations;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList remove = this._invocations.remove(0);
        String str = (String) remove.get(0);
        String str2 = (String) remove.get(1);
        Object[] objArr = (Object[]) remove.get(2);
        try {
            WebViewBridge.handleInvocation(str, str2, objArr, (WebViewCallback) remove.get(3));
        } catch (Exception e2) {
            DeviceLog.exception(String.format("Error handling invocation %s.%s(%s)", new Object[]{str, str2, Arrays.toString(objArr)}), e2);
        }
        return true;
    }

    public void setInvocationResponse(CallbackStatus callbackStatus, Enum enumR, Object... objArr) {
        if (this._responses == null) {
            this._responses = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(callbackStatus);
        arrayList.add(enumR);
        arrayList.add(objArr);
        this._responses.add(arrayList);
    }

    public void sendInvocationCallback() {
        _invocationSets.remove(Integer.valueOf(getId()));
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public int getId() {
        return this._invocationId;
    }

    public ArrayList<ArrayList<Object>> getResponses() {
        return this._responses;
    }

    public static synchronized Invocation getInvocationById(int i) {
        synchronized (Invocation.class) {
            if (_invocationSets == null || !_invocationSets.containsKey(Integer.valueOf(i))) {
                return null;
            }
            Invocation invocation = _invocationSets.get(Integer.valueOf(i));
            return invocation;
        }
    }
}
