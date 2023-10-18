package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.logged_in.LoggedInState;
import interface_adapter.login.LoginState;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import use_case.login.LoginOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData users) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsers(users.get_usernames());
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

    }

}
