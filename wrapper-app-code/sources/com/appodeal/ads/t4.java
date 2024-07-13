package com.appodeal.ads;

import android.app.Application;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.consent.Consent;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;

public interface t4 {
    Object a(Application application, String str, Consent consent, Boolean bool, Continuation<? super Result<? extends List<? extends ApdInitializationError>>> continuation);
}
