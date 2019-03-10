package com.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Lesson {
    private String name;
    private String classRoom;
    private String lecturer;
    private String type;
    private String status;

    public String getAnswerLessonForm() {
        String answer = "";

        answer = answer + "\nНазвание: " + name;
        answer = answer + "\nАудитория: " + classRoom;
        answer = answer + "\nТип: " + lecturer;
        answer = answer + "\nПрепод: " + type;
        answer = answer + "\nКомментарий: " + status;

        return answer;
    }
}
