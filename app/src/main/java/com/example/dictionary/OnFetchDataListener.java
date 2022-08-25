package com.example.dictionary;

import com.example.dictionary.Model.APIResponse;

public interface OnFetchDataListener {
    void onFetchData (APIResponse apiResponse, String message);
    void onError (String message);
}
