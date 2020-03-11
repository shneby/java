package oop.model;

import java.util.Objects;

public class Grade {
    private String profession;
    private Integer score;

    public Grade(String profession, Integer score) {
        this.profession = profession;
        this.score = score;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return Objects.equals(profession, grade.profession) &&
                Objects.equals(score, grade.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profession, score);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "profession='" + profession + '\'' +
                ", score=" + score +
                '}';
    }
}
