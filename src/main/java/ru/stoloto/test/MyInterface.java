package ru.stoloto.test;

public interface MyInterface {

    @RemoteMethod
    int doSOme(DummyClass dummyClass);
}
