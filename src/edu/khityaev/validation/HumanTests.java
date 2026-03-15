package edu.khityaev.validation;

import edu.khityaev.life.Human;

public class HumanTests {

    @ValidationTest
    public void TestNameTooShort(Human h){
        if(h.getNameString().length()<2) throw new TestFailedException("name is shorter than 2 characters");
    }

    @ValidationTest
    public void TestNameTooLong(Human h){
        if(h.getNameString().length()>10) throw new TestFailedException("name is longer then 10 characters");
    }
}
