package com.practice.springboot.springbootpractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
        @RequestMapping("/topics")
    public List<Topic> getTopics(){
//        Topic t1 = new Topic(100,"Spring","spring Frame work");
//        Topic t2 = new Topic(101,"Java","Java Programming");
//        Topic t3 = new Topic(102,"SpringBoot","springBoot Frame work");
//        Topic t4 =new Topic();
//        List<Topic> topiclist = new ArrayList<>();
//        topiclist.add(t1);
//        topiclist.add(t2);
//        topiclist.add(t3);
//        topiclist.add(t4);
        return Arrays.asList( new Topic(100,"Spring","spring Frame work"),
                new Topic(101,"Java","Java Programming"),
                new Topic(102,"SpringBoot","springBoot Frame work"));
    }

}
