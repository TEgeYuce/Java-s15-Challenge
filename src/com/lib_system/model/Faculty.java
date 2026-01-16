package com.lib_system.model;

public class Faculty extends Reader {

    private String facultyId;

    public Faculty(String name, MemberRecord memberRecord, String facultyId) {
        super(name, memberRecord);
        this.facultyId = facultyId;
    }

    public String getFacultyId() {
        return this.facultyId;
    }

    @Override
    public String whoYouAre() {
        return "I am a Faculty member -> " + super.getName() + " ID = " + facultyId + " ";
    }


}

