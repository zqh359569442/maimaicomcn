package maimaiweb.com.maimai.service.service.impl;

import maimaiweb.ProductNoteEntity;
import maimaiweb.com.maimai.dao.mapper.MmAddProduct;
import maimaiweb.com.maimai.dao.mapper.dto.TbItemCat;
import maimaiweb.com.maimai.service.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AddProductServiceImpl implements AddProductService {
    @Autowired
    private MmAddProduct mmAddProduct;
    public List<ProductNoteEntity> selectProduct(long id) {
        List<TbItemCat> tbItemCats =
                 mmAddProduct.selectProductNote(id);
        List<ProductNoteEntity> result = new ArrayList<ProductNoteEntity>();
        for (int i=0; i<tbItemCats.size(); i++){
            ProductNoteEntity productNoteEntity = new ProductNoteEntity();
            productNoteEntity.setId(tbItemCats.get(i).getId());
            productNoteEntity.setText(tbItemCats.get(i).getName());
            productNoteEntity.setStatus(tbItemCats.get(i).getIsParent()==0?"open":"closed");
            result.add(productNoteEntity);
        }
        return result;
    }
}
