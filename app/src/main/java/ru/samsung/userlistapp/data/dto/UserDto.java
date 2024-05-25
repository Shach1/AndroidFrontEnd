package ru.samsung.userlistapp.data.dto;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class UserDto
{
    @Nullable
    @SerializedName("id")
    public String id;

    @Nullable
    @SerializedName("name")
    public String name;

    @Nullable
    @SerializedName("email")
    public String email;

    @Nullable
    @SerializedName("phone")
    public String phone;

    @Nullable
    @SerializedName("photoUrl")
    public String photoUrl;

    @Nullable
    @SerializedName("username")
    public String username;
}
