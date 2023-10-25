package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import com.example.easynotes.model.StoreDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    @Procedure(name = "getStoreList")
    List<StoreDetails> getStoreList();
}
