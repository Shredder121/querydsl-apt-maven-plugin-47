package com.example.domain;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.querydsl.core.types.Predicate;

public interface TestRecordRepository extends JpaRepository<TestRecord, UUID> {
    TestRecord findBy(Predicate predicate);
}
