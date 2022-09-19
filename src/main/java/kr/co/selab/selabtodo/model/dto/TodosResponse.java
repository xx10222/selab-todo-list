package kr.co.selab.selabtodo.model.dto;

import kr.co.selab.selabtodo.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;

@Builder
@AllArgsConstructor
public class TodosResponse {
    private List<Todo> todos;
}