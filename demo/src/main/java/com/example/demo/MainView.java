package com.example.demo;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.awt.*;

import static org.apache.coyote.http11.Constants.a;
@Route("")
class MainView extends VerticalLayout {
    MainView(){
        add(new H1("Hello, please enter your name below:"));
        var button = new Button("Click Me!");
        var textField = new TextField();

        add(new HorizontalLayout(textField, button));

        button.addClickListener(e -> {
            add(new Paragraph("Hello, " + textField.getValue()));
            textField.clear();
        });

    }
}
//echo "# spring-boot-attempt" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Jhoode/spring-boot-attempt.git
//git push -u origin main