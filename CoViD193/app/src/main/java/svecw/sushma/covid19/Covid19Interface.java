package svecw.sushma.covid19;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Covid19Interface {
    @GET("dayone/country/IN")
    Call<String> getData();





}
