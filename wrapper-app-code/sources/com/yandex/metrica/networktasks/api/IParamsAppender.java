package com.yandex.metrica.networktasks.api;

import android.net.Uri;

public interface IParamsAppender {
    void appendParams(Uri.Builder builder, Object obj);
}
