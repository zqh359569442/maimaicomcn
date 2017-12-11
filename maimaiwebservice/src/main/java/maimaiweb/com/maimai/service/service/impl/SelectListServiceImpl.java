package maimaiweb.com.maimai.service.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import maimaiweb.com.maimai.dao.mapper.MmSelectProject;
import maimaiweb.com.maimai.dao.mapper.dto.TbItem;
import maimaiweb.com.maimai.service.domain.PageResult;
import maimaiweb.com.maimai.service.service.SelectListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SelectListServiceImpl implements SelectListService {
    @Autowired
    public MmSelectProject selectProject;
    public PageResult searchList(Integer page, Integer rows) {
       PageHelper.startPage(1,1);
       List<TbItem> result =  selectProject.selectByExample();
       if(result==null &&result.size()<1){
           return new PageResult(0,null);
       }

        PageInfo<TbItem> pageInfo =new PageInfo<TbItem>(result);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(pageInfo.getList());
        return pageResult;
    }

    public void setPageInfo(Integer page, Integer rows){

    }

    public void setMmSelectProject(MmSelectProject selectProject) {
        this.selectProject = selectProject;
    }
}
