package com.main.java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Parent {

	private final String parentName;
	private final int parentAge;
}

@Setter
@Getter
class Child extends Parent {
    private final String childName;
    private final int childAge;
    
    @Builder
    public Child(String parentName, int parentAge, String childName, int childAge) {
        super(parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }
}