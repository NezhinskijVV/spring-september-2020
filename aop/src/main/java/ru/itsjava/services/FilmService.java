package ru.itsjava.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.FilmDao;
import ru.itsjava.domain.Film;

@Service
public class FilmService {
    private final FilmDao filmDao;


    @Autowired
    public FilmService(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    public Film getFilm(String name) {
        return filmDao.getByName(name);
    }
}