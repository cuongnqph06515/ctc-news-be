package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.ImportDetail;

import java.util.List;

public interface ImportDetailService {
    public List<ImportDetail> getAllImportDetail();
    public ImportDetail getImportDetailByImportId(Integer id);
    public void addImportDetail(ImportDetail importDetail);
    public void updateImportDetail(ImportDetail importDetail);
    public void deleteImportDetail(Integer id);
}
