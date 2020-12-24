package br.com.course.devdojo.springboot2.domain;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;
}
