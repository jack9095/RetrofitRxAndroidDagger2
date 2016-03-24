package com.micky.retrofitrxandroiddagger2.data.api;

import com.micky.retrofitrxandroiddagger2.data.api.response.GetIpInfoResponse;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;


public interface ApiService {
  /*  @GET("service/getIpInfo.php")
    Call<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);*/

    @GET("service/getIpInfo.php")
    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);
}
