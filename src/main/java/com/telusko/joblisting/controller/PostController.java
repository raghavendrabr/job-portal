package com.telusko.joblisting.controller;

import com.telusko.joblisting.repository.PostRepository;
import com.telusko.joblisting.model.Post;
import com.telusko.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController
{
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        System.out.println("getMapping");
        return repo.findAll();
    }
    //post/java
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){


        return repo.save(post);


    }



}
// @GetMapping
// @PostMapping
// @RestController
// @ResponseBody
// @RequestBody
// @AutoWired
// @PathVariable
// ctrl space
