package ru.samsung.userlistapp.ui.list;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.samsung.userlistapp.R;
import ru.samsung.userlistapp.databinding.FragmentListBinding;

public class UserListFragment extends Fragment
{
    private FragmentListBinding binding; // отвечает за взаимодействие с UI
    private UserListViewModel viewModel; // отвечает за взаимодействие с данными

    public UserListFragment() {
        super(R.layout.fragment_list);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentListBinding.bind(view);
        viewModel = new ViewModelProvider(this).get(UserListViewModel.class);
    }

    @Override
    public void onDestroyView() {
        binding = null;
        super.onDestroyView();
    }
}
