package kr.co.selab.selabtodo.model.dto;

import kr.co.selab.selabtodo.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class TodoResponse {
    private Long id;
    private String title;
    private Boolean completed;

    public static TodoResponse of(Todo todo) {
        return TodoResponse.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .completed(todo.getCompleted())
                .build();
    }
}