package com.squareup.picasso;

public interface Callback {
    void onError(Exception exc);

    void onSuccess();
}
