package com.example.test.mvpdagger2;


import dagger.Component;

/**
 * Created by 张萌 on 2017/7/3.
 */
@Component(modules = DatasModule.class)
    public interface DatasComponent {
    void  inject(MainActivity  activity);
}
