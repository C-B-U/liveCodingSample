package com.example.livecodingsample.entity;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Study {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String skillStack;
    private String leader;
    private String password;

    @Builder
    public Study(String name, String skillStack, String leader, String password) {
        this.name = name;
        this.skillStack = skillStack;
        this.leader = leader;
        this.password = password;
    }
}
