package pro.sky.hogwarts.school.service;

import org.springframework.stereotype.Service;
import pro.sky.hogwarts.school.exception.FacultyAlreadyOnTheMapException;
import pro.sky.hogwarts.school.exception.FacultyNotFoundException;
import pro.sky.hogwarts.school.model.Faculty;

import javax.naming.Name;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FacultyServiceImpl implements FacultyService{
    private long generateFacultyId = 0;
    private final Map<Long, Faculty> facultyMap;

    public FacultyServiceImpl() {
        this.facultyMap = new HashMap<>();
    }

    @Override
    public Faculty createFaculty(Faculty faculty) {
        if (facultyMap.containsValue(faculty)) {
            throw new FacultyAlreadyOnTheMapException();
        }
        faculty.setId(++generateFacultyId);
        facultyMap.put(generateFacultyId, faculty);
        return faculty;
    }

    @Override
    public Faculty findFaculty(Long id) {
        if (facultyMap.containsKey(id)) {
            return facultyMap.get(id);
        }
//        throw new FacultyNotFoundException();
        return null;
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        if (facultyMap.containsKey(faculty.getId())) {
            return facultyMap.put(faculty.getId(), faculty);
        }
//        throw new FacultyNotFoundException();
        return null;
    }

    @Override
    public Faculty deleteFaculty(Long id) {
        if (facultyMap.containsKey(id)) {
            return facultyMap.remove(id);
        }
//        throw new FacultyNotFoundException();
        return null;
    }

    @Override
    public Set<Faculty> getFaculty() {
        return new HashSet<>(facultyMap.values());
    }

    @Override
    public Set<Faculty> getFacultyWithColor(String color) {
        return getFaculty().stream()
                .filter(faculty -> faculty.getColor().equals(color))
                .collect(Collectors.toSet());
    }


}
