package br.com.course.devdojo.springboot2.repository;

import br.com.course.devdojo.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
