package use_case.clear_users;

// TODO Complete me

import use_case.login.LoginOutputData;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    public void execute(){
        ArrayList users = userDataAccessObject.get_users();
        this.userDataAccessObject.delete();
        ClearOutputData clearOutputData = new ClearOutputData(users);
        clearPresenter.prepareSuccessView(clearOutputData);


    }
}
