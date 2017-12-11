package maimaiweb.com.maimai.controller.index;

import maimaiweb.ProductNoteEntity;
import maimaiweb.com.maimai.service.service.AddProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProjectAddController {

    @Autowired
    private AddProductService addProductService;
    /**
     * @describe 查询商品的所以类目，供用户选择
     * @return
     */
    @RequestMapping("/cat/list")
    @ResponseBody
    public List<ProductNoteEntity> addProject(@RequestParam(value = "id",defaultValue = "0") Long id){
        List<ProductNoteEntity> productNoteEntities = addProductService.selectProduct(id);
        return productNoteEntities;
    }
}
