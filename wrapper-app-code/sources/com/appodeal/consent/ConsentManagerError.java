package com.appodeal.consent;

import com.onesignal.OneSignalDbContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError;", "", "", "a", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "event", "b", "getMessage", "message", "LoadingError", "ShowingError", "Lcom/appodeal/consent/ConsentManagerError$LoadingError;", "Lcom/appodeal/consent/ConsentManagerError$ShowingError;", "apd_consent"}, k = 1, mv = {1, 6, 0})
public abstract class ConsentManagerError {

    /* renamed from: a  reason: collision with root package name */
    public final String f17800a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17801b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$LoadingError;", "Lcom/appodeal/consent/ConsentManagerError;", "message", "", "(Ljava/lang/String;)V", "apd_consent"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class LoadingError extends ConsentManagerError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoadingError(String str) {
            super("LoadingError", str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/appodeal/consent/ConsentManagerError$ShowingError;", "Lcom/appodeal/consent/ConsentManagerError;", "message", "", "(Ljava/lang/String;)V", "apd_consent"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ShowingError extends ConsentManagerError {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowingError(String str) {
            super("ShowingError", str, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        }
    }

    public ConsentManagerError(String str, String str2) {
        this.f17800a = str;
        this.f17801b = str2;
    }

    public /* synthetic */ ConsentManagerError(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String getEvent() {
        return this.f17800a;
    }

    public final String getMessage() {
        return this.f17801b;
    }
}
