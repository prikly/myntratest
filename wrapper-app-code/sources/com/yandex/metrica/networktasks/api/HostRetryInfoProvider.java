package com.yandex.metrica.networktasks.api;

public interface HostRetryInfoProvider {
    long getLastAttemptTimeSeconds();

    int getNextSendAttemptNumber();

    void saveLastAttemptTimeSeconds(long j);

    void saveNextSendAttemptNumber(int i);
}
