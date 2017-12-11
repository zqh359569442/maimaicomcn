package maimaiweb.com.maimai.controller.index;

import maimaiweb.com.maimai.service.domain.PageResult;
import maimaiweb.com.maimai.service.service.SelectListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowIndex {
    @Autowired
    private SelectListService selectListService;

    @RequestMapping("/")
    public String initIndex(){
        return  "index";
    }


    /**
     * 用于初始化所有页面
     * @param page 访问连接的最后一个
     * @return
     */
    @RequestMapping("/{page}")
    public String initPage(@PathVariable String page){
        System.out.println(page);
        return page;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public PageResult searchList(Integer page, Integer rows){
        PageResult pageResult = selectListService.searchList(page,rows);
        return pageResult;
    }
}
