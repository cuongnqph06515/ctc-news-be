package com.spring.news.Service.Impl;

import com.spring.news.Dao.ImportDao;
import com.spring.news.Entity.Category;
import com.spring.news.Entity.Import;
import com.spring.news.Service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportServiceImpl implements ImportService {
    @Autowired
    ImportDao importDao;

    @Override
    public List<Import> getAllImport() {
        List<Import> importList = importDao.findAll();
        if(importList == null || importList.isEmpty()){
            throw new NullPointerException("Import list is empty!");
        }
        return importList;
    }

    @Override
    public Import getImportById(Integer id) {
        Import anImport = importDao.findById(id).get();
        return anImport;
    }

    @Override
    public void addImport(Import anImport) {
        importDao.save(anImport);
    }

    @Override
    public void updateImport(Import anImport) {
        importDao.save(anImport);
    }

    @Override
    public void deleteImport(Integer id) {
        importDao.deleteById(id);
    }
}
