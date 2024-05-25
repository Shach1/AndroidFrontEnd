package ru.samsung.userlistapp.domain;

import androidx.annotation.NonNull;

import java.util.function.Consumer;

import ru.samsung.userlistapp.domain.entites.FullUserEntity;
import ru.samsung.userlistapp.domain.entites.Status;

public class GetUserByIdUseCase
{
    private final UserRepository repository;

    public GetUserByIdUseCase(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public void execute(@NonNull String userId, @NonNull Consumer<Status<FullUserEntity>> callback)
    {
        repository.getUserById(userId, callback);
    }
}
