package com.kalash;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor textEditor = injector.getInstance(TextEditor.class);
        textEditor.makeSpellCheck();
    }
}
