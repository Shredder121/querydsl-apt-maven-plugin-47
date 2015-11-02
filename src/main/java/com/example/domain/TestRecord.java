package com.example.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(onConstructor=@__(@Autowired))
public class TestRecord {

    @Id
    @GeneratedValue(generator = "test-uuidgen")
    @Column(columnDefinition = "uuid")
    private UUID id;

    private String notes;
}
