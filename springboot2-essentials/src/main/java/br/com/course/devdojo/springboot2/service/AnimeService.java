package br.com.course.devdojo.springboot2.service;

import br.com.course.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"DBZ"), new Anime(2L, "Berserk"));
    }
}
