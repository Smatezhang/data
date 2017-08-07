package com.zhuoxin.zhang.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();
        Myservice mMyservice = mRetrofit.create(Myservice.class);
    }


    public interface Myservice{
       Call<NewInfo> getBlog(int id);
    }
}
