package maimaiweb.com.maimai.service.service;

import maimaiweb.com.maimai.dao.mapper.dto.TbItem;
import maimaiweb.com.maimai.service.domain.PageResult;

import java.util.List;

public interface SelectListService {

    public PageResult searchList(Integer page, Integer rows);
}
