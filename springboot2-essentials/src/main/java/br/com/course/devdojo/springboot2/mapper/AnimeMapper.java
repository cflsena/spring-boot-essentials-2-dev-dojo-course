package br.com.course.devdojo.springboot2.mapper;

import br.com.course.devdojo.springboot2.domain.Anime;
import br.com.course.devdojo.springboot2.request.AnimePostRequestBody;
import br.com.course.devdojo.springboot2.request.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public abstract class AnimeMapper {

    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
