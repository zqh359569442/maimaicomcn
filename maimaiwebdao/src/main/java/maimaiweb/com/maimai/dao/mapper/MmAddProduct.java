package maimaiweb.com.maimai.dao.mapper;

import maimaiweb.com.maimai.dao.mapper.dto.TbItemCat;

import java.util.List;

public interface MmAddProduct {
    List<TbItemCat> selectProductNote(long id);
}
