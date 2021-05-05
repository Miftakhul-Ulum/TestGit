package com.viewmodelapp;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private Integer angka;

    public Integer setAngka(){
        if (angka==null){
            angka = 0;
        }
        return angka;
    }
    public void addAngka (){
        if (angka == null){
            angka = 0;
        }
        angka +=1;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
