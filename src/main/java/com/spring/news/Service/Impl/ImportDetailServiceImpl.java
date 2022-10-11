package com.spring.news.Service.Impl;

import com.spring.news.Dao.ImportDetailDao;
import com.spring.news.Entity.Import;
import com.spring.news.Entity.ImportDetail;
import com.spring.news.Service.ImportDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportDetailServiceImpl implements ImportDetailService {

    @Autowired
    ImportDetailDao importDetailDao;

    @Override
    public List<ImportDetail> getAllImportDetail() {
        List<ImportDetail> importDetailList = importDetailDao.findAll();
        if(importDetailList == null || importDetailList.isEmpty()){
            throw new NullPointerException("DetailList list is empty!");
        }
        return importDetailList;
    }

    @Override
    public ImportDetail getImportDetailByImportId(Integer id) {
        ImportDetail importDetail = importDetailDao.findByImportId(id);
        return importDetail;
    }

    @Override
    public void addImportDetail(ImportDetail importDetail) {
        importDetailDao.save(importDetail);
    }

    @Override
    public void updateImportDetail(ImportDetail importDetail) {
        importDetailDao.save(importDetail);
    }

    @Override
    public void deleteImportDetail(Integer id) {
        importDetailDao.deleteById(id);
    }

}
