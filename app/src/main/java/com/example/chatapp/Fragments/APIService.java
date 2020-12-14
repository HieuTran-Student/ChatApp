package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAZMzVyl4: APA91bHhF_eB8IR9qVFs1waaEZfopSjXqzHUqr3_8bjGcVTRJ7BRDTV3MhWQby4HpFLpWZ4EfQolJbpnz6fCge3nt4CoCqJVZNoMoXmXbJVJEZEZVJVMXBJOXBJVJEZEZVJEZBJVZBJVJVZEZEZEZEz"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
