package com.practice.springboot.springbootpractice.Topics;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(100,"Spring","spring Frame work"),
            new Topic(101,"Java","Java Programming"),
            new Topic(102,"SpringBoot","springBoot Frame work")
           ));
    public List<Topic> getAllTopics() {
        return topics;
    }

    public  Topic getTopic(int id){
        return topics.stream().filter(t-> t.getId()==id).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(Topic topic,int id) {
        for(int i=0;i< topics.size();i++){
            Topic t= topics.get(i);
            if(t.getId()==id) {
                topics.set(i, topic);
                return;
            }


        }

    }

    public void deleteTopic(int id) {
        topics.removeIf(t->t.getId()==id);
    }
}
