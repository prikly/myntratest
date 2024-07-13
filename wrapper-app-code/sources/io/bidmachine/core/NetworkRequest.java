package io.bidmachine.core;

import android.util.Base64;
import com.explorestack.protobuf.AbstractMessage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> {
    private static final Executor executor = Executors.newFixedThreadPool(2);
    /* access modifiers changed from: private */
    public Callback<RequestResultType, ErrorResultType> callback;
    private CancelCallback cancelCallback;
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> contentEncoders;
    private URLConnection currentConnection;
    /* access modifiers changed from: private */
    public State currentState = State.Idle;
    private RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> dataBinder;
    private ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> dataEncoders;
    /* access modifiers changed from: private */
    public ErrorResultType errorResult;
    private final Method method;
    private final String path;
    private final RequestDataType requestData;
    /* access modifiers changed from: private */
    public RequestResultType requestResult;

    public interface Callback<RequestResultType, ErrorResultType> {
        void onFail(ErrorResultType errorresulttype);

        void onSuccess(RequestResultType requestresulttype);
    }

    public interface CancelCallback {
        void onCanceled();
    }

    public static abstract class RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> {
        /* access modifiers changed from: protected */
        public ErrorResultType createFailResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        /* access modifiers changed from: protected */
        public abstract RequestResultType createSuccessResult(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        /* access modifiers changed from: protected */
        public abstract byte[] obtainData(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, RequestDataType requestdatatype) throws Exception;

        /* access modifiers changed from: protected */
        public abstract void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection);

        /* access modifiers changed from: protected */
        public void prepareRequest(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public static abstract class RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        /* access modifiers changed from: protected */
        public abstract byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        /* access modifiers changed from: protected */
        public abstract byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception;

        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
        }
    }

    public enum State {
        Idle,
        Running,
        Success,
        Fail,
        Canceled
    }

    /* access modifiers changed from: protected */
    public String getBaseUrl() throws Exception {
        return "TODO: implement url";
    }

    /* access modifiers changed from: protected */
    public abstract ErrorResultType obtainError(URLConnection uRLConnection, int i);

    /* access modifiers changed from: protected */
    public abstract ErrorResultType obtainError(URLConnection uRLConnection, Throwable th);

    public enum Method {
        Get("GET"),
        Post("POST");
        
        private final String methodString;

        private Method(String str) {
            this.methodString = str;
        }

        public void apply(URLConnection uRLConnection) throws ProtocolException {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setRequestMethod(this.methodString);
            }
        }
    }

    public NetworkRequest(Method method2, String str, RequestDataType requestdatatype) {
        this.method = method2;
        this.path = str;
        this.requestData = requestdatatype;
    }

    public void setDataBinder(RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder) {
        this.dataBinder = requestDataBinder;
    }

    public void addDataEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.dataEncoders == null) {
            this.dataEncoders = new ArrayList<>();
        }
        this.dataEncoders.add(requestDataEncoder);
    }

    public void addContentEncoder(RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> requestDataEncoder) {
        if (this.contentEncoders == null) {
            this.contentEncoders = new ArrayList<>();
        }
        this.contentEncoders.add(requestDataEncoder);
    }

    public void setCallback(Callback<RequestResultType, ErrorResultType> callback2) {
        this.callback = callback2;
    }

    public void setCancelCallback(CancelCallback cancelCallback2) {
        this.cancelCallback = cancelCallback2;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getPath() {
        return this.path;
    }

    public void request() {
        executor.execute(new NetworkRequestRunner());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fc, code lost:
        if (r9.errorResult == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x013c, code lost:
        r0 = io.bidmachine.core.NetworkRequest.State.Fail;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0128 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0135 A[DONT_GENERATE] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x00e0=Splitter:B:62:0x00e0, B:77:0x010a=Splitter:B:77:0x010a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void process() {
        /*
            r9 = this;
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Running
            r9.currentState = r0
            r0 = 0
            java.lang.String r1 = r9.path     // Catch:{ all -> 0x0119 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0024
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "%s/%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0119 }
            java.lang.String r6 = r9.getBaseUrl()     // Catch:{ all -> 0x0119 }
            r5[r3] = r6     // Catch:{ all -> 0x0119 }
            java.lang.String r6 = r9.path     // Catch:{ all -> 0x0119 }
            r5[r2] = r6     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0119 }
            r1.<init>(r4)     // Catch:{ all -> 0x0119 }
            goto L_0x002d
        L_0x0024:
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r9.getBaseUrl()     // Catch:{ all -> 0x0119 }
            r1.<init>(r4)     // Catch:{ all -> 0x0119 }
        L_0x002d:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x0119 }
            r9.currentConnection = r1     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.NetworkRequest$Method r4 = r9.method     // Catch:{ all -> 0x0114 }
            r4.apply(r1)     // Catch:{ all -> 0x0114 }
            r9.prepareRequestParams(r1)     // Catch:{ all -> 0x0114 }
            byte[] r4 = r9.obtainRequestData(r1)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0066
            byte[] r4 = r9.encodeRequestData(r1, r4)     // Catch:{ all -> 0x0114 }
            r1.setDoOutput(r2)     // Catch:{ all -> 0x0114 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x005d }
            java.io.OutputStream r5 = r1.getOutputStream()     // Catch:{ all -> 0x005d }
            r2.<init>(r5)     // Catch:{ all -> 0x005d }
            r2.write(r4)     // Catch:{ all -> 0x005b }
            io.bidmachine.core.Utils.flush(r2)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0066
        L_0x005b:
            r3 = move-exception
            goto L_0x005f
        L_0x005d:
            r3 = move-exception
            r2 = r0
        L_0x005f:
            io.bidmachine.core.Utils.flush(r2)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r2)     // Catch:{ all -> 0x0114 }
            throw r3     // Catch:{ all -> 0x0114 }
        L_0x0066:
            int r2 = r9.obtainResponseCode(r1)     // Catch:{ all -> 0x0107 }
            boolean r4 = r9.isCanceled()     // Catch:{ all -> 0x0107 }
            if (r4 == 0) goto L_0x0096
            io.bidmachine.core.Utils.flush(r0)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r0)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r0)     // Catch:{ all -> 0x0114 }
            boolean r2 = r1 instanceof java.net.HttpURLConnection
            if (r2 == 0) goto L_0x0082
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.disconnect()
        L_0x0082:
            r9.currentConnection = r0
            boolean r0 = r9.isCanceled()
            if (r0 != 0) goto L_0x0095
            ErrorResultType r0 = r9.errorResult
            if (r0 != 0) goto L_0x0091
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Success
            goto L_0x0093
        L_0x0091:
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Fail
        L_0x0093:
            r9.currentState = r0
        L_0x0095:
            return
        L_0x0096:
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L_0x00a3
            java.lang.Object r2 = r9.obtainError((java.net.URLConnection) r1, (int) r2)     // Catch:{ all -> 0x0107 }
            r9.errorResult = r2     // Catch:{ all -> 0x0107 }
            r2 = r0
            r4 = r2
            goto L_0x00e0
        L_0x00a3:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ all -> 0x0107 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0101 }
            r4.<init>()     // Catch:{ all -> 0x0101 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00ff }
        L_0x00b0:
            int r6 = r2.read(r5)     // Catch:{ all -> 0x00ff }
            r7 = -1
            if (r6 == r7) goto L_0x00bb
            r4.write(r5, r3, r6)     // Catch:{ all -> 0x00ff }
            goto L_0x00b0
        L_0x00bb:
            byte[] r3 = r4.toByteArray()     // Catch:{ all -> 0x00ff }
            if (r3 == 0) goto L_0x00c5
            byte[] r3 = r9.decodeResponseData(r1, r3)     // Catch:{ all -> 0x00ff }
        L_0x00c5:
            if (r3 == 0) goto L_0x00e0
            int r5 = r3.length     // Catch:{ all -> 0x00ff }
            if (r5 <= 0) goto L_0x00e0
            io.bidmachine.core.NetworkRequest$RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> r5 = r9.dataBinder     // Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x00e0
            io.bidmachine.core.NetworkRequest$RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> r5 = r9.dataBinder     // Catch:{ all -> 0x00ff }
            java.lang.Object r5 = r5.createSuccessResult(r9, r1, r3)     // Catch:{ all -> 0x00ff }
            r9.requestResult = r5     // Catch:{ all -> 0x00ff }
            if (r5 != 0) goto L_0x00e0
            io.bidmachine.core.NetworkRequest$RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> r5 = r9.dataBinder     // Catch:{ all -> 0x00ff }
            java.lang.Object r3 = r5.createFailResult(r9, r1, r3)     // Catch:{ all -> 0x00ff }
            r9.errorResult = r3     // Catch:{ all -> 0x00ff }
        L_0x00e0:
            io.bidmachine.core.Utils.flush(r4)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r4)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r2)     // Catch:{ all -> 0x0114 }
            boolean r2 = r1 instanceof java.net.HttpURLConnection
            if (r2 == 0) goto L_0x00f2
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            r1.disconnect()
        L_0x00f2:
            r9.currentConnection = r0
            boolean r0 = r9.isCanceled()
            if (r0 != 0) goto L_0x0140
            ErrorResultType r0 = r9.errorResult
            if (r0 != 0) goto L_0x013c
            goto L_0x0139
        L_0x00ff:
            r3 = move-exception
            goto L_0x0103
        L_0x0101:
            r3 = move-exception
            r4 = r0
        L_0x0103:
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x010a
        L_0x0107:
            r2 = move-exception
            r3 = r0
            r4 = r3
        L_0x010a:
            io.bidmachine.core.Utils.flush(r4)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r4)     // Catch:{ all -> 0x0114 }
            io.bidmachine.core.Utils.close(r3)     // Catch:{ all -> 0x0114 }
            throw r2     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r2 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x011b
        L_0x0119:
            r1 = move-exception
            r2 = r0
        L_0x011b:
            io.bidmachine.core.Logger.log((java.lang.Throwable) r1)     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r9.obtainError((java.net.URLConnection) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0141 }
            r9.errorResult = r1     // Catch:{ all -> 0x0141 }
            boolean r1 = r2 instanceof java.net.HttpURLConnection
            if (r1 == 0) goto L_0x012d
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r2.disconnect()
        L_0x012d:
            r9.currentConnection = r0
            boolean r0 = r9.isCanceled()
            if (r0 != 0) goto L_0x0140
            ErrorResultType r0 = r9.errorResult
            if (r0 != 0) goto L_0x013c
        L_0x0139:
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Success
            goto L_0x013e
        L_0x013c:
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Fail
        L_0x013e:
            r9.currentState = r0
        L_0x0140:
            return
        L_0x0141:
            r1 = move-exception
            boolean r3 = r2 instanceof java.net.HttpURLConnection
            if (r3 == 0) goto L_0x014b
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r2.disconnect()
        L_0x014b:
            r9.currentConnection = r0
            boolean r0 = r9.isCanceled()
            if (r0 != 0) goto L_0x015e
            ErrorResultType r0 = r9.errorResult
            if (r0 != 0) goto L_0x015a
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Success
            goto L_0x015c
        L_0x015a:
            io.bidmachine.core.NetworkRequest$State r0 = io.bidmachine.core.NetworkRequest.State.Fail
        L_0x015c:
            r9.currentState = r0
        L_0x015e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.core.NetworkRequest.process():void");
    }

    /* access modifiers changed from: protected */
    public void prepareRequestParams(URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(40000);
        uRLConnection.setReadTimeout(40000);
    }

    /* access modifiers changed from: protected */
    public byte[] obtainRequestData(URLConnection uRLConnection) throws Exception {
        RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> requestDataBinder = this.dataBinder;
        if (requestDataBinder == null) {
            return null;
        }
        requestDataBinder.prepareRequest(this, uRLConnection);
        this.dataBinder.prepareHeaders(this, uRLConnection);
        return this.dataBinder.obtainData(this, uRLConnection, this.requestData);
    }

    /* access modifiers changed from: protected */
    public byte[] encodeRequestData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.dataEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                RequestDataEncoder next = it.next();
                next.prepareHeaders(this, uRLConnection);
                bArr = next.encode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.contentEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                RequestDataEncoder next2 = it2.next();
                next2.prepareHeaders(this, uRLConnection);
                bArr = next2.encode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public byte[] decodeResponseData(URLConnection uRLConnection, byte[] bArr) throws Exception {
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList = this.contentEncoders;
        if (arrayList != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it = arrayList.iterator();
            while (it.hasNext()) {
                bArr = it.next().decode(this, uRLConnection, bArr);
            }
        }
        ArrayList<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> arrayList2 = this.dataEncoders;
        if (arrayList2 != null) {
            Iterator<RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType>> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                bArr = it2.next().decode(this, uRLConnection, bArr);
            }
        }
        return bArr;
    }

    private int obtainResponseCode(URLConnection uRLConnection) throws IOException {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    private InputStream obtainErrorStream(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getErrorStream();
        }
        return null;
    }

    public void cancel() {
        this.currentState = State.Canceled;
        CancelCallback cancelCallback2 = this.cancelCallback;
        if (cancelCallback2 != null) {
            cancelCallback2.onCanceled();
        }
    }

    public boolean isCanceled() {
        return this.currentState == State.Canceled;
    }

    static abstract class ProtobufDataBinder<RequestDataType extends AbstractMessage, RequestResultType, ErrorResultType> extends RequestDataBinder<RequestDataType, RequestResultType, ErrorResultType> {
        ProtobufDataBinder() {
        }

        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }

        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, RequestDataType requestdatatype) {
            if (requestdatatype != null) {
                return requestdatatype.toByteArray();
            }
            return null;
        }
    }

    static abstract class JsonDataBinder<RequestResultType, ErrorResultType> extends RequestDataBinder<JSONObject, RequestResultType, ErrorResultType> {
        JsonDataBinder() {
        }

        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }

        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<JSONObject, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, JSONObject jSONObject) throws Exception {
            if (jSONObject != null) {
                return jSONObject.toString().getBytes("UTF-8");
            }
            return null;
        }
    }

    public static class SimpleJsonObjectDataBinder<ErrorResultType> extends JsonDataBinder<JSONObject, ErrorResultType> {
        /* access modifiers changed from: protected */
        public JSONObject createSuccessResult(NetworkRequest<JSONObject, JSONObject, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONObject(new String(bArr));
        }
    }

    public static class SimpleJsonArrayDataBinder<ErrorResultType> extends JsonDataBinder<JSONArray, ErrorResultType> {
        /* access modifiers changed from: protected */
        public JSONArray createSuccessResult(NetworkRequest<JSONObject, JSONArray, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return new JSONArray(new String(bArr));
        }
    }

    public static class Base64RequestDataEncoder extends RequestDataEncoder {
        /* access modifiers changed from: protected */
        public byte[] encode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.encode(bArr, 0);
        }

        /* access modifiers changed from: protected */
        public byte[] decode(NetworkRequest networkRequest, URLConnection uRLConnection, byte[] bArr) {
            return Base64.decode(bArr, 0);
        }
    }

    public static class GZIPRequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> extends RequestDataEncoder<RequestDataType, RequestResultType, ErrorResultType> {
        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Accept-Encoding", "gzip");
            uRLConnection.setRequestProperty("Content-Encoding", "gzip");
        }

        /* access modifiers changed from: protected */
        public byte[] encode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        Utils.close(gZIPOutputStream);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        Utils.flush(byteArrayOutputStream2);
                        Utils.close(byteArrayOutputStream2);
                        Utils.flush((Flushable) null);
                        Utils.close((Closeable) null);
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        Utils.flush(byteArrayOutputStream);
                        Utils.close(byteArrayOutputStream);
                        Utils.flush(gZIPOutputStream);
                        Utils.close(gZIPOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    Utils.flush(gZIPOutputStream);
                    Utils.close(gZIPOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = null;
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.flush(gZIPOutputStream);
                Utils.close(gZIPOutputStream);
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public byte[] decode(NetworkRequest<RequestDataType, RequestResultType, ErrorResultType> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            GZIPInputStream gZIPInputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            Throwable th;
            ByteArrayInputStream byteArrayInputStream;
            if (!"gzip".equals(uRLConnection.getContentEncoding())) {
                return bArr;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        gZIPInputStream = null;
                        th = th3;
                        Utils.flush(byteArrayOutputStream);
                        Utils.close(byteArrayOutputStream);
                        Utils.close(byteArrayInputStream);
                        Utils.close(gZIPInputStream);
                        throw th;
                    }
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr2);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Utils.flush(byteArrayOutputStream);
                                Utils.close(byteArrayOutputStream);
                                Utils.close(byteArrayInputStream);
                                Utils.close(gZIPInputStream);
                                return byteArray;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        Utils.flush(byteArrayOutputStream);
                        Utils.close(byteArrayOutputStream);
                        Utils.close(byteArrayInputStream);
                        Utils.close(gZIPInputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    byteArrayInputStream = null;
                    th = th5;
                    gZIPInputStream = null;
                    Utils.flush(byteArrayOutputStream);
                    Utils.close(byteArrayOutputStream);
                    Utils.close(byteArrayInputStream);
                    Utils.close(gZIPInputStream);
                    throw th;
                }
            } catch (Throwable th6) {
                gZIPInputStream = null;
                byteArrayInputStream = null;
                th = th6;
                byteArrayOutputStream = null;
                Utils.flush(byteArrayOutputStream);
                Utils.close(byteArrayOutputStream);
                Utils.close(byteArrayInputStream);
                Utils.close(gZIPInputStream);
                throw th;
            }
        }
    }

    private final class NetworkRequestRunner implements Runnable {
        private NetworkRequestRunner() {
        }

        public void run() {
            NetworkRequest.this.process();
            if (NetworkRequest.this.callback != null && !NetworkRequest.this.isCanceled()) {
                if (NetworkRequest.this.currentState == State.Success) {
                    NetworkRequest.this.callback.onSuccess(NetworkRequest.this.requestResult);
                } else {
                    NetworkRequest.this.callback.onFail(NetworkRequest.this.errorResult);
                }
            }
        }
    }
}
