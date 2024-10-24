package com.sample.springbootrest.repositories;

import com.sample.springbootrest.entities.JobPost;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository
    extends JpaRepository<JobPost, Integer>, JpaSpecificationExecutor<JobPost> {

  List<JobPost> findByPostProfileContainingOrPostDescContaining(
      String postProfile, String postDesc);
}
