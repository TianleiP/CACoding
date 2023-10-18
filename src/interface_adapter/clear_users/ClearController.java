package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {

    final ClearInputBoundary userclearUseCaseInteractor;

    public ClearController(ClearInputBoundary userclearUseCaseInteractor) {
        this.userclearUseCaseInteractor = userclearUseCaseInteractor;
    }

    public void execute(){
    userclearUseCaseInteractor.execute();
    }
}
