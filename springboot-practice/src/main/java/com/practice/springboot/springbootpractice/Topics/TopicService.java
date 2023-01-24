package com.practice.springboot.springbootpractice.Topics;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    public List<Topic> topics = Arrays.asList(new Topic(100,"Spring","spring Frame work"),
            new Topic(101,"Java","Java Programming"),
            new Topic(102,"SpringBoot","springBoot Frame work"),
            new Topic());
    public List<Topic> getAllTopics() {
        return topics;
    }

    public  Topic getTopic(int id){
        return topics.stream().filter(t-> t.getId()==id).findFirst().get();
    }



}
