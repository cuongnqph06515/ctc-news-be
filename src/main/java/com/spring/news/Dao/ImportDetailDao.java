package com.spring.news.Dao;

import com.spring.news.Entity.ImportDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ImportDetailDao extends JpaRepository<ImportDetail, Integer> {
    ImportDetail findByImportId(Integer id);
}
