package edu.khityaev.structure;

import java.util.List;

public abstract class Command<T, R> {

//    public Command(Command<T, R> previous) {
//        this.previous = previous;
//    }


    Command next;

    public abstract List applyCommand(List<?> flowList);

    public void addNext(Command command){
        if (next == null){
            next = command;
        } else {
            next.addNext(command);
        }
    };



}
