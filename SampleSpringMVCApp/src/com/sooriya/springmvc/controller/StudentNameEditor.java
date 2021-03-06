package com.sooriya.springmvc.controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String studentName) throws IllegalArgumentException {

        if (studentName.contains("Mr.") || studentName.contains("Ms.") || studentName.contains("Mrs.")) {
            setValue(studentName);
        } else {
            studentName = "Sri. " + studentName;
            setValue(studentName);
        }
    }
}
