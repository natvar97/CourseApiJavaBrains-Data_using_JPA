package com.indialone.courseapijavabrainsdata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopicById(@PathVariable("id") String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic , @PathVariable("id") String id) {
        topicService.updateTopic(id , topic);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/topics/{id}")
    public void deleteTopicById(@PathVariable("id") String id) {
        topicService.deleteTopicById(id);
    }

}
