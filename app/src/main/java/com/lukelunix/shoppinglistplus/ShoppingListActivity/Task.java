package com.lukelunix.shoppinglistplus.ShoppingListActivity;


public class Task {

    private boolean done;
    private String taskDescription;


    public Task(){
    }

    public boolean isDone(){
        return done;
    }
    public void setDone(boolean done){
        this.done = done;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String toString(){
        return taskDescription;
    }

}

