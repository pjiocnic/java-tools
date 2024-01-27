package demo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Widget {
    private String name;
    private int id;
}