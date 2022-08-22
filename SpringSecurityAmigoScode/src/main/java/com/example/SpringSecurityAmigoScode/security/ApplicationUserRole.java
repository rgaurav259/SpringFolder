package com.example.SpringSecurityAmigoScode.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.SpringSecurityAmigoScode.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()), //no permission this is empty
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE)),//all permission
    ADMINTRAINEE(Sets.newHashSet(COURSE_READ,STUDENT_READ));//only read permission



    private final Set<ApplicationUserPermission> permissions;

//constructor
    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    //getter
    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
