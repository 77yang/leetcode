package com.yang7.translate;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface WordRepository extends PagingAndSortingRepository<TWords,Integer> {
    List<TWords> findByName(String name);
}
