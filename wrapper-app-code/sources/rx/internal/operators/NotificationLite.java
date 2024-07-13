package rx.internal.operators;

import java.io.Serializable;
import rx.Observer;

public final class NotificationLite {
    private static final Object ON_COMPLETED_SENTINEL = new Serializable() {
        public String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object ON_NEXT_NULL_SENTINEL = new Serializable() {
        public String toString() {
            return "Notification=>NULL";
        }
    };

    static final class OnErrorSentinel implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final Throwable f9760e;

        public OnErrorSentinel(Throwable th) {
            this.f9760e = th;
        }

        public String toString() {
            return "Notification=>Error:" + this.f9760e;
        }
    }

    public static <T> Object next(T t) {
        return t == null ? ON_NEXT_NULL_SENTINEL : t;
    }

    public static Object completed() {
        return ON_COMPLETED_SENTINEL;
    }

    public static Object error(Throwable th) {
        return new OnErrorSentinel(th);
    }

    public static <T> boolean accept(Observer<? super T> observer, Object obj) {
        if (obj == ON_COMPLETED_SENTINEL) {
            observer.onCompleted();
            return true;
        } else if (obj == ON_NEXT_NULL_SENTINEL) {
            observer.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == OnErrorSentinel.class) {
            observer.onError(((OnErrorSentinel) obj).f9760e);
            return true;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    public static boolean isCompleted(Object obj) {
        return obj == ON_COMPLETED_SENTINEL;
    }

    public static boolean isError(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    public static boolean isNext(Object obj) {
        return obj != null && !isError(obj) && !isCompleted(obj);
    }

    public static <T> T getValue(Object obj) {
        if (obj == ON_NEXT_NULL_SENTINEL) {
            return null;
        }
        return obj;
    }
}
