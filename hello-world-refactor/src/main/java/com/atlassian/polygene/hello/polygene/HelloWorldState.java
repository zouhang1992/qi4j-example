package com.atlassian.polygene.hello.polygene;

public interface HelloWorldState {

    void setPhrase(String phrase);

    String getPhrase();

    void setName(String name);

    String getName();
}
