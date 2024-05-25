package ru.samsung.userlistapp.domain;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.function.Consumer;

import ru.samsung.userlistapp.domain.entites.ItemUserEntity;
import ru.samsung.userlistapp.domain.entites.Status;

public class GetUsersListUseCase
{
    private final UserRepository userRepository;

    public GetUsersListUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(@NonNull Consumer<Status<List<ItemUserEntity>>> callback) {
        userRepository.getAllUsers(callback);
    }

}
