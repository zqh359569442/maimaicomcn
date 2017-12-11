package maimaiweb;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import maimaiweb.com.maimai.dao.mapper.MmSelectProject;
import maimaiweb.com.maimai.dao.mapper.dto.TbItem;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPage {
    private ApplicationContext applicationContext;
    @Before
    public void setApplication(){
        applicationContext= new ClassPathXmlApplicationContext("classpath:resource/*.xml");
    }
    @Test
    public void test(){
        MmSelectProject mmSelectProject= applicationContext.getBean(MmSelectProject.class);
        List<TbItem> list = mmSelectProject.selectByExample();
        PageHelper.startPage(1,1);
        PageInfo<TbItem> pageInfo =new PageInfo<TbItem>(list);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPageNum());
    }
}
