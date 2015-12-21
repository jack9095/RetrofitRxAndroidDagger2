package com.micky.retrofitrxandroiddragger2.data.api;

import com.micky.retrofitrxandroiddragger2.data.api.response.GetIpInfoResponse;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * @Project RetrofitRxAndroidDragger2
 * @Packate com.micky.retrofitrxandroiddragger2.data.api
 * @Description
 * @Author Micky Liu
 * @Email mickyliu@126.com
 * @Date 2015-12-21 17:22
 * @Version 0.1
 */
public interface ApiService {
    /*@GET("service/getIpInfo.php")
    Call<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);*/

    @GET("service/getIpInfo.php")
    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);
}
