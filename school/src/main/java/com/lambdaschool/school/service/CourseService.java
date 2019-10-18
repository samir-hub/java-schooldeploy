package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.view.CountStudentsInCourses;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.Optional;

public interface CourseService
{
    ArrayList<Course> findAllPageable(Pageable pageable);

    ArrayList<Course> findAll();

    Course save (Course course);

    Optional<Course> findCourseById(long id);

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);
}
