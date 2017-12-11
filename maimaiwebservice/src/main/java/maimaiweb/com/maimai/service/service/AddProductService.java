package maimaiweb.com.maimai.service.service;

import maimaiweb.ProductNoteEntity;

import java.util.List;

public interface AddProductService {
     List<ProductNoteEntity> selectProduct(long id);
}
