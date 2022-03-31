package com.example.myapp.mainList;

import com.example.myapp.Program;
import com.example.myapp.roomDB.User;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ServerApi {

    @GET("getAllProgramsData.php")
    Single<List<Program>> getAllProgramData();

    @GET("getProgramsDataByUserID.php?")
    Single<List<Program>> getProgramsDataById(@Query("userId") String userID);

    @GET("identificationUser.php?")
    Single<User> identificationUser(@Query("email") String email, @Query("password") String password);

    @FormUrlEncoded
    @POST("registerNewUser.php")
    Single<String> registerNewUser(@Field("userId") String userID,
                                   @Field("username") String username,
                                   @Field("email") String email,
                                   @Field("password") String password);

    @FormUrlEncoded
    @POST("changeUserPersonalData.php")
    Single<String> changeUserPersonalData(@Field("remoteDatabaseRowID") String remoteDatabaseRowID,
                                          @Field("userId") String userID,
                                          @Field("username") String username,
                                          @Field("email") String email,
                                          @Field("password") String password);

    @FormUrlEncoded
    @POST("addNewProgramData.php")
    Single<String> addRecord(@Field("userId") String userID,
                             @Field("programName") String programName,
                             @Field("email") String email,
                             @Field("password") String password,
                             @Field("description") String description,
                             @Field("timeData") String timeData,
                             @Field("dateData") String dateData);

    @FormUrlEncoded
    @POST("deleteProgramDataById.php")
    Single<String> deleteRecord(@Field("id") int id);



}
