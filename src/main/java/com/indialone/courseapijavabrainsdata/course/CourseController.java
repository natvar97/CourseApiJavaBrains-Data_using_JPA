package com.indialone.courseapijavabrainsdata.course;

import com.indialone.courseapijavabrainsdata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable("topicId") String topicId) {
        return courseService.getCourses(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable("id") String id) {
        return courseService.getCourseById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        Topic topic = new Topic(topicId, "", " ");
        course.setTopic(topic);
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable("id") String id) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{id}")
    public void deleteCourseById(@PathVariable("id") String id) {
        courseService.deleteCourseById(id);
    }

}
