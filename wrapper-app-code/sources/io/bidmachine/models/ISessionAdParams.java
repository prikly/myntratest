package io.bidmachine.models;

public interface ISessionAdParams<SelfType> {
    SelfType setClickRate(Float f2);

    SelfType setCompletionRate(Float f2);

    SelfType setImpressionCount(Integer num);

    SelfType setIsUserClickedOnLastAd(Boolean bool);

    SelfType setSessionDuration(Integer num);
}
