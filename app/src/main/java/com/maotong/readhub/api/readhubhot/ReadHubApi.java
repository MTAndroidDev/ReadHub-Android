package com.maotong.readhub.api.readhubhot;

import com.maotong.readhub.bean.readhub.hot.newdata.DataList;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ReadHubApi {

    @GET("/topic?pageSize=10")
    Observable<DataList> getMoreData(@Query("lastCursor") String offset);

}
