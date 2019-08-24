package com.example.fizzbuzzapp;

public class FizzPresenter implements FizzContract.ViewContract {

    private FizzContract.PresenterContract viewContract;

    public FizzPresenter(FizzContract.PresenterContract viewContract) {

        this.viewContract = viewContract;

    }


    public void onInput(String input) {

        int inputAsInt = Integer.parseInt(input);

        String output = "" + inputAsInt;

        viewContract.result(output);

    }
    private String fizzObuzz(int inputAsInt,String outPut){

        if (inputAsInt % 15 == 0){
            outPut = "Fizzbuzz";

        } else if (inputAsInt % 5 == 0){
            outPut = "Buzz";
        } else {
            outPut = "" + inputAsInt;
        }

       return outPut;

    }

    @Override
    public void showFizzBuzz(String string) {

    }
}