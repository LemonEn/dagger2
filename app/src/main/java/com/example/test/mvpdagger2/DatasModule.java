package com.example.test.mvpdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 张萌 on 2017/7/3.
 */

@Module
public class DatasModule {
    private MainActivity activity;

    public DatasModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    Datas getDatas(){
        return  new Datas();
    }

    @Provides
    OtherData  getImage(){
        return new OtherData();
    }
}
