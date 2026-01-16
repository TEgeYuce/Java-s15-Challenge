package com.lib_system.model;

public class Student extends Reader {

    private String studentId;

    public Student(String name, MemberRecord memberRecord, String studentId) {
        super(name, memberRecord);
        this.studentId = studentId;
    }

    public String getStudentId() { return this.studentId; }

    @Override
    public String whoYouAre() {
        return "I am a Student -> " + super.getName() + " ID = " + studentId + " ";
    }


}

