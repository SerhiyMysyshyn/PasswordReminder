package com.example.myapp.roomDB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Single;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User")
    Single<List<User>> getAllUsers();

    @Query("SELECT * FROM User WHERE id = :id")
    Single<User> getUserById(long id);

    @Query("SELECT email FROM User WHERE id = :id")
    Single<String> getCurrentUserEmailById(long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Single<Long> insertUser(User user);

    @Update
    int updateUser(User user);

    @Delete
    Single<Integer> deleteUser(User user);

}
