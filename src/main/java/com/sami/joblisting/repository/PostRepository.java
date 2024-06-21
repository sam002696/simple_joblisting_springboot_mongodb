package com.sami.joblisting.repository;

import com.sami.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<JobPost,String> {
}
