package com.example.testing.Repository;

import com.example.testing.Model.Android;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidRepository extends JpaRepository<Android,Integer> {
}
