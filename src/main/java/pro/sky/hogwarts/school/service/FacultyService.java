package pro.sky.hogwarts.school.service;

import pro.sky.hogwarts.school.model.Faculty;

import java.util.Set;

public interface FacultyService {
    Faculty createFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty updateFaculty(Faculty faculty);

    Faculty deleteFaculty(Long id);

    Set<Faculty> getFaculty();

    Set<Faculty> getFacultyWithColor(String color);
}
