package com.viewmodelapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
   private MutableLiveData <Integer> angka;

    public MutableLiveData<Integer> getAngka(){
        if(angka==null){
            angka= new MutableLiveData<>();
            angka.setValue(0);
        }
        return angka;
    }
    public void addAngka(){
        if(angka.getValue() !=null){
            angka.setValue(angka.getValue() +1);
        }
    }

//      aplikasi tanpa mutablelivedata
//    private Integer angka;
//    public Integer setAngka(){
//        if (angka==null){
//            angka = 0;
//        }
//        return angka;
//    }
//    public void addAngka (){
//        if (angka == null){
//            angka = 0;
//        }
//        angka +=1;
//    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
