package com.neuedu.day_13.hashmaptest;

import java.util.Objects;

public class Pet {
    private String name;
    private String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) &&
                Objects.equals(kind, pet.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kind);
    }
}
