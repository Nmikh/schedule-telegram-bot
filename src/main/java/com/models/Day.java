package com.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Day {
    private String name;
    private Lesson firstLesson;
    private Lesson secondLesson;
    private Lesson thirdLesson;

    public String getAnswerDayForm() {
        String answer = "1-я";
        if (firstLesson != null) {
            answer = answer + firstLesson.getAnswerLessonForm();
        }
        answer = answer + "\n--------------\n2-я";
        if (secondLesson != null) {
            answer = answer + secondLesson.getAnswerLessonForm();
        }
        answer = answer + "\n--------------\n3-я";
        if (thirdLesson != null) {
            answer = answer + thirdLesson.getAnswerLessonForm();
        }
        return answer;
    }
}
