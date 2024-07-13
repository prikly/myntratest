package io.bidmachine.models;

public interface IBlockedParams<SelfType> {
    SelfType addBlockedAdvertiserDomain(String str);

    SelfType addBlockedAdvertiserIABCategory(String str);

    SelfType addBlockedApplication(String str);
}
