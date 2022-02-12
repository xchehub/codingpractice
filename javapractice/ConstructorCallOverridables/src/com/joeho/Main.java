package com.joeho;

// ref. http://www.javapractices.com/topic/TopicAction.do?Id=215
// Java Practices->Constructors shouldn't call overridables
public class Main {

    public static void main(String[] args) {
	// write your code here
        log("Build an animal.");
        Animal animal = new Animal();
        log(" ");
        log("Build a fish.");
        Animal fish = new Fish();

        log(" ");
        log("Build another fish.");
        Fish anotherFish = new Fish();
    }

    private static void log(Object object) {
        System.out.println(object);
    }

    private static class Animal {
        Animal() {
            log("Animal");
            //call an overridable method from ctor - it's dangerous
            perform();
        }
        void perform() {
            log("Animal performing");
        }
    }

    private static class Fish extends Animal {
        Fish() {
            super();
            log("Fish");
        }
        @Override
        void perform() {
            //in general, this method can depend on Fish data
            log("Fish performing, Can fail since Tail Shape is : " + tailShape);
        }

        private String tailShape;
    }
}
