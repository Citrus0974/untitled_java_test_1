package edu.khityaev.structure;

class Command {
    Object rule;
    Command next = null;

    Command(Object rule){
        this.rule = rule;
    }


}
