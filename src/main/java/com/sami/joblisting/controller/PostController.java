package com.sami.joblisting.controller;


import com.sami.joblisting.repository.PostRepository;
import com.sami.joblisting.model.JobPost;
import com.sami.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*/")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/posts")
    @CrossOrigin
    public List<JobPost> getAllPosts() {
      return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<JobPost> search(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public JobPost addPost(@RequestBody JobPost post)
    {
        return repo.save(post);
    }
}
