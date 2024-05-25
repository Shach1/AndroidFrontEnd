package ru.samsung.userlistapp.domain.entites;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FullUserEntity
{
    @NonNull
    private final String id;

    @NonNull
    private final String name;

    @Nullable
    private final String email;

    @Nullable
    private final String phone;

    @Nullable
    private final String photoUrl;

    @Nullable
    private final String username;

    public FullUserEntity(@NonNull String id,
                          @NonNull String name,
                          @Nullable String email,
                          @Nullable String phone,
                          @Nullable String photoUrl,
                          @Nullable String username
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.photoUrl = photoUrl;
        this.username = username;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    @Nullable
    public String getPhone() {
        return phone;
    }

    @Nullable
    public String getPhotoUrl() {
        return photoUrl;
    }

    @Nullable
    public String getUsername() {
        return username;
    }
}
