package com.google.sps.model;

import java.util.ArrayList;
import java.util.List;

import com.google.auto.value.AutoValue;

@AutoValue
public class UserList {
    List<String> associatedUsernames;
    List<Long> associatedUserIDs;
    List<String> failedToAdd;

    public UserList(List<String> usernamesAssociated, List<Long> userIDsAssociated){
        this.associatedUsernames = usernamesAssociated;
        this.associatedUserIDs = userIDsAssociated;
        this.failedToAdd = new ArrayList<String>();
    }

    public UserList(){
        this.failedToAdd = new ArrayList<String>();
    }

    public void addError(String msg){
        failedToAdd.add(msg);
    }

	public void setAssociatedUserIDs(List<Long> userIDs) {
        this.associatedUserIDs = userIDs;
	}

	public void setAssociatedUsernames(List<String> usernames) {
        this.associatedUsernames = usernames;
	}
}
