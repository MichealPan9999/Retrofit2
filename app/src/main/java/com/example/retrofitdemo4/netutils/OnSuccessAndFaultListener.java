package com.example.retrofitdemo4.netutils;

/**
 */
public interface OnSuccessAndFaultListener {
    void onSuccess(String result);

    void onFault(String errorMsg);
}
