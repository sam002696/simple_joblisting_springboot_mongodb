package com.sami.joblisting.repository;

import com.sami.joblisting.model.JobPost;

import java.util.List;

public interface SearchRepository {
   List<JobPost> findByText(String text);
}
