package com.example.fizzbuzzapp;

public interface FizzContract {

    interface ViewContract{
        void showFizzBuzz(String string);
    }

    interface PresenterContract{
        void result(String input);
    }

}
