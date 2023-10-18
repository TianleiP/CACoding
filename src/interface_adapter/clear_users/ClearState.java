package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;

import java.util.ArrayList;

public class ClearState {
    private ArrayList users = new ArrayList<>();
    public ClearState(ClearState copy) {
        users = copy.users;
    }
    public ClearState(){

    }

    public void setUsers(ArrayList users){
        this.users = users;
    }

    public ArrayList getUsers(){
        return(users);
    }


}
