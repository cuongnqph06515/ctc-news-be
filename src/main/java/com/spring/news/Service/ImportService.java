package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Import;

import java.util.List;

public interface ImportService {
    public List<Import> getAllImport();
    public Import getImportById(Integer id);
    public void addImport(Import anImport);
    public void updateImport(Import anImport);
    public void deleteImport(Integer id);
}
