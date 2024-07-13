package io.bidmachine;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.explorestack.protobuf.openrtb.Openrtb;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.protobuf.InitRequest;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.utils.BMError;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

class ApiRequest<RequestDataType, ResponseType> extends NetworkRequest<RequestDataType, ResponseType, BMError> {
    static int REQUEST_TIMEOUT = 10000;
    String requiredUrl;
    int timeOut;

    public static abstract class ApiDataBinder<RequestDataType, ResponseDataType> extends NetworkRequest.RequestDataBinder<RequestDataType, ResponseDataType, BMError> {
    }

    public static class ApiTrackerDataBinder extends ApiDataBinder<Object, String> {
        /* access modifiers changed from: protected */
        public String createSuccessResult(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return null;
        }

        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection, Object obj) throws Exception {
            return null;
        }

        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<Object, String, BMError> networkRequest, URLConnection uRLConnection) {
        }
    }

    private ApiRequest(NetworkRequest.Method method, String str, RequestDataType requestdatatype) {
        super(method, str, requestdatatype);
        addContentEncoder(new NetworkRequest.GZIPRequestDataEncoder());
    }

    /* access modifiers changed from: protected */
    public BMError obtainError(URLConnection uRLConnection, int i) {
        if (i >= 200 && i < 300) {
            return BMError.BMServerNoFill;
        }
        if (i >= 400 && i < 500) {
            return BMError.Request;
        }
        if (i < 500 || i >= 600) {
            return BMError.internal("Unknown server error");
        }
        return BMError.Server;
    }

    /* access modifiers changed from: protected */
    public BMError obtainError(URLConnection uRLConnection, Throwable th) {
        Logger.log("obtainError: " + th + "(" + uRLConnection + ")");
        if (th instanceof UnknownHostException) {
            return BMError.NoConnection;
        }
        if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            return BMError.TimeoutError;
        }
        return BMError.internal("Unknown server error");
    }

    /* access modifiers changed from: protected */
    public String getBaseUrl() {
        return this.requiredUrl;
    }

    /* access modifiers changed from: protected */
    public void prepareRequestParams(URLConnection uRLConnection) {
        super.prepareRequestParams(uRLConnection);
        uRLConnection.setConnectTimeout(this.timeOut);
        uRLConnection.setReadTimeout(this.timeOut);
    }

    public static class Builder<RequestDataType, ResponseDataType> {
        private NetworkRequest.Callback<ResponseDataType, BMError> callback;
        private NetworkRequest.CancelCallback cancelCallback;
        private ApiDataBinder<RequestDataType, ResponseDataType> dataBinder;
        private NetworkRequest.Method method = NetworkRequest.Method.Post;
        private RequestDataType requestData;
        private int timeOut = ApiRequest.REQUEST_TIMEOUT;
        private String url;

        public Builder<RequestDataType, ResponseDataType> url(String str) {
            this.url = str;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setDataBinder(ApiDataBinder<RequestDataType, ResponseDataType> apiDataBinder) {
            this.dataBinder = apiDataBinder;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setRequestData(RequestDataType requestdatatype) {
            this.requestData = requestdatatype;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setLoadingTimeOut(int i) {
            if (i <= 0) {
                i = ApiRequest.REQUEST_TIMEOUT;
            }
            this.timeOut = i;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCallback(NetworkRequest.Callback<ResponseDataType, BMError> callback2) {
            this.callback = callback2;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setCancelCallback(NetworkRequest.CancelCallback cancelCallback2) {
            this.cancelCallback = cancelCallback2;
            return this;
        }

        public Builder<RequestDataType, ResponseDataType> setMethod(NetworkRequest.Method method2) {
            this.method = method2;
            return this;
        }

        public String getUrl() {
            return this.url;
        }

        public ApiRequest<RequestDataType, ResponseDataType> build() {
            ApiRequest<RequestDataType, ResponseDataType> apiRequest = new ApiRequest<>(this.method, (String) null, this.requestData);
            apiRequest.setCallback(this.callback);
            apiRequest.setCancelCallback(this.cancelCallback);
            apiRequest.setDataBinder(this.dataBinder);
            apiRequest.requiredUrl = this.url;
            apiRequest.timeOut = this.timeOut;
            return apiRequest;
        }

        public ApiRequest<RequestDataType, ResponseDataType> request() {
            ApiRequest<RequestDataType, ResponseDataType> build = build();
            build.request();
            return build;
        }
    }

    public static class ApiInitDataBinder extends ApiDataBinder<InitRequest, InitResponse> {
        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
        }

        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection, InitRequest initRequest) throws Exception {
            OrtbUtils.dump("Init request", initRequest);
            if (initRequest != null) {
                return initRequest.toByteArray();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public InitResponse createSuccessResult(NetworkRequest<InitRequest, InitResponse, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            return InitResponse.parseFrom(bArr);
        }
    }

    public static class ApiResponseAuctionDataBinder extends ApiDataBinder<Request, Response> {
        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, Request request) throws Exception {
            return null;
        }

        /* access modifiers changed from: protected */
        public void prepareHeaders(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection) {
            uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
            Logger.log("Auction request headers", (Map<?, ?>) uRLConnection.getRequestProperties());
        }

        /* access modifiers changed from: protected */
        public Response createSuccessResult(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, byte[] bArr) throws Exception {
            Openrtb parseFrom = Openrtb.parseFrom(bArr);
            if (parseFrom == null) {
                return null;
            }
            OrtbUtils.dump(LogConstants.EVENT_RESPONSE, parseFrom);
            return parseFrom.getResponse();
        }
    }

    public static class ApiAuctionDataBinder extends ApiResponseAuctionDataBinder {
        /* access modifiers changed from: protected */
        public byte[] obtainData(NetworkRequest<Request, Response, BMError> networkRequest, URLConnection uRLConnection, Request request) throws Exception {
            Openrtb.Builder newBuilder = Openrtb.newBuilder();
            newBuilder.setRequest(request);
            newBuilder.setVer("3.0");
            newBuilder.setDomainspec("adcom");
            newBuilder.setDomainver("1.0");
            OrtbUtils.dump("Auction request", newBuilder);
            return newBuilder.build().toByteArray();
        }
    }
}
