package com.Faris.Controller;

import com.Faris.Domain.ComponentFile;
import com.Faris.Domain.ProjectFile;
import com.Faris.Service.ComponentFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
@RequestMapping(value = "/componentFile")

public class ComponentFileController {
    @Autowired
    private ComponentFileService cs;
    @RequestMapping(value = "/save")
    public ModelAndView save(HttpServletRequest request, MultipartFile uploadfile) throws Exception {
        System.out.println("springMVC文件上传");
        //上传的位置
        String path=request.getSession().getServletContext().getRealPath("/C_uploads/");
        //判断该文件夹是否已存在
        File file=new File(path);
        if(!file.exists()){
            file.mkdirs();
        }

        String filename=uploadfile.getOriginalFilename();
        uploadfile.transferTo(new File(path,filename));
        cs.save(filename);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("ComponentFileSuccess");
        List<ComponentFile> files=cs.findAll();
        mv.addObject("files",files);
        return mv;
    }
    @RequestMapping(value = "/findAll")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("ComponentFileSuccess");
        List<ComponentFile> files= cs.findAll();
        mv.addObject("files",files);
        return mv;
    }
}
